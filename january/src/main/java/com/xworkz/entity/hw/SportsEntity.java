package com.xworkz.entity.hw;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sports")
@Data
@AllArgsConstructor
public class SportsEntity {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name ;

    @Column(name = "noOfPlayer")
    private  int noOfPlayer;

    @Column(name = "commity")
    private String commity;

    @Column(name = "country")
    private String country;
}
