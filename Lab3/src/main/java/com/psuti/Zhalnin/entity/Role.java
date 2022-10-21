package com.psuti.Zhalnin.entity;


import javax.persistence.*;
import java.io.*;
import java.util.UUID;

@Entity
@Table(name = "roles")
public class Role implements Serializable {
    @Id
    @Column(name= "name" , nullable = false)
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
