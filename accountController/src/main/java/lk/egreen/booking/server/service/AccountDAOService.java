package lk.egreen.booking.server.service;

import lk.egreen.booking.server.dao.AccountDAOController;
import lk.egreen.booking.server.entity.Account;
import lk.egreen.booking.server.utils.KeyGenrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Service
public class AccountDAOService {

    @Autowired
    private KeyGenrator keyGenrator;


    @Autowired
    private AccountDAOController accountDAOController;


    /**
     * Save Account
     *
     * @param account
     * @return
     */
    public String save(Account account) {
        String keyGenratorID = keyGenrator.getID(account.getName());
        account.setAccountId(keyGenratorID);
        return accountDAOController.create(account);
    }

    /**
     * @param limit
     * @param offeset
     * @return
     */
    public List<Account> getAccountListByLimitOffeset(int limit, int offeset) {
        return accountDAOController.getAll(offeset, limit, "name");
    }

    /**
     *
     * Get Account By ID
     *
     * @param accountId
     * @return
     */
    public Account getAccountById(String accountId) {
        return accountDAOController.read(accountId);
    }
}
