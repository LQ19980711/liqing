package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="hat_city")
public class HatCity {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="cityID")
    private String cityID;

}
