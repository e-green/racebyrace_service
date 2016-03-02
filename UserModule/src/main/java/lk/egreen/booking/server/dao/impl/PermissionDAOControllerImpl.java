package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.dao.PermissionDAOController;
import lk.egreen.booking.server.entity.Permission;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */

@Repository
public class PermissionDAOControllerImpl extends AbstractDAOController<Permission,String> implements PermissionDAOController {
    public PermissionDAOControllerImpl() {
        super(Permission.class, String.class);
    }




    @Override
    public Integer removePermission(String permissionid) {
        Session session = getSession();
        String hql = "delete from Permission where permissionid= :permissionid";
        int i = session.createQuery(hql).setString("permissionid", permissionid).executeUpdate();
        return i;
    }
}
