package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.entity.Admin;
import lk.egreen.booking.server.dao.AdminDAOController;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */

@Repository
public class AdminDAOControllerImpl extends AbstractDAOController<Admin,String> implements AdminDAOController {
    public AdminDAOControllerImpl() {
        super(Admin.class, String.class);
    }


    @Override
    public Admin login(String username, String userPassword) {
        Criteria criteria = getSession().createCriteria(entityType);

        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", userPassword));


        if ( criteria.list().size()>0) {

            Admin o = (Admin) criteria.list().get(0);
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
    public Admin checkAccount(String username, String userPassword) {
        Criteria criteria = getSession().createCriteria(entityType);
        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", userPassword));
        if ( criteria.list().size()>0) {

            Admin o = (Admin) criteria.list().get(0);
            if (o != null) {
                return o;
            } else {
                return null;
            }

        }else {
            return null;
        }

    }
}
