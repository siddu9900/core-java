package com.xworkz.entity.hw;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Festival")
@Data
@AllArgsConstructor
public class FestivalEntity {


    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private String state;


    @Column(name = "country")
    private String country;

    @Column(name = "food")
    private  String food;
}
