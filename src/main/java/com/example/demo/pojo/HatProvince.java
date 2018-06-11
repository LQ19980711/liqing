package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 省表
 */
@Entity(name="hat_province")
public class HatProvince {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="provinceID")
    private String provinceID;

    @Column(name="province")
    private String province;
}
