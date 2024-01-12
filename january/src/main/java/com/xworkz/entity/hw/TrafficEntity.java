package com.xworkz.entity.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Traffic")
@Data
@AllArgsConstructor
public class TrafficEntity {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private  String location;

    @Column(name = "language")
    private  String language;

    @Column(name = "police")
    private String police;
}
