package com.example.sprintcomiaseo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Funcionario {
    @Id
    @Column(name = "C_Funcionario", length = 6)
    private String cFuncionario;
    @Column(name="Funcionario",length = 6)
    private String funcionario;
    @Column(name = "C_punto_Venta",length = 50)
    private Integer cPuntoVenta;
    @Column(name ="Punto", length = 50)
    private String punto;
    @Column(name="C_bodega", length = 5)
    private Integer cBodega;
    @Column(name ="Cod_Pedidos")
    private Integer codPedidos;
    @Column(name ="Clave_Funcionario",length = 100)
    private String claveFuncionario;
   /* @OneToOne
    private Cliente cliente;
*/
}
