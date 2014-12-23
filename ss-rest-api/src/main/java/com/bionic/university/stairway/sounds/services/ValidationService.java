package com.bionic.university.stairway.sounds.services;

import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;

import javax.ejb.EJB;

/**
 * Created by root on 22.12.14.
 */
public class ValidationService {


    @EJB
    private static UserFacadeLocal userFacadeLocal;

    public static boolean validate(String token){
        System.out.println("from Validation Service Begin=================");
        User toBeValidated = userFacadeLocal.findByToken(token);

        if (toBeValidated.getRegistrationStatus() == User
                .UNCONFIRMED_REG_STATUS) {
            toBeValidated.setRegistrationStatus(User.CONFIRMED_REG_STATUS);
            userFacadeLocal.insertOrUpdate(toBeValidated);
            System.out.println("from Validation Service End=================");
            return true;
        }

        return false;
    }
}
