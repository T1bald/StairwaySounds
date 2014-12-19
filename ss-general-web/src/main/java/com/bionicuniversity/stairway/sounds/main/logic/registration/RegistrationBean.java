package com.bionicuniversity.stairway.sounds.main.logic.registration;

import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * @author Matvey Mitntitskyi
 * created at 19/12/2014
 * @version SNAPSHOT-1.0
 *
 */

@ManagedBean
@SessionScoped
public class RegistrationBean implements Serializable {

    @EJB
    private UserFacadeLocal userFacadeLocal;

    private String userEmail;
    private String userName;
    private String userPassword;
    private String userPasswordCheck;



    private String userTestMessage = "Login Bean Test Message. If you see" +
            " it," +
            " everything works properly!";

    public RegistrationBean() {
    }

    public String register(){

        User user = new User();

        if(!userEmail.equals(null) && !userPassword.equals(null) && userPassword
                .equals(userPasswordCheck)) {

            user.setEmail(userEmail);
            if (userName != null ) user.setUsername(userName);
            user.setPassword(userPassword);
            userFacadeLocal.insert(user);
            return "temp";
        }

        return "error";
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

    public String getUserMessage() {
        return userTestMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userTestMessage = userMessage;
    }
}
