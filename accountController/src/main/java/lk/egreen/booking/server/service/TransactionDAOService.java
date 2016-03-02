package lk.egreen.booking.server.service;

import lk.egreen.booking.server.dao.TransactionDAOController;
import lk.egreen.booking.server.dao.TransactionTypeDAOController;
import lk.egreen.booking.server.entity.Transaction;
import lk.egreen.booking.server.entity.TransactionType;
import lk.egreen.booking.server.utils.KeyGenrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Service
public class TransactionDAOService {


    @Autowired
    private KeyGenrator keyGenrator;

    @Autowired
    private TransactionDAOController transactionDAOController;

    @Autowired
    private TransactionTypeDAOController transactionTypeDAOController;


    /**
     * Transaction Type Create
     *
     * @param transactionType
     * @return
     */
    public String createType(TransactionType transactionType) {
        System.out.println(transactionType);
        return transactionTypeDAOController.create(transactionType);
    }

    /**
     * Transaction Type Create
     *
     * @param transaction
     * @return
     */
    public String createTransaction(Transaction transaction) {
        String id = keyGenrator.getID(transaction.getTransactionTime()+"");
        transaction.setTransactionId(id);
        return transactionDAOController.create(transaction);
    }


    /**
     * Get All Transactions by DateTime and Account
     *
     * @param accountId
     * @param dateTime
     * @return
     */
    public List<Transaction> getAccountTransactions(String accountId, Timestamp dateTime) {
        return transactionDAOController.getAllTransactionByAccountNameAndDateTime(accountId, dateTime);
    }

    public List<TransactionType> getAllByPagination(int limit, int offeset) {
        return transactionTypeDAOController.getAll(offeset, limit, "name");
    }
}
