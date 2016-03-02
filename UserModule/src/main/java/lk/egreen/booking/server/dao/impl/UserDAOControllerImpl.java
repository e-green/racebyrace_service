package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.dao.UserDAOController;
import lk.egreen.booking.server.entity.User;
import lk.egreen.booking.server.models.AllDetailModel;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */

@Repository
public class UserDAOControllerImpl extends AbstractDAOController<User,String> implements UserDAOController {
    public UserDAOControllerImpl() {
        super(User.class, String.class);
    }


    @Override
    public User login(String username, String userPassword) {
        Criteria criteria = getSession().createCriteria(entityType);

        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", userPassword));


        if ( criteria.list().size()>0) {

            User o = (User) criteria.list().get(0);
            if (o != null) {
                return o;
            } else {
                return null;
            }

        }else {
            return null;
        }

    }

    @Override
    public User checkAccount(String username, String userPassword) {
        Criteria criteria = getSession().createCriteria(entityType);
        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", userPassword));
        if ( criteria.list().size()>0) {

            User o = (User) criteria.list().get(0);
            if (o != null) {
                return o;
            } else {
                return null;
            }

        }else {
            return null;
        }

    }

    @Override
    public List<AllDetailModel> getAllDetails() {
        return null;
    }
}
