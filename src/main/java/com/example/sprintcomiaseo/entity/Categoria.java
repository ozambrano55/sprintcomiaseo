package com.example.sprintcomiaseo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table
public class Categoria {
    @Id
    @Column(name = "C_Grupo")
    private String cGrupo;

    @Column(name = "Grupo")
    private String grupo;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productoList;


    @Column(name = "Image")
    private String image;
}
