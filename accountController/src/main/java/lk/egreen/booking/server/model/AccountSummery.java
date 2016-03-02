package lk.egreen.booking.server.model;

import lk.egreen.booking.server.entity.Account;
import lk.egreen.booking.server.entity.Transaction;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
public class AccountSummery {

    private Account account;
    private Timestamp dateTime;
    private List<Transaction> transactionList;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "AccountSummery{" +
                "account=" + account +
                ", dateTime=" + dateTime +
                ", transactionList=" + transactionList +
                '}';
    }
}
