package com.xworkz.CRUD;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TrafficFine")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrafficFineEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "violation")
    private String violation;

    @Column(name = "vehicalNo")
    private String vehicalNumber;

    @Column(name = "vehicalOwner")
    private String ownerName;

    @Column(name = "fine")
    private int fine;

}
