package com.xworkz.entity.hw;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Actor")
@Data
@AllArgsConstructor
public class ActorEntity {


    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "recentFilm")
    private  String recentFilm;

    @Column(name = "wife")
    private String wife;

    @Column(name = "amount")
    private double amount;
}
