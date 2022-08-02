package com.example.sprintcomiaseo.entity;

import javax.persistence.*;
import java.util.Objects;

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

    public String getcGrupo() {
        return cGrupo;
    }

    public void setcGrupo(String cGrupo) {
        this.cGrupo = cGrupo;
    }

    public String getcSubgrupo() {
        return cSubgrupo;
    }

    public void setcSubgrupo(String cSubgrupo) {
        this.cSubgrupo = cSubgrupo;
    }

    public String getdSubgrupo() {
        return dSubgrupo;
    }

    public void setdSubgrupo(String dSubgrupo) {
        this.dSubgrupo = dSubgrupo;
    }

    public String getUtilizarEn() {
        return utilizarEn;
    }

    public void setUtilizarEn(String utilizarEn) {
        this.utilizarEn = utilizarEn;
    }

    public String getcPCuentaInv() {
        return cPCuentaInv;
    }

    public void setcPCuentaInv(String cPCuentaInv) {
        this.cPCuentaInv = cPCuentaInv;
    }

    public Short getcCentroCos() {
        return cCentroCos;
    }

    public void setcCentroCos(Short cCentroCos) {
        this.cCentroCos = cCentroCos;
    }

    public String getcPCtaInvConsigna() {
        return cPCtaInvConsigna;
    }

    public void setcPCtaInvConsigna(String cPCtaInvConsigna) {
        this.cPCtaInvConsigna = cPCtaInvConsigna;
    }

    public String getCostoVentas() {
        return costoVentas;
    }

    public void setCostoVentas(String costoVentas) {
        this.costoVentas = costoVentas;
    }

    public String getIngxVentas() {
        return ingxVentas;
    }

    public void setIngxVentas(String ingxVentas) {
        this.ingxVentas = ingxVentas;
    }

    public String getIngxVentasCre() {
        return ingxVentasCre;
    }

    public void setIngxVentasCre(String ingxVentasCre) {
        this.ingxVentasCre = ingxVentasCre;
    }

    public String getIngxVentasCatDistri() {
        return ingxVentasCatDistri;
    }

    public void setIngxVentasCatDistri(String ingxVentasCatDistri) {
        this.ingxVentasCatDistri = ingxVentasCatDistri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvSubgrupos that = (InvSubgrupos) o;
        return Objects.equals(cGrupo, that.cGrupo) && Objects.equals(cSubgrupo, that.cSubgrupo) && Objects.equals(dSubgrupo, that.dSubgrupo) && Objects.equals(utilizarEn, that.utilizarEn) && Objects.equals(cPCuentaInv, that.cPCuentaInv) && Objects.equals(cCentroCos, that.cCentroCos) && Objects.equals(cPCtaInvConsigna, that.cPCtaInvConsigna) && Objects.equals(costoVentas, that.costoVentas) && Objects.equals(ingxVentas, that.ingxVentas) && Objects.equals(ingxVentasCre, that.ingxVentasCre) && Objects.equals(ingxVentasCatDistri, that.ingxVentasCatDistri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cGrupo, cSubgrupo, dSubgrupo, utilizarEn, cPCuentaInv, cCentroCos, cPCtaInvConsigna, costoVentas, ingxVentas, ingxVentasCre, ingxVentasCatDistri);
    }
}
