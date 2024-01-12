package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "super_hero")
@Data // Getter, Setter, NoArg
@AllArgsConstructor

public class SuperHeroEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "real_name")
    private  String realName;

    @Column(name = "fictional_name")
    private String fictionalName;

    @Column(name = "power")
    private String power;

    @Column(name = "country")
    private String country;

   @Column(name = "weakness")
    private String weakness;

}
