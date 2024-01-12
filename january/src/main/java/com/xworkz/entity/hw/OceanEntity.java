package com.xworkz.entity.hw;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ocean")
@Data
@AllArgsConstructor
public class OceanEntity {


    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "water")
    private String water;

    @Column(name = "country")
    private String country;


    @Column(name = "state")
    private String state;
}
