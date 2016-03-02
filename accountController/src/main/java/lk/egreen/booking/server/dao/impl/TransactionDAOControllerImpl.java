package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.dao.TransactionDAOController;
import lk.egreen.booking.server.entity.Transaction;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Repository
public class TransactionDAOControllerImpl extends AbstractDAOController<Transaction, String> implements TransactionDAOController {
    public TransactionDAOControllerImpl() {
        super(Transaction.class, String.class);
    }

    @Override
    public List<Transaction> getAllTransactionByAccountNameAndDateTime(String accountId, Timestamp dateTime) {

        Query query = getSession().createQuery("SELECT tr FROM Transaction tr WHERE tr.accountId=:accountId AND " +
                " DATE(tr.transactionTime) = DATE(:dateTime)");

        query.setString("accountId", accountId);
        query.setDate("dateTime", dateTime);

        return query.list();
    }
}
