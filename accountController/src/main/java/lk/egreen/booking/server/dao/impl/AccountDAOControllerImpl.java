package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.dao.AccountDAOController;
import lk.egreen.booking.server.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by dew on 2/28/16.
 */
@Repository
public class AccountDAOControllerImpl extends AbstractDAOController<Account, String> implements AccountDAOController {
    public AccountDAOControllerImpl() {
        super(Account.class, String.class);
    }
}
