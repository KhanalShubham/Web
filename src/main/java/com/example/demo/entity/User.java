package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="users")
public class User {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_setup_seq_gen")
    @SequenceGenerator(name = "users_setup_seq_gen", sequenceName = "users_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "fullName",nullable = false,length = 100)
    private String name;



}
