package com.example.sprintcomiaseo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;
@Getter
@Setter
@Entity
@Table(name = "Inv_Subgrupos", schema = "dbo", catalog = "siinf_casalindap_ec")
public class InvSubgrupos {
    @Basic
    @Column(name = "C_Grupo", nullable = false, length = 2)
    private String cGrupo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "C_Subgrupo", nullable = false, length = 5)
    private String cSubgrupo;
    @Basic
    @Column(name = "D_Subgrupo", nullable = false, length = 60)
    private String dSubgrupo;
    @Basic
    @Column(name = "Utilizar_en", nullable = false, length = 1)
    private String utilizarEn;
    @Basic
    @Column(name = "C_P_Cuenta_Inv", nullable = false, length = 15)
    private String cPCuentaInv;
    @Basic
    @Column(name = "C_CentroCos", nullable = false)
    private Short cCentroCos;
    @Basic
    @Column(name = "C_P_Cta_Inv_Consigna", nullable = false, length = 15)
    private String cPCtaInvConsigna;
    @Basic
    @Column(name = "CostoVentas", nullable = false, length = 15)
    private String costoVentas;
    @Basic
    @Column(name = "IngxVentas", nullable = false, length = 15)
    private String ingxVentas;
    @Basic
    @Column(name = "IngxVentasCre", nullable = false, length = 15)
    private String ingxVentasCre;
    @Basic
    @Column(name = "IngxVentasCatDistri", nullable = false, length = 15)
    private String ingxVentasCatDistri;

}
