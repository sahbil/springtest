package com.sanalkurs.springtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * spring-test Created by Şahbil on 03/12/2017. Sanalkurs sahbil@sanalkurs.com
 */
@Entity
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adi;
    private String Soyad;

    // Constructorlar, getterler, setterler


    public Long getId () {
        return id;
    }
}
