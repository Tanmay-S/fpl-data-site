package com.ahc.fpldatasite.domain;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "team")
    private Fantasy fantasy;

    public Team() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fantasy getFantasy() {
        return fantasy;
    }

    public void setFantasy(Fantasy fantasy) {
        this.fantasy = fantasy;
    }
}
