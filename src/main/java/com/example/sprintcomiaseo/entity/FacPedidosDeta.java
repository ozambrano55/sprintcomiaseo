package com.example.sprintcomiaseo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

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

    public Integer getcEmpresa() {
        return cEmpresa;
    }

    public void setcEmpresa(Integer cEmpresa) {
        this.cEmpresa = cEmpresa;
    }

    public String getnOrdenPedido() {
        return nOrdenPedido;
    }

    public void setnOrdenPedido(String nOrdenPedido) {
        this.nOrdenPedido = nOrdenPedido;
    }

    public String gettElemento() {
        return tElemento;
    }

    public void settElemento(String tElemento) {
        this.tElemento = tElemento;
    }

    public String getcItem() {
        return cItem;
    }

    public void setcItem(String cItem) {
        this.cItem = cItem;
    }

    public String getcDespieze2() {
        return cDespieze2;
    }

    public void setcDespieze2(String cDespieze2) {
        this.cDespieze2 = cDespieze2;
    }

    public Double getvCantidadOrden() {
        return vCantidadOrden;
    }

    public void setvCantidadOrden(Double vCantidadOrden) {
        this.vCantidadOrden = vCantidadOrden;
    }

    public Double getvValorUnd() {
        return vValorUnd;
    }

    public void setvValorUnd(Double vValorUnd) {
        this.vValorUnd = vValorUnd;
    }

    public Double getvPorDescuento() {
        return vPorDescuento;
    }

    public void setvPorDescuento(Double vPorDescuento) {
        this.vPorDescuento = vPorDescuento;
    }

    public Double getvPorImpuesto() {
        return vPorImpuesto;
    }

    public void setvPorImpuesto(Double vPorImpuesto) {
        this.vPorImpuesto = vPorImpuesto;
    }

    public Date getfRecepEspeItem() {
        return fRecepEspeItem;
    }

    public void setfRecepEspeItem(Date fRecepEspeItem) {
        this.fRecepEspeItem = fRecepEspeItem;
    }

    public Date getfRecepRealItem() {
        return fRecepRealItem;
    }

    public void setfRecepRealItem(Date fRecepRealItem) {
        this.fRecepRealItem = fRecepRealItem;
    }

    public Double getvCantRecepcion() {
        return vCantRecepcion;
    }

    public void setvCantRecepcion(Double vCantRecepcion) {
        this.vCantRecepcion = vCantRecepcion;
    }

    public Double getvCantDevolucion() {
        return vCantDevolucion;
    }

    public void setvCantDevolucion(Double vCantDevolucion) {
        this.vCantDevolucion = vCantDevolucion;
    }

    public String getcUndVenta() {
        return cUndVenta;
    }

    public void setcUndVenta(String cUndVenta) {
        this.cUndVenta = cUndVenta;
    }

    public Double getCantDesp1() {
        return cantDesp1;
    }

    public void setCantDesp1(Double cantDesp1) {
        this.cantDesp1 = cantDesp1;
    }

    public Double getCantDesp2() {
        return cantDesp2;
    }

    public void setCantDesp2(Double cantDesp2) {
        this.cantDesp2 = cantDesp2;
    }

    public Double getCantDesp3() {
        return cantDesp3;
    }

    public void setCantDesp3(Double cantDesp3) {
        this.cantDesp3 = cantDesp3;
    }

    public Double getCantDesp4() {
        return cantDesp4;
    }

    public void setCantDesp4(Double cantDesp4) {
        this.cantDesp4 = cantDesp4;
    }

    public Double getCantDesp5() {
        return cantDesp5;
    }

    public void setCantDesp5(Double cantDesp5) {
        this.cantDesp5 = cantDesp5;
    }

    public Double getCantDesp6() {
        return cantDesp6;
    }

    public void setCantDesp6(Double cantDesp6) {
        this.cantDesp6 = cantDesp6;
    }

    public Double getCantDesp7() {
        return cantDesp7;
    }

    public void setCantDesp7(Double cantDesp7) {
        this.cantDesp7 = cantDesp7;
    }

    public Double getCantDesp8() {
        return cantDesp8;
    }

    public void setCantDesp8(Double cantDesp8) {
        this.cantDesp8 = cantDesp8;
    }

    public Double getCantDesp9() {
        return cantDesp9;
    }

    public void setCantDesp9(Double cantDesp9) {
        this.cantDesp9 = cantDesp9;
    }

    public Double getCantDesp10() {
        return cantDesp10;
    }

    public void setCantDesp10(Double cantDesp10) {
        this.cantDesp10 = cantDesp10;
    }

    public Double getCantRemis1() {
        return cantRemis1;
    }

    public void setCantRemis1(Double cantRemis1) {
        this.cantRemis1 = cantRemis1;
    }

    public Double getCantRemis2() {
        return cantRemis2;
    }

    public void setCantRemis2(Double cantRemis2) {
        this.cantRemis2 = cantRemis2;
    }

    public Double getCantRemis3() {
        return cantRemis3;
    }

    public void setCantRemis3(Double cantRemis3) {
        this.cantRemis3 = cantRemis3;
    }

    public Double getCantRemis4() {
        return cantRemis4;
    }

    public void setCantRemis4(Double cantRemis4) {
        this.cantRemis4 = cantRemis4;
    }

    public Double getCantRemis5() {
        return cantRemis5;
    }

    public void setCantRemis5(Double cantRemis5) {
        this.cantRemis5 = cantRemis5;
    }

    public Double getCantRemis6() {
        return cantRemis6;
    }

    public void setCantRemis6(Double cantRemis6) {
        this.cantRemis6 = cantRemis6;
    }

    public Double getCantRemis7() {
        return cantRemis7;
    }

    public void setCantRemis7(Double cantRemis7) {
        this.cantRemis7 = cantRemis7;
    }

    public Double getCantRemis8() {
        return cantRemis8;
    }

    public void setCantRemis8(Double cantRemis8) {
        this.cantRemis8 = cantRemis8;
    }

    public Double getCantRemis9() {
        return cantRemis9;
    }

    public void setCantRemis9(Double cantRemis9) {
        this.cantRemis9 = cantRemis9;
    }

    public Double getCantRemis10() {
        return cantRemis10;
    }

    public void setCantRemis10(Double cantRemis10) {
        this.cantRemis10 = cantRemis10;
    }

    public Double getCantDevol1() {
        return cantDevol1;
    }

    public void setCantDevol1(Double cantDevol1) {
        this.cantDevol1 = cantDevol1;
    }

    public Double getCantDevol2() {
        return cantDevol2;
    }

    public void setCantDevol2(Double cantDevol2) {
        this.cantDevol2 = cantDevol2;
    }

    public Double getCantDevol3() {
        return cantDevol3;
    }

    public void setCantDevol3(Double cantDevol3) {
        this.cantDevol3 = cantDevol3;
    }

    public Double getCantDevol4() {
        return cantDevol4;
    }

    public void setCantDevol4(Double cantDevol4) {
        this.cantDevol4 = cantDevol4;
    }

    public Double getCantDevol5() {
        return cantDevol5;
    }

    public void setCantDevol5(Double cantDevol5) {
        this.cantDevol5 = cantDevol5;
    }

    public Double getCantDevol6() {
        return cantDevol6;
    }

    public void setCantDevol6(Double cantDevol6) {
        this.cantDevol6 = cantDevol6;
    }

    public Double getCantDevol7() {
        return cantDevol7;
    }

    public void setCantDevol7(Double cantDevol7) {
        this.cantDevol7 = cantDevol7;
    }

    public Double getCantDevol8() {
        return cantDevol8;
    }

    public void setCantDevol8(Double cantDevol8) {
        this.cantDevol8 = cantDevol8;
    }

    public Double getCantDevol9() {
        return cantDevol9;
    }

    public void setCantDevol9(Double cantDevol9) {
        this.cantDevol9 = cantDevol9;
    }

    public Double getCantDevol10() {
        return cantDevol10;
    }

    public void setCantDevol10(Double cantDevol10) {
        this.cantDevol10 = cantDevol10;
    }

    public Double getvPorDescuentoPie() {
        return vPorDescuentoPie;
    }

    public void setvPorDescuentoPie(Double vPorDescuentoPie) {
        this.vPorDescuentoPie = vPorDescuentoPie;
    }

    public Double getVlrBruto() {
        return vlrBruto;
    }

    public void setVlrBruto(Double vlrBruto) {
        this.vlrBruto = vlrBruto;
    }

    public Double getVlrDcto() {
        return vlrDcto;
    }

    public void setVlrDcto(Double vlrDcto) {
        this.vlrDcto = vlrDcto;
    }

    public Double getVlrNeto() {
        return vlrNeto;
    }

    public void setVlrNeto(Double vlrNeto) {
        this.vlrNeto = vlrNeto;
    }

    public Double getVlrDctoPie() {
        return vlrDctoPie;
    }

    public void setVlrDctoPie(Double vlrDctoPie) {
        this.vlrDctoPie = vlrDctoPie;
    }

    public Double getVlrNetoFinal() {
        return vlrNetoFinal;
    }

    public void setVlrNetoFinal(Double vlrNetoFinal) {
        this.vlrNetoFinal = vlrNetoFinal;
    }

    public Double getVlrImpto() {
        return vlrImpto;
    }

    public void setVlrImpto(Double vlrImpto) {
        this.vlrImpto = vlrImpto;
    }

    public Double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(Double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public String getcBodega() {
        return cBodega;
    }

    public void setcBodega(String cBodega) {
        this.cBodega = cBodega;
    }

    public String getEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(String estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public Integer getcCatActivo() {
        return cCatActivo;
    }

    public void setcCatActivo(Integer cCatActivo) {
        this.cCatActivo = cCatActivo;
    }

    public Integer getcCatItem() {
        return cCatItem;
    }

    public void setcCatItem(Integer cCatItem) {
        this.cCatItem = cCatItem;
    }

    public Double getvPvp() {
        return vPvp;
    }

    public void setvPvp(Double vPvp) {
        this.vPvp = vPvp;
    }
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
