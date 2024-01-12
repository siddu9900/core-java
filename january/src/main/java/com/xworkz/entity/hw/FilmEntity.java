package com.xworkz.entity.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "film")
@Data
@AllArgsConstructor
public class FilmEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "language")
    private String Language;

    @Column(name = "producer")
    private String producer;

    @Column(name = "amount")
    private String amout;

}
