package com.xworkz.entity.hw;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transport")
@Data
@AllArgsConstructor

public class TransportEntity {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "state")
    private String state;
}
