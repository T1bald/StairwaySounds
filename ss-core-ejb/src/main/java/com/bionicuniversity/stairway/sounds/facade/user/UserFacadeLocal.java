package com.bionicuniversity.stairway.sounds.facade.user;

import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.GeneralFacadeLocal;

import javax.ejb.Local;

/**
 * Created by happy on 11/11/2014.
 */

@Local
public interface UserFacadeLocal extends GeneralFacadeLocal<User> {}

