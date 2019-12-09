package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    public Long id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    public Option option;

    public Long getId() {
        return id;
    }

    public Option getOption() {
        return option;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
