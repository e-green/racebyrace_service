package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.dao.TransactionTypeDAOController;
import lk.egreen.booking.server.entity.TransactionType;
import org.springframework.stereotype.Repository;

/**
 * Created by dew on 2/28/16.
 */
@Repository
public class TransactionTypeDAOControllerImpl extends AbstractDAOController<TransactionType, String> implements TransactionTypeDAOController {
    public TransactionTypeDAOControllerImpl() {
        super(TransactionType.class, String.class);
    }
}
