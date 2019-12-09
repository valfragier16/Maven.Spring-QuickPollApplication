package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Option {

    //TODO figure out why it doesn't like @Column annotation
    @SuppressWarnings("JpaDataSourceORMInspection")
    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    public Long id;
    @Column(name = "OPTION_VALUE")
    public String value;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
