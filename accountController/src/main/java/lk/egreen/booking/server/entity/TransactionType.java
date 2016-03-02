package lk.egreen.booking.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by dew on 2/28/16.
 */
@Entity
@Table(name = "transaction_type")
@JsonIgnoreProperties
public class TransactionType implements EntityInterface<String> {

    private String typeId;
    private String name;


    @Id
    @Column(name = "typeId")
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
        return getTypeId();
    }
}
