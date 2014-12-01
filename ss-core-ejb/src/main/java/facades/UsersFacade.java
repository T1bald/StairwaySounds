package facades;

import com.bionicuniversity.stairway.sounds.entity.Users;

import javax.ejb.Stateless;
import java.util.Collection;

/**
 * Created by user on 01.12.2014.
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> implements IUserFacadeLocal {

    public UsersFacade(){

    }

    public Users get(Users value) {
        String query = "SELECT * FROM users WHERE users.id_user=" + value.getIdUser()+ "";
        return super.getBy(query);
    }

    public Collection<Users> getAll() {
        String query = "SELECT * FROM users";
        return super.getAll(query);
    }

    public boolean update(Users value) {
        Users foundUser = getEntityManager().find(Users.class, value.getIdUser());
        if (foundUser != null){
            getEntityManager().getTransaction().begin();
            foundUser.setEmail(value.getEmail());
            foundUser.setPassHash(value.getPassHash());
            foundUser.setPassSalt(value.getPassSalt());
            foundUser.setRolesByRoleId(value.getRolesByRoleId());
            foundUser.setUsername(value.getUsername());
            getEntityManager().getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public Users getByEmail(Users user) {
        return getEntityManager().find(Users.class, user.getEmail());
    }

    @Override
    public Users getByUsername(Users user) {
        return getEntityManager().find(Users.class, user.getUsername());
    }
}
