package com.bionicuniversity.stairway.sounds.logic.login;


import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;
import com.bionicuniversity.stairway.sounds.logic.hash.PasswordHash;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

/**
 * @author Matvey Mitntitskyi
 * created at 19/12/2014
 * @version SNAPSHOT-1.0
 *
 */

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    @EJB
    private UserFacadeLocal userFacadeLocal;

    private User loggedUser;
    private String userEmail;
    private String userPassword;
    private boolean isLogged;

    public LoginBean() {
    }

    public String loginButton(){
        if (loginValidation(userEmail, userPassword)) return "cabinet";
            return "error";
    }

    public boolean loginValidation(String email, String password){
        User user = userFacadeLocal.findByEmail(email);

        String shaPassword = PasswordHash.sha256(password);
        if(user != null && shaPassword.equals(user.getPassword())){

            isLogged = true;
            loggedUser = user;
            return true;

        }

        isLogged = false;
        return false;
    }

    public User getInjectedUser() {
        return loggedUser;
    }

    public void setInjectedUser(User injectedUser) {
        this.loggedUser = injectedUser;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean isLogged) {
        this.isLogged = isLogged;
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

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
