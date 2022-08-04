package com.example.sprintcomiaseo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
@Getter
@Setter
@Entity
//@Table(name = "Fac_Pedidos_Deta", schema = "dbo", catalog = "siinf_casalindap_ec")
@Table(name = "Fac_Pedidos_Deta")
public class FacPedidosDeta implements Serializable {

@Id
    @Column(name = "C_Empresa", nullable = false)
    private Integer cEmpresa;


    @Column(name = "N_Orden_Pedido", nullable = false, length = 15)
    private String nOrdenPedido;
    @Basic
    @Column(name = "T_Elemento", nullable = false, length = 3)
    private String tElemento;
    @Basic
    @Column(name = "C_Item", nullable = false, length = 30)
    private String cItem;
    @Basic
    @Column(name = "C_Despieze2", nullable = false, length = 5)
    private String cDespieze2;
    @Basic
    @Column(name = "V_Cantidad_Orden", nullable = false, precision = 0)
    private Double vCantidadOrden;
    @Basic
    @Column(name = "V_Valor_Und", nullable = false, precision = 0)
    private Double vValorUnd;
    @Basic
    @Column(name = "V_Por_Descuento", nullable = false, precision = 0)
    private Double vPorDescuento;
    @Basic
    @Column(name = "V_Por_Impuesto", nullable = false, precision = 0)
    private Double vPorImpuesto;
    @Basic
    @Column(name = "F_Recep_Espe_Item", nullable = false)
    private Date fRecepEspeItem;
    @Basic
    @Column(name = "F_Recep_Real_Item", nullable = true)
    private Date fRecepRealItem;
    @Basic
    @Column(name = "V_Cant_Recepcion", nullable = false, precision = 0)
    private Double vCantRecepcion;
    @Basic
    @Column(name = "V_Cant_Devolucion", nullable = false, precision = 0)
    private Double vCantDevolucion;
    @Basic
    @Column(name = "C_Und_Venta", nullable = false, length = 6)
    private String cUndVenta;
    @Basic
    @Column(name = "Cant_Desp1", nullable = false, precision = 0)
    private Double cantDesp1;
    @Basic
    @Column(name = "Cant_Desp2", nullable = false, precision = 0)
    private Double cantDesp2;
    @Basic
    @Column(name = "Cant_Desp3", nullable = false, precision = 0)
    private Double cantDesp3;
    @Basic
    @Column(name = "Cant_Desp4", nullable = false, precision = 0)
    private Double cantDesp4;
    @Basic
    @Column(name = "Cant_Desp5", nullable = false, precision = 0)
    private Double cantDesp5;
    @Basic
    @Column(name = "Cant_Desp6", nullable = false, precision = 0)
    private Double cantDesp6;
    @Basic
    @Column(name = "Cant_Desp7", nullable = false, precision = 0)
    private Double cantDesp7;
    @Basic
    @Column(name = "Cant_Desp8", nullable = false, precision = 0)
    private Double cantDesp8;
    @Basic
    @Column(name = "Cant_Desp9", nullable = false, precision = 0)
    private Double cantDesp9;
    @Basic
    @Column(name = "Cant_Desp10", nullable = false, precision = 0)
    private Double cantDesp10;
    @Basic
    @Column(name = "Cant_Remis1", nullable = false, precision = 0)
    private Double cantRemis1;
    @Basic
    @Column(name = "Cant_Remis2", nullable = false, precision = 0)
    private Double cantRemis2;
    @Basic
    @Column(name = "Cant_Remis3", nullable = false, precision = 0)
    private Double cantRemis3;
    @Basic
    @Column(name = "Cant_Remis4", nullable = false, precision = 0)
    private Double cantRemis4;
    @Basic
    @Column(name = "Cant_Remis5", nullable = false, precision = 0)
    private Double cantRemis5;
    @Basic
    @Column(name = "Cant_Remis6", nullable = false, precision = 0)
    private Double cantRemis6;
    @Basic
    @Column(name = "Cant_Remis7", nullable = false, precision = 0)
    private Double cantRemis7;
    @Basic
    @Column(name = "Cant_Remis8", nullable = false, precision = 0)
    private Double cantRemis8;
    @Basic
    @Column(name = "Cant_Remis9", nullable = false, precision = 0)
    private Double cantRemis9;
    @Basic
    @Column(name = "Cant_Remis10", nullable = false, precision = 0)
    private Double cantRemis10;
    @Basic
    @Column(name = "Cant_Devol1", nullable = false, precision = 0)
    private Double cantDevol1;
    @Basic
    @Column(name = "Cant_Devol2", nullable = false, precision = 0)
    private Double cantDevol2;
    @Basic
    @Column(name = "Cant_Devol3", nullable = false, precision = 0)
    private Double cantDevol3;
    @Basic
    @Column(name = "Cant_Devol4", nullable = false, precision = 0)
    private Double cantDevol4;
    @Basic
    @Column(name = "Cant_Devol5", nullable = false, precision = 0)
    private Double cantDevol5;
    @Basic
    @Column(name = "Cant_Devol6", nullable = false, precision = 0)
    private Double cantDevol6;
    @Basic
    @Column(name = "Cant_Devol7", nullable = false, precision = 0)
    private Double cantDevol7;
    @Basic
    @Column(name = "Cant_Devol8", nullable = false, precision = 0)
    private Double cantDevol8;
    @Basic
    @Column(name = "Cant_Devol9", nullable = false, precision = 0)
    private Double cantDevol9;
    @Basic
    @Column(name = "Cant_Devol10", nullable = false, precision = 0)
    private Double cantDevol10;
    @Basic
    @Column(name = "V_Por_Descuento_Pie", nullable = false, precision = 0)
    private Double vPorDescuentoPie;
    @Basic
    @Column(name = "Vlr_Bruto", nullable = false, precision = 0)
    private Double vlrBruto;
    @Basic
    @Column(name = "Vlr_Dcto", nullable = false, precision = 0)
    private Double vlrDcto;
    @Basic
    @Column(name = "Vlr_Neto", nullable = false, precision = 0)
    private Double vlrNeto;
    @Basic
    @Column(name = "Vlr_Dcto_Pie", nullable = false, precision = 0)
    private Double vlrDctoPie;
    @Basic
    @Column(name = "Vlr_Neto_Final", nullable = false, precision = 0)
    private Double vlrNetoFinal;
    @Basic
    @Column(name = "Vlr_Impto", nullable = false, precision = 0)
    private Double vlrImpto;
    @Basic
    @Column(name = "Vlr_Total", nullable = false, precision = 0)
    private Double vlrTotal;
    @Basic
    @Column(name = "C_Bodega", nullable = false, length = 5)
    private String cBodega;
    @Basic
    @Column(name = "Estado_Disponible", nullable = false, length = 1)
    private String estadoDisponible;
    @Basic
    @Column(name = "C_Cat_Activo", nullable = true)
    private Integer cCatActivo;
    @Basic
    @Column(name = "C_Cat_Item", nullable = true)
    private Integer cCatItem;
    @Basic
    @Column(name = "V_Pvp", nullable = true, precision = 0)
    private Double vPvp;

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacPedidosDeta that = (FacPedidosDeta) o;
        return Objects.equals(cEmpresa, that.cEmpresa) && Objects.equals(nOrdenPedido, that.nOrdenPedido) && Objects.equals(tElemento, that.tElemento) && Objects.equals(cItem, that.cItem) && Objects.equals(cDespieze2, that.cDespieze2) && Objects.equals(vCantidadOrden, that.vCantidadOrden) && Objects.equals(vValorUnd, that.vValorUnd) && Objects.equals(vPorDescuento, that.vPorDescuento) && Objects.equals(vPorImpuesto, that.vPorImpuesto) && Objects.equals(fRecepEspeItem, that.fRecepEspeItem) && Objects.equals(fRecepRealItem, that.fRecepRealItem) && Objects.equals(vCantRecepcion, that.vCantRecepcion) && Objects.equals(vCantDevolucion, that.vCantDevolucion) && Objects.equals(cUndVenta, that.cUndVenta) && Objects.equals(cantDesp1, that.cantDesp1) && Objects.equals(cantDesp2, that.cantDesp2) && Objects.equals(cantDesp3, that.cantDesp3) && Objects.equals(cantDesp4, that.cantDesp4) && Objects.equals(cantDesp5, that.cantDesp5) && Objects.equals(cantDesp6, that.cantDesp6) && Objects.equals(cantDesp7, that.cantDesp7) && Objects.equals(cantDesp8, that.cantDesp8) && Objects.equals(cantDesp9, that.cantDesp9) && Objects.equals(cantDesp10, that.cantDesp10) && Objects.equals(cantRemis1, that.cantRemis1) && Objects.equals(cantRemis2, that.cantRemis2) && Objects.equals(cantRemis3, that.cantRemis3) && Objects.equals(cantRemis4, that.cantRemis4) && Objects.equals(cantRemis5, that.cantRemis5) && Objects.equals(cantRemis6, that.cantRemis6) && Objects.equals(cantRemis7, that.cantRemis7) && Objects.equals(cantRemis8, that.cantRemis8) && Objects.equals(cantRemis9, that.cantRemis9) && Objects.equals(cantRemis10, that.cantRemis10) && Objects.equals(cantDevol1, that.cantDevol1) && Objects.equals(cantDevol2, that.cantDevol2) && Objects.equals(cantDevol3, that.cantDevol3) && Objects.equals(cantDevol4, that.cantDevol4) && Objects.equals(cantDevol5, that.cantDevol5) && Objects.equals(cantDevol6, that.cantDevol6) && Objects.equals(cantDevol7, that.cantDevol7) && Objects.equals(cantDevol8, that.cantDevol8) && Objects.equals(cantDevol9, that.cantDevol9) && Objects.equals(cantDevol10, that.cantDevol10) && Objects.equals(vPorDescuentoPie, that.vPorDescuentoPie) && Objects.equals(vlrBruto, that.vlrBruto) && Objects.equals(vlrDcto, that.vlrDcto) && Objects.equals(vlrNeto, that.vlrNeto) && Objects.equals(vlrDctoPie, that.vlrDctoPie) && Objects.equals(vlrNetoFinal, that.vlrNetoFinal) && Objects.equals(vlrImpto, that.vlrImpto) && Objects.equals(vlrTotal, that.vlrTotal) && Objects.equals(cBodega, that.cBodega) && Objects.equals(estadoDisponible, that.estadoDisponible) && Objects.equals(cCatActivo, that.cCatActivo) && Objects.equals(cCatItem, that.cCatItem) && Objects.equals(vPvp, that.vPvp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cEmpresa, nOrdenPedido, tElemento, cItem, cDespieze2, vCantidadOrden, vValorUnd, vPorDescuento, vPorImpuesto, fRecepEspeItem, fRecepRealItem, vCantRecepcion, vCantDevolucion, cUndVenta, cantDesp1, cantDesp2, cantDesp3, cantDesp4, cantDesp5, cantDesp6, cantDesp7, cantDesp8, cantDesp9, cantDesp10, cantRemis1, cantRemis2, cantRemis3, cantRemis4, cantRemis5, cantRemis6, cantRemis7, cantRemis8, cantRemis9, cantRemis10, cantDevol1, cantDevol2, cantDevol3, cantDevol4, cantDevol5, cantDevol6, cantDevol7, cantDevol8, cantDevol9, cantDevol10, vPorDescuentoPie, vlrBruto, vlrDcto, vlrNeto, vlrDctoPie, vlrNetoFinal, vlrImpto, vlrTotal, cBodega, estadoDisponible, cCatActivo, cCatItem, vPvp);
    }


 */

}
