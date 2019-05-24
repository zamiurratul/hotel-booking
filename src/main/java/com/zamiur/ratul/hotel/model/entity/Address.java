package com.zamiur.ratul.hotel.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ADDRESS_LINE_1", length = 500)
    private String addressLine1;

    @Column(name = "ADDRESS_LINE_2", length = 500)
    private String addressLine2;

    @Column(name = "POST_CODE")
    private String postCode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

}
