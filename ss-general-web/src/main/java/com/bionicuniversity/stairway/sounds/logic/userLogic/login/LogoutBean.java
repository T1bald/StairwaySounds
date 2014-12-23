package com.bionicuniversity.stairway.sounds.logic.userLogic.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Matvey Mitnitskyi
 * 23.12.14.
 *
 */

@ManagedBean
@RequestScoped
public class LogoutBean implements Serializable{

    public LogoutBean() {

    }

    public String logout() {

            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            return "/index.xhtml?faces-redirect=true";

    }
}
