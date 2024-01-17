package com.xworkz.CRUD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopEntityCRUD {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "GST_No")
    private int gstNo;

    @Column(name = "Address")
    private String address;

    @Column(name = "Pincode")
    private int pincode;
}
