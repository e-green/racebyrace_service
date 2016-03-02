package lk.egreen.booking.server.service;

import lk.egreen.booking.server.entity.Account;
import lk.egreen.booking.server.entity.Transaction;
import lk.egreen.booking.server.model.AccountSummery;
import lk.egreen.booking.server.model.AccountSummeryRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Service
public class AccountSummeryService {

    @Autowired
    private TransactionDAOService transactionDAOService;

    @Autowired
    private AccountDAOService accountDAOService;


    public AccountSummery getAccountSummery(AccountSummeryRequestModel accountSummeryRequestModel) {
        List<Transaction> transactionList =
                transactionDAOService.getAccountTransactions(accountSummeryRequestModel.getAccountId(), accountSummeryRequestModel.getDateTime());

        AccountSummery accountSummery = new AccountSummery();

        Account account = accountDAOService.getAccountById(accountSummeryRequestModel.getAccountId());


        accountSummery.setAccount(account);
        accountSummery.setDateTime(accountSummeryRequestModel.getDateTime());
        accountSummery.setTransactionList(transactionList);

        return accountSummery;
    }
}
