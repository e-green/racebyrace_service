package lk.egreen.booking.server.model;

import java.sql.Timestamp;

/**
 * Created by dew on 2/28/16.
 */
public class AccountSummeryRequestModel {
    private String accountId;
    private Timestamp dateTime;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "AccountSummeryRequestModel{" +
                "accountId='" + accountId + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
