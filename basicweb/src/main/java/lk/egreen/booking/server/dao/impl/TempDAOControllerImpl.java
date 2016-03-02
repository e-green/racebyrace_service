package lk.egreen.booking.server.dao.impl;

import lk.egreen.booking.server.dao.TempDataDAOController;
import lk.egreen.booking.server.entity.Tempdata;
import org.springframework.stereotype.Repository;

/**
 * Created by dewmal on 7/31/14.
 */
@Repository
public class TempDAOControllerImpl extends AbstractDAOController<Tempdata, String> implements TempDataDAOController {

    public TempDAOControllerImpl() {
        super(Tempdata.class, String.class);
    }
}
