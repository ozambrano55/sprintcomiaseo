package com.example.sprintcomiaseo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Fac_Pedidos_Deta", schema = "dbo", catalog = "siinf_casalindap_ec")
public class FacPedidosDeta {
    @Basic
    @Column(name = "C_Empresa")
    private int cEmpresa;
    @Basic
    @EmbeddedId
    @Column(name = "N_Orden_Pedido")
    private String nOrdenPedido;
    @Basic
    @Column(name = "T_Elemento")
    private String tElemento;
    @Basic
    @Column(name = "C_Item")
    private String cItem;
    @Basic
    @Column(name = "C_Despieze2")
    private String cDespieze2;
    @Basic
    @Column(name = "V_Cantidad_Orden")
    private double vCantidadOrden;
    @Basic
    @Column(name = "V_Valor_Und")
    private double vValorUnd;
    @Basic
    @Column(name = "V_Por_Descuento")
    private double vPorDescuento;
    @Basic
    @Column(name = "V_Por_Impuesto")
    private double vPorImpuesto;
    @Basic
    @Column(name = "F_Recep_Espe_Item")
    private Date fRecepEspeItem;
    @Basic
    @Column(name = "F_Recep_Real_Item")
    private Date fRecepRealItem;
    @Basic
    @Column(name = "V_Cant_Recepcion")
    private double vCantRecepcion;
    @Basic
    @Column(name = "V_Cant_Devolucion")
    private double vCantDevolucion;
    @Basic
    @Column(name = "C_Und_Venta")
    private String cUndVenta;
    @Basic
    @Column(name = "Cant_Desp1")
    private double cantDesp1;
    @Basic
    @Column(name = "Cant_Desp2")
    private double cantDesp2;
    @Basic
    @Column(name = "Cant_Desp3")
    private double cantDesp3;
    @Basic
    @Column(name = "Cant_Desp4")
    private double cantDesp4;
    @Basic
    @Column(name = "Cant_Desp5")
    private double cantDesp5;
    @Basic
    @Column(name = "Cant_Desp6")
    private double cantDesp6;
    @Basic
    @Column(name = "Cant_Desp7")
    private double cantDesp7;
    @Basic
    @Column(name = "Cant_Desp8")
    private double cantDesp8;
    @Basic
    @Column(name = "Cant_Desp9")
    private double cantDesp9;
    @Basic
    @Column(name = "Cant_Desp10")
    private double cantDesp10;
    @Basic
    @Column(name = "Cant_Remis1")
    private double cantRemis1;
    @Basic
    @Column(name = "Cant_Remis2")
    private double cantRemis2;
    @Basic
    @Column(name = "Cant_Remis3")
    private double cantRemis3;
    @Basic
    @Column(name = "Cant_Remis4")
    private double cantRemis4;
    @Basic
    @Column(name = "Cant_Remis5")
    private double cantRemis5;
    @Basic
    @Column(name = "Cant_Remis6")
    private double cantRemis6;
    @Basic
    @Column(name = "Cant_Remis7")
    private double cantRemis7;
    @Basic
    @Column(name = "Cant_Remis8")
    private double cantRemis8;
    @Basic
    @Column(name = "Cant_Remis9")
    private double cantRemis9;
    @Basic
    @Column(name = "Cant_Remis10")
    private double cantRemis10;
    @Basic
    @Column(name = "Cant_Devol1")
    private double cantDevol1;
    @Basic
    @Column(name = "Cant_Devol2")
    private double cantDevol2;
    @Basic
    @Column(name = "Cant_Devol3")
    private double cantDevol3;
    @Basic
    @Column(name = "Cant_Devol4")
    private double cantDevol4;
    @Basic
    @Column(name = "Cant_Devol5")
    private double cantDevol5;
    @Basic
    @Column(name = "Cant_Devol6")
    private double cantDevol6;
    @Basic
    @Column(name = "Cant_Devol7")
    private double cantDevol7;
    @Basic
    @Column(name = "Cant_Devol8")
    private double cantDevol8;
    @Basic
    @Column(name = "Cant_Devol9")
    private double cantDevol9;
    @Basic
    @Column(name = "Cant_Devol10")
    private double cantDevol10;
    @Basic
    @Column(name = "V_Por_Descuento_Pie")
    private double vPorDescuentoPie;
    @Basic
    @Column(name = "Vlr_Bruto")
    private double vlrBruto;
    @Basic
    @Column(name = "Vlr_Dcto")
    private double vlrDcto;
    @Basic
    @Column(name = "Vlr_Neto")
    private double vlrNeto;
    @Basic
    @Column(name = "Vlr_Dcto_Pie")
    private double vlrDctoPie;
    @Basic
    @Column(name = "Vlr_Neto_Final")
    private double vlrNetoFinal;
    @Basic
    @Column(name = "Vlr_Impto")
    private double vlrImpto;
    @Basic
    @Column(name = "Vlr_Total")
    private double vlrTotal;
    @Basic
    @Column(name = "C_Bodega")
    private String cBodega;
    @Basic
    @Column(name = "Estado_Disponible")
    private String estadoDisponible;
    @Basic
    @Column(name = "C_Cat_Activo")
    private Integer cCatActivo;
    @Basic
    @Column(name = "C_Cat_Item")
    private Integer cCatItem;
    @Basic
    @Column(name = "V_Pvp")
    private Double vPvp;

    public int getcEmpresa() {
        return cEmpresa;
    }

    public void setcEmpresa(int cEmpresa) {
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

    public double getvCantidadOrden() {
        return vCantidadOrden;
    }

    public void setvCantidadOrden(double vCantidadOrden) {
        this.vCantidadOrden = vCantidadOrden;
    }

    public double getvValorUnd() {
        return vValorUnd;
    }

    public void setvValorUnd(double vValorUnd) {
        this.vValorUnd = vValorUnd;
    }

    public double getvPorDescuento() {
        return vPorDescuento;
    }

    public void setvPorDescuento(double vPorDescuento) {
        this.vPorDescuento = vPorDescuento;
    }

    public double getvPorImpuesto() {
        return vPorImpuesto;
    }

    public void setvPorImpuesto(double vPorImpuesto) {
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

    public double getvCantRecepcion() {
        return vCantRecepcion;
    }

    public void setvCantRecepcion(double vCantRecepcion) {
        this.vCantRecepcion = vCantRecepcion;
    }

    public double getvCantDevolucion() {
        return vCantDevolucion;
    }

    public void setvCantDevolucion(double vCantDevolucion) {
        this.vCantDevolucion = vCantDevolucion;
    }

    public String getcUndVenta() {
        return cUndVenta;
    }

    public void setcUndVenta(String cUndVenta) {
        this.cUndVenta = cUndVenta;
    }

    public double getCantDesp1() {
        return cantDesp1;
    }

    public void setCantDesp1(double cantDesp1) {
        this.cantDesp1 = cantDesp1;
    }

    public double getCantDesp2() {
        return cantDesp2;
    }

    public void setCantDesp2(double cantDesp2) {
        this.cantDesp2 = cantDesp2;
    }

    public double getCantDesp3() {
        return cantDesp3;
    }

    public void setCantDesp3(double cantDesp3) {
        this.cantDesp3 = cantDesp3;
    }

    public double getCantDesp4() {
        return cantDesp4;
    }

    public void setCantDesp4(double cantDesp4) {
        this.cantDesp4 = cantDesp4;
    }

    public double getCantDesp5() {
        return cantDesp5;
    }

    public void setCantDesp5(double cantDesp5) {
        this.cantDesp5 = cantDesp5;
    }

    public double getCantDesp6() {
        return cantDesp6;
    }

    public void setCantDesp6(double cantDesp6) {
        this.cantDesp6 = cantDesp6;
    }

    public double getCantDesp7() {
        return cantDesp7;
    }

    public void setCantDesp7(double cantDesp7) {
        this.cantDesp7 = cantDesp7;
    }

    public double getCantDesp8() {
        return cantDesp8;
    }

    public void setCantDesp8(double cantDesp8) {
        this.cantDesp8 = cantDesp8;
    }

    public double getCantDesp9() {
        return cantDesp9;
    }

    public void setCantDesp9(double cantDesp9) {
        this.cantDesp9 = cantDesp9;
    }

    public double getCantDesp10() {
        return cantDesp10;
    }

    public void setCantDesp10(double cantDesp10) {
        this.cantDesp10 = cantDesp10;
    }

    public double getCantRemis1() {
        return cantRemis1;
    }

    public void setCantRemis1(double cantRemis1) {
        this.cantRemis1 = cantRemis1;
    }

    public double getCantRemis2() {
        return cantRemis2;
    }

    public void setCantRemis2(double cantRemis2) {
        this.cantRemis2 = cantRemis2;
    }

    public double getCantRemis3() {
        return cantRemis3;
    }

    public void setCantRemis3(double cantRemis3) {
        this.cantRemis3 = cantRemis3;
    }

    public double getCantRemis4() {
        return cantRemis4;
    }

    public void setCantRemis4(double cantRemis4) {
        this.cantRemis4 = cantRemis4;
    }

    public double getCantRemis5() {
        return cantRemis5;
    }

    public void setCantRemis5(double cantRemis5) {
        this.cantRemis5 = cantRemis5;
    }

    public double getCantRemis6() {
        return cantRemis6;
    }

    public void setCantRemis6(double cantRemis6) {
        this.cantRemis6 = cantRemis6;
    }

    public double getCantRemis7() {
        return cantRemis7;
    }

    public void setCantRemis7(double cantRemis7) {
        this.cantRemis7 = cantRemis7;
    }

    public double getCantRemis8() {
        return cantRemis8;
    }

    public void setCantRemis8(double cantRemis8) {
        this.cantRemis8 = cantRemis8;
    }

    public double getCantRemis9() {
        return cantRemis9;
    }

    public void setCantRemis9(double cantRemis9) {
        this.cantRemis9 = cantRemis9;
    }

    public double getCantRemis10() {
        return cantRemis10;
    }

    public void setCantRemis10(double cantRemis10) {
        this.cantRemis10 = cantRemis10;
    }

    public double getCantDevol1() {
        return cantDevol1;
    }

    public void setCantDevol1(double cantDevol1) {
        this.cantDevol1 = cantDevol1;
    }

    public double getCantDevol2() {
        return cantDevol2;
    }

    public void setCantDevol2(double cantDevol2) {
        this.cantDevol2 = cantDevol2;
    }

    public double getCantDevol3() {
        return cantDevol3;
    }

    public void setCantDevol3(double cantDevol3) {
        this.cantDevol3 = cantDevol3;
    }

    public double getCantDevol4() {
        return cantDevol4;
    }

    public void setCantDevol4(double cantDevol4) {
        this.cantDevol4 = cantDevol4;
    }

    public double getCantDevol5() {
        return cantDevol5;
    }

    public void setCantDevol5(double cantDevol5) {
        this.cantDevol5 = cantDevol5;
    }

    public double getCantDevol6() {
        return cantDevol6;
    }

    public void setCantDevol6(double cantDevol6) {
        this.cantDevol6 = cantDevol6;
    }

    public double getCantDevol7() {
        return cantDevol7;
    }

    public void setCantDevol7(double cantDevol7) {
        this.cantDevol7 = cantDevol7;
    }

    public double getCantDevol8() {
        return cantDevol8;
    }

    public void setCantDevol8(double cantDevol8) {
        this.cantDevol8 = cantDevol8;
    }

    public double getCantDevol9() {
        return cantDevol9;
    }

    public void setCantDevol9(double cantDevol9) {
        this.cantDevol9 = cantDevol9;
    }

    public double getCantDevol10() {
        return cantDevol10;
    }

    public void setCantDevol10(double cantDevol10) {
        this.cantDevol10 = cantDevol10;
    }

    public double getvPorDescuentoPie() {
        return vPorDescuentoPie;
    }

    public void setvPorDescuentoPie(double vPorDescuentoPie) {
        this.vPorDescuentoPie = vPorDescuentoPie;
    }

    public double getVlrBruto() {
        return vlrBruto;
    }

    public void setVlrBruto(double vlrBruto) {
        this.vlrBruto = vlrBruto;
    }

    public double getVlrDcto() {
        return vlrDcto;
    }

    public void setVlrDcto(double vlrDcto) {
        this.vlrDcto = vlrDcto;
    }

    public double getVlrNeto() {
        return vlrNeto;
    }

    public void setVlrNeto(double vlrNeto) {
        this.vlrNeto = vlrNeto;
    }

    public double getVlrDctoPie() {
        return vlrDctoPie;
    }

    public void setVlrDctoPie(double vlrDctoPie) {
        this.vlrDctoPie = vlrDctoPie;
    }

    public double getVlrNetoFinal() {
        return vlrNetoFinal;
    }

    public void setVlrNetoFinal(double vlrNetoFinal) {
        this.vlrNetoFinal = vlrNetoFinal;
    }

    public double getVlrImpto() {
        return vlrImpto;
    }

    public void setVlrImpto(double vlrImpto) {
        this.vlrImpto = vlrImpto;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacPedidosDeta that = (FacPedidosDeta) o;
        return cEmpresa == that.cEmpresa && Double.compare(that.vCantidadOrden, vCantidadOrden) == 0 && Double.compare(that.vValorUnd, vValorUnd) == 0 && Double.compare(that.vPorDescuento, vPorDescuento) == 0 && Double.compare(that.vPorImpuesto, vPorImpuesto) == 0 && Double.compare(that.vCantRecepcion, vCantRecepcion) == 0 && Double.compare(that.vCantDevolucion, vCantDevolucion) == 0 && Double.compare(that.cantDesp1, cantDesp1) == 0 && Double.compare(that.cantDesp2, cantDesp2) == 0 && Double.compare(that.cantDesp3, cantDesp3) == 0 && Double.compare(that.cantDesp4, cantDesp4) == 0 && Double.compare(that.cantDesp5, cantDesp5) == 0 && Double.compare(that.cantDesp6, cantDesp6) == 0 && Double.compare(that.cantDesp7, cantDesp7) == 0 && Double.compare(that.cantDesp8, cantDesp8) == 0 && Double.compare(that.cantDesp9, cantDesp9) == 0 && Double.compare(that.cantDesp10, cantDesp10) == 0 && Double.compare(that.cantRemis1, cantRemis1) == 0 && Double.compare(that.cantRemis2, cantRemis2) == 0 && Double.compare(that.cantRemis3, cantRemis3) == 0 && Double.compare(that.cantRemis4, cantRemis4) == 0 && Double.compare(that.cantRemis5, cantRemis5) == 0 && Double.compare(that.cantRemis6, cantRemis6) == 0 && Double.compare(that.cantRemis7, cantRemis7) == 0 && Double.compare(that.cantRemis8, cantRemis8) == 0 && Double.compare(that.cantRemis9, cantRemis9) == 0 && Double.compare(that.cantRemis10, cantRemis10) == 0 && Double.compare(that.cantDevol1, cantDevol1) == 0 && Double.compare(that.cantDevol2, cantDevol2) == 0 && Double.compare(that.cantDevol3, cantDevol3) == 0 && Double.compare(that.cantDevol4, cantDevol4) == 0 && Double.compare(that.cantDevol5, cantDevol5) == 0 && Double.compare(that.cantDevol6, cantDevol6) == 0 && Double.compare(that.cantDevol7, cantDevol7) == 0 && Double.compare(that.cantDevol8, cantDevol8) == 0 && Double.compare(that.cantDevol9, cantDevol9) == 0 && Double.compare(that.cantDevol10, cantDevol10) == 0 && Double.compare(that.vPorDescuentoPie, vPorDescuentoPie) == 0 && Double.compare(that.vlrBruto, vlrBruto) == 0 && Double.compare(that.vlrDcto, vlrDcto) == 0 && Double.compare(that.vlrNeto, vlrNeto) == 0 && Double.compare(that.vlrDctoPie, vlrDctoPie) == 0 && Double.compare(that.vlrNetoFinal, vlrNetoFinal) == 0 && Double.compare(that.vlrImpto, vlrImpto) == 0 && Double.compare(that.vlrTotal, vlrTotal) == 0 && Objects.equals(nOrdenPedido, that.nOrdenPedido) && Objects.equals(tElemento, that.tElemento) && Objects.equals(cItem, that.cItem) && Objects.equals(cDespieze2, that.cDespieze2) && Objects.equals(fRecepEspeItem, that.fRecepEspeItem) && Objects.equals(fRecepRealItem, that.fRecepRealItem) && Objects.equals(cUndVenta, that.cUndVenta) && Objects.equals(cBodega, that.cBodega) && Objects.equals(estadoDisponible, that.estadoDisponible) && Objects.equals(cCatActivo, that.cCatActivo) && Objects.equals(cCatItem, that.cCatItem) && Objects.equals(vPvp, that.vPvp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cEmpresa, nOrdenPedido, tElemento, cItem, cDespieze2, vCantidadOrden, vValorUnd, vPorDescuento, vPorImpuesto, fRecepEspeItem, fRecepRealItem, vCantRecepcion, vCantDevolucion, cUndVenta, cantDesp1, cantDesp2, cantDesp3, cantDesp4, cantDesp5, cantDesp6, cantDesp7, cantDesp8, cantDesp9, cantDesp10, cantRemis1, cantRemis2, cantRemis3, cantRemis4, cantRemis5, cantRemis6, cantRemis7, cantRemis8, cantRemis9, cantRemis10, cantDevol1, cantDevol2, cantDevol3, cantDevol4, cantDevol5, cantDevol6, cantDevol7, cantDevol8, cantDevol9, cantDevol10, vPorDescuentoPie, vlrBruto, vlrDcto, vlrNeto, vlrDctoPie, vlrNetoFinal, vlrImpto, vlrTotal, cBodega, estadoDisponible, cCatActivo, cCatItem, vPvp);
    }
}
