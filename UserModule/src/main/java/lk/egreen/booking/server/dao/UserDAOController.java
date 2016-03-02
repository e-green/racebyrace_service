package lk.egreen.booking.server.dao;

import lk.egreen.booking.server.entity.User;
import lk.egreen.booking.server.models.AllDetailModel;

import java.util.List;

/**
 * Created by Pramoda Fernando on 1/14/2015.
 */
public interface UserDAOController extends DAOController<User,String> {

    User login(String username, String userPassword);

    User checkAccount(String username, String userPassword);

    List<AllDetailModel> getAllDetails();
}
