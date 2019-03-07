package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Entity
@Table(name="test")
public class User implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user")
    private String user;
    @Column(name = "age")
    private int age;

}
