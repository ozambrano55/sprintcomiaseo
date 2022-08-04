package com.example.sprintcomiaseo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "v_Dan_Producto_Spring")
public class Producto {
    @Id
    @Column(name = "C_Producto_Terminado")
    private String cProductoTerminado;
    @Basic
    @Column(name = "N_Producto_Terminado")
    private String nProductoTerminado;
    @Basic
    @Column(name = "C_Despieze2")
    private String cDespieze2;
    @Basic
    @Column(name = "C_Tipo_Producto")
    private String cTipoProducto;
    @Basic
    @Column(name = "Foto")
    private String foto;
    @Basic
    @Column(name = "Precio")
    private Float precio;
    @Basic
    @Column(name = "Stock")
    private Float stock;
    @Basic
    @Column(name = "DescripcionProducto")
    private String descripcionProducto;

    @Column(name = "Categoria")
    private String categoria;

    @Basic
    @Column(name = "Vigencia")
    private Integer vigencia;
    @Basic
    @Column(name = "Recomendado")
    private Integer recomendado;


}
