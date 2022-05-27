package com.example.sprintcomiaseo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Data
@Entity
@Getter
@Setter
public class Categoria {
    @Id
    private int c_grupo;
    @Column
    private String grupo;
    @Column
    private String image;
}
