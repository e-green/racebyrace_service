package lk.egreen.booking.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by dew on 2/28/16.
 */
@Entity
@Table(name = "account")
@JsonIgnoreProperties
public class Account implements EntityInterface<String> {

    private String accountId;
    private String name;

    @Id
    @Column(name = "accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Transient
    public String getId() {
        return getAccountId();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
