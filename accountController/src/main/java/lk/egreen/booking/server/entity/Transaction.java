package lk.egreen.booking.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by dew on 2/28/16.
 */
@Entity
@Table
@JsonIgnoreProperties
public class Transaction implements EntityInterface<String> {

    @Id
    @Column(name = "transactionId")
    private String transactionId;
    private String accountId;
    private String transactionType;
    private Timestamp transactionTime;
    private BigDecimal amount;
    private boolean isIncome;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        this.transactionTime = transactionTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean getIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
    }

    @Override
    @Transient
    public String getId() {
        return getTransactionId();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionTime=" + transactionTime +
                ", amount=" + amount +
                ", isIncome=" + isIncome +
                '}';
    }
}
