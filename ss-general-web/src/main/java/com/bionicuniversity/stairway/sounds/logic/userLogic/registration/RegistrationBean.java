package com.bionicuniversity.stairway.sounds.logic.userLogic.registration;

import com.bionicuniversity.stairway.sounds.entity.Role;
import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.role.RoleFacadeLocal;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;
import com.bionicuniversity.stairway.sounds.logic.hash.PasswordHash;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

/**
 * @author Matvey Mitntitskyi
 * created at 19/12/2014
 * @version SNAPSHOT-1.0
 *
 */

@ManagedBean
@SessionScoped
public class RegistrationBean implements Serializable {

    private static final Integer USER_ROLE_ID = 2;
    private static final String DEFAULT_URL_PATTERN =
            "http://localhost:8080/user/validate/";

    @EJB
    private UserFacadeLocal userFacadeLocal;
    @EJB
    private RoleFacadeLocal roleFacadeLocal;

    private String userEmail;
    private String userName;
    private String userPassword;
    private String userPasswordCheck;
//    private PasswordHash passwordHash;

    public RegistrationBean() {
    }

    public String register(){

        User user = new User();

        if(!userEmail.equals(null) && !userPassword.equals(null) && userPassword
                .equals(userPasswordCheck)) {

            user.setEmail(userEmail);
            if (userName != null ) user.setUsername(userName);
            user.setPassword(userPassword = PasswordHash.sha256(userPassword));
            List<Role> roleList = new LinkedList<Role>();
            roleList.add(getUserRole());
            user.setRole(roleList);
            save(user);
            sendConfirmationEmail(user);

            return "temp";
        }

        return "error";
    }

    public void save(User user){

        /*Generate validation token and write it to users entity*/
        user.setToken(UUID.randomUUID().toString());
        user.setRegistrationStatus(user.UNCONFIRMED_REG_STATUS);
        userFacadeLocal.insert(user);

    }

    public boolean sendConfirmationEmail(User user) {
        String emailTo = user.getEmail();
        final String emailFrom = "stairway.sounds@gmail.com";
        final String pass = "Stairwaypasswddddd2014";

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        Session session = Session.getInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(emailFrom, pass);
                    }
                });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailFrom));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            message.setSubject("Account Confirmation");
            message.setText(""
                    + "Thank you for registration at http://stairway" +
                    "sounds.ua \n"
                    + "To complete registration, please, click on the confirmation link below. \n"
                    + DEFAULT_URL_PATTERN + user.getToken() + "\n"
                    + "Please note, that this email doesn't need to be " +
                    "replied. If you didn't register at " +
                    "http://stairwaysounds" +
                    ".ua " +
                    "please ignore this message");
            Transport.send(message);
            return true;

        } catch (MessagingException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public void validate(String token){
        User toBeValidated = userFacadeLocal.findByToken(token);
        if (toBeValidated.getRegistrationStatus() == User.UNCONFIRMED_REG_STATUS){
            toBeValidated.setRegistrationStatus(User.CONFIRMED_REG_STATUS);
            userFacadeLocal.insertOrUpdate(toBeValidated);
        }
    }

    private Role getUserRole() {
        return roleFacadeLocal.findById(USER_ROLE_ID);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswordCheck() {
        return userPasswordCheck;
    }

    public void setUserPasswordCheck(String userPasswordCheck) {
        this.userPasswordCheck = userPasswordCheck;
    }

}
