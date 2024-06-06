package com.example.msatutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Nums {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int num1;

    private int num2;
}
