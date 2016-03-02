package lk.egreen.booking.server.dao;

import lk.egreen.booking.server.entity.Transaction;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
public interface TransactionDAOController extends DAOController<Transaction, String> {


    /**
     * @param accountId
     * @param dateTime
     * @return
     */
    List<Transaction> getAllTransactionByAccountNameAndDateTime(String accountId, Timestamp dateTime);
}
