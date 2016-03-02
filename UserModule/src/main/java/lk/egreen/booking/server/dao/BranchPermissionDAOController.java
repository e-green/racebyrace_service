package lk.egreen.booking.server.dao;

import lk.egreen.booking.server.entity.BranchPermission;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */
public interface BranchPermissionDAOController extends DAOController<BranchPermission,String> {



    Integer removePermission(String permissionId);

    Boolean checkBranchPermission(String adminid, String branchId);
}
