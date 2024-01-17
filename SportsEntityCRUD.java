package com.xworkz.CRUD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sport")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportsEntityCRUD {
    @Id
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private String name;

    @Column(name = "originCountry")
    private String originCountry;

    @Column(name = "CaptainName")
    private String captainName;

    @Column(name = "totalPlayer")
    private int totalPlayer;
}
