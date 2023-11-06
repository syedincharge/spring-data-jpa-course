package com.springdatajpa.springboot.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "jpa_student")
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;


    @OneToMany(mappedBy = "student", cascade =  CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();

}
