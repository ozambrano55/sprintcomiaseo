package com.example.sprintcomiaseo.entity;


import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String nombre;
    @OneToOne
    private DocumentoAlmacenado foto;
    @Column
    private Double precio;
    @Column
    private int stock;
    @Column(length = 500)
    private String descripcionPlatillo;
    @OneToOne
    private InvSubgrupos categoria;
    @Column
    private boolean vigencia;
    @Column
    private boolean recomendado;


}
