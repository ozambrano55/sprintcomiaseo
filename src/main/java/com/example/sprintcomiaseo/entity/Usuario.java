package com.example.sprintcomiaseo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 500)
    private String email;
    @Column(length = 20)
    private String clave;
    @Column
    private boolean vigencia;
    @OneToOne
    private Cliente cliente;

}
