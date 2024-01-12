package com.xworkz.entity.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Shop")
@Data
@AllArgsConstructor
public class ShopEntity {


    @Id
    @Column(name = "Id")
    private int id;








    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "email")
    private String email;

    @Column(name = "district")
    private String district;
}
