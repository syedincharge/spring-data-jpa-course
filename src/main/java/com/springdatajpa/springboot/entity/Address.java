package com.springdatajpa.springboot.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "jpa_address")
public class Address {

    @Id
    private int addressId;
    private String street;
    private String city;
    private String country;

     @ManyToOne
     @JoinColumn(name = "student_id")
    private Student student;

}
