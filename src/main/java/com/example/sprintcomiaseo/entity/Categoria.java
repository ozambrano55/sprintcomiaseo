package com.example.sprintcomiaseo.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Categoria {
    @Id
    @Column(name = "C_Grupo")
    private String cGrupo;

    @Column(name = "Grupo")
    private String grupo;

    @Column(name = "Image")
    private String image;
}
