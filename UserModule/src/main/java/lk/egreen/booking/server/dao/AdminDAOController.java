package lk.egreen.booking.server.dao;

import lk.egreen.booking.server.entity.Admin;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */
public interface AdminDAOController extends DAOController<Admin,String> {

    Admin login(String username, String userPassword);

    Admin checkAccount(String username, String userPassword);

}
