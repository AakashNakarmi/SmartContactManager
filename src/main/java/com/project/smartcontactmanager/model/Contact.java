package com.project.smartcontactmanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="CONTACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String name;
    private String secondName;

    private String work;
    private String email;
    private String phone;
    private String image;

    @Column(length = 1000)
    private String description;

    @ManyToOne
    private User user;





}
