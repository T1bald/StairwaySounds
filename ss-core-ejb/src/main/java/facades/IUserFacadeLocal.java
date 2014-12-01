package facades;

import com.bionicuniversity.stairway.sounds.entity.Users;

import javax.ejb.Local;
import javax.xml.registry.infomodel.User;
import java.util.Collection;

/**
 * Created by user on 01.12.2014.
 */
@Local
public interface IUserFacadeLocal {
    Users getByEmail(Users user);
    Users getByUsername(Users user);
}
