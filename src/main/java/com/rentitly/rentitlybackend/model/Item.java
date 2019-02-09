package com.rentitly.rentitlybackend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "item")
public class Item {

    @Id
    @Column(name="id")
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "location")
    private String location;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "imageurl")
    private String imageurl;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="recommendations",
            joinColumns = @JoinColumn( name="id"),
            inverseJoinColumns = @JoinColumn( name="recommendationid")
    )
    List<Item> recommendations;
}
