package com.psuti.Zhalnin.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producer")
public class Direction implements Serializable {

    @Id
    @Column (name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
