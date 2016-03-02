package lk.egreen.booking.server.dao;

import lk.egreen.booking.server.entity.Permission;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */
public interface PermissionDAOController extends DAOController<Permission,String> {



    Integer removePermission(String permissionId);
}
