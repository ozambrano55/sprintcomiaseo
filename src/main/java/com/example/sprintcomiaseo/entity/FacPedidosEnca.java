package com.example.sprintcomiaseo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Fac_Pedidos_Enca", schema = "dbo", catalog = "siinf_casalindap_ec")
@IdClass(FacPedidosEncaPK.class)
public class FacPedidosEnca {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "C_Empresa")
    private int cEmpresa;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "N_Orden_Pedido")
    private String nOrdenPedido;
    @Basic
    @Column(name = "N_Orden_Cotiza")
    private String nOrdenCotiza;
    @Basic
    @Column(name = "F_Orden")
    private Date fOrden;
    @Basic
    @Column(name = "F_Recep_Espe")
    private Date fRecepEspe;
    @Basic
    @Column(name = "F_Recep_Real")
    private Date fRecepReal;
    @Basic
    @Column(name = "C_Tipo_Tercero")
    private String cTipoTercero;
    @Basic
    @Column(name = "C_Cod_Cliente")
    private String cCodCliente;
    @Basic
    @Column(name = "P_Direccion_Cliente")
    private String pDireccionCliente;
    @Basic
    @Column(name = "P_C_Ciudad")
    private String pCCiudad;
    @Basic
    @Column(name = "P_Cod_Postal")
    private String pCodPostal;
    @Basic
    @Column(name = "P_Tel1")
    private String pTel1;
    @Basic
    @Column(name = "P_Fax")
    private String pFax;
    @Basic
    @Column(name = "R_Direccion")
    private String rDireccion;
    @Basic
    @Column(name = "R_C_Ciudad")
    private String rCCiudad;
    @Basic
    @Column(name = "R_Cod_Postal")
    private String rCodPostal;
    @Basic
    @Column(name = "R_Tel1")
    private String rTel1;
    @Basic
    @Column(name = "R_Fax")
    private String rFax;
    @Basic
    @Column(name = "V_Por_Anticipo")
    private double vPorAnticipo;
    @Basic
    @Column(name = "V_Dias_Saldo")
    private short vDiasSaldo;
    @Basic
    @Column(name = "F_Pago_Anticipo_Prog")
    private Date fPagoAnticipoProg;
    @Basic
    @Column(name = "F_Pago_Saldo_Prog")
    private Date fPagoSaldoProg;
    @Basic
    @Column(name = "N_Comentario")
    private String nComentario;
    @Basic
    @Column(name = "C_Funcionario")
    private String cFuncionario;
    @Basic
    @Column(name = "Estado_Orden")
    private boolean estadoOrden;
    @Basic
    @Column(name = "Estado_Proceso")
    private int estadoProceso;
    @Basic
    @Column(name = "V_Por_Descuento_Pie")
    private double vPorDescuentoPie;
    @Basic
    @Column(name = "V_Fletes")
    private double vFletes;
    @Basic
    @Column(name = "V_Manipulacion")
    private double vManipulacion;
    @Basic
    @Column(name = "F_Grabacion")
    private Date fGrabacion;
    @Basic
    @Column(name = "C_Punto_Venta")
    private String cPuntoVenta;
    @Basic
    @Column(name = "C_Vendedor")
    private String cVendedor;
    @Basic
    @Column(name = "C_Director")
    private String cDirector;
    @Basic
    @Column(name = "C_Zona_Fac")
    private String cZonaFac;
    @Basic
    @Column(name = "C_Lista_Precios")
    private String cListaPrecios;
    @Basic
    @Column(name = "C_Condicion_Pago")
    private String cCondicionPago;
    @Basic
    @Column(name = "C_Tipo_Factura")
    private String cTipoFactura;
    @Basic
    @Column(name = "C_Dcto_Financiero")
    private String cDctoFinanciero;
    @Basic
    @Column(name = "T_Con_RTF")
    private String tConRtf;
    @Basic
    @Column(name = "C_Con_RTF")
    private short cConRtf;
    @Basic
    @Column(name = "T_Con_ICA")
    private String tConIca;
    @Basic
    @Column(name = "C_Con_ICA")
    private short cConIca;
    @Basic
    @Column(name = "C_Campana")
    private String cCampana;
    @Basic
    @Column(name = "C_Lider")
    private String cLider;
    @Basic
    @Column(name = "C_Tipo_Pago")
    private String cTipoPago;
    @Basic
    @Column(name = "Estado_Impresion")
    private String estadoImpresion;
    @Basic
    @Column(name = "C_Fun_Pik")
    private String cFunPik;
    @Basic
    @Column(name = "Estado_Reserva")
    private String estadoReserva;
    @Basic
    @Column(name = "Aprobado_Factu")
    private String aprobadoFactu;
    @Basic
    @Column(name = "C_Cat_Pedido")
    private Integer cCatPedido;
    @Basic
    @Column(name = "Estado_Factu")
    private String estadoFactu;
    @Basic
    @Column(name = "tipo_ped")
    private String tipoPed;
    @Basic
    @Column(name = "Dato_Ref1")
    private String datoRef1;
    @Basic
    @Column(name = "C_Tipo_Envio")
    private String cTipoEnvio;
    @Basic
    @Column(name = "C_Cod_Medio_Trans")
    private String cCodMedioTrans;
    @Basic
    @Column(name = "premio3")
    private String premio3;
    @Basic
    @Column(name = "premio5")
    private String premio5;
    @Basic
    @Column(name = "Estado_Modifica")
    private String estadoModifica;
    @Basic
    @Column(name = "C_PuntoAt")
    private String cPuntoat;
    @Basic
    @Column(name = "Estado_banco")
    private String estadoBanco;
    @Basic
    @Column(name = "Estado_Pagado")
    private String estadoPagado;
    @Basic
    @Column(name = "C_Cod_Transporta")
    private String cCodTransporta;

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

    public String getnOrdenCotiza() {
        return nOrdenCotiza;
    }

    public void setnOrdenCotiza(String nOrdenCotiza) {
        this.nOrdenCotiza = nOrdenCotiza;
    }

    public Date getfOrden() {
        return fOrden;
    }

    public void setfOrden(Date fOrden) {
        this.fOrden = fOrden;
    }

    public Date getfRecepEspe() {
        return fRecepEspe;
    }

    public void setfRecepEspe(Date fRecepEspe) {
        this.fRecepEspe = fRecepEspe;
    }

    public Date getfRecepReal() {
        return fRecepReal;
    }

    public void setfRecepReal(Date fRecepReal) {
        this.fRecepReal = fRecepReal;
    }

    public String getcTipoTercero() {
        return cTipoTercero;
    }

    public void setcTipoTercero(String cTipoTercero) {
        this.cTipoTercero = cTipoTercero;
    }

    public String getcCodCliente() {
        return cCodCliente;
    }

    public void setcCodCliente(String cCodCliente) {
        this.cCodCliente = cCodCliente;
    }

    public String getpDireccionCliente() {
        return pDireccionCliente;
    }

    public void setpDireccionCliente(String pDireccionCliente) {
        this.pDireccionCliente = pDireccionCliente;
    }

    public String getpCCiudad() {
        return pCCiudad;
    }

    public void setpCCiudad(String pCCiudad) {
        this.pCCiudad = pCCiudad;
    }

    public String getpCodPostal() {
        return pCodPostal;
    }

    public void setpCodPostal(String pCodPostal) {
        this.pCodPostal = pCodPostal;
    }

    public String getpTel1() {
        return pTel1;
    }

    public void setpTel1(String pTel1) {
        this.pTel1 = pTel1;
    }

    public String getpFax() {
        return pFax;
    }

    public void setpFax(String pFax) {
        this.pFax = pFax;
    }

    public String getrDireccion() {
        return rDireccion;
    }

    public void setrDireccion(String rDireccion) {
        this.rDireccion = rDireccion;
    }

    public String getrCCiudad() {
        return rCCiudad;
    }

    public void setrCCiudad(String rCCiudad) {
        this.rCCiudad = rCCiudad;
    }

    public String getrCodPostal() {
        return rCodPostal;
    }

    public void setrCodPostal(String rCodPostal) {
        this.rCodPostal = rCodPostal;
    }

    public String getrTel1() {
        return rTel1;
    }

    public void setrTel1(String rTel1) {
        this.rTel1 = rTel1;
    }

    public String getrFax() {
        return rFax;
    }

    public void setrFax(String rFax) {
        this.rFax = rFax;
    }

    public double getvPorAnticipo() {
        return vPorAnticipo;
    }

    public void setvPorAnticipo(double vPorAnticipo) {
        this.vPorAnticipo = vPorAnticipo;
    }

    public short getvDiasSaldo() {
        return vDiasSaldo;
    }

    public void setvDiasSaldo(short vDiasSaldo) {
        this.vDiasSaldo = vDiasSaldo;
    }

    public Date getfPagoAnticipoProg() {
        return fPagoAnticipoProg;
    }

    public void setfPagoAnticipoProg(Date fPagoAnticipoProg) {
        this.fPagoAnticipoProg = fPagoAnticipoProg;
    }

    public Date getfPagoSaldoProg() {
        return fPagoSaldoProg;
    }

    public void setfPagoSaldoProg(Date fPagoSaldoProg) {
        this.fPagoSaldoProg = fPagoSaldoProg;
    }

    public String getnComentario() {
        return nComentario;
    }

    public void setnComentario(String nComentario) {
        this.nComentario = nComentario;
    }

    public String getcFuncionario() {
        return cFuncionario;
    }

    public void setcFuncionario(String cFuncionario) {
        this.cFuncionario = cFuncionario;
    }

    public boolean isEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(boolean estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public int getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(int estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public double getvPorDescuentoPie() {
        return vPorDescuentoPie;
    }

    public void setvPorDescuentoPie(double vPorDescuentoPie) {
        this.vPorDescuentoPie = vPorDescuentoPie;
    }

    public double getvFletes() {
        return vFletes;
    }

    public void setvFletes(double vFletes) {
        this.vFletes = vFletes;
    }

    public double getvManipulacion() {
        return vManipulacion;
    }

    public void setvManipulacion(double vManipulacion) {
        this.vManipulacion = vManipulacion;
    }

    public Date getfGrabacion() {
        return fGrabacion;
    }

    public void setfGrabacion(Date fGrabacion) {
        this.fGrabacion = fGrabacion;
    }

    public String getcPuntoVenta() {
        return cPuntoVenta;
    }

    public void setcPuntoVenta(String cPuntoVenta) {
        this.cPuntoVenta = cPuntoVenta;
    }

    public String getcVendedor() {
        return cVendedor;
    }

    public void setcVendedor(String cVendedor) {
        this.cVendedor = cVendedor;
    }

    public String getcDirector() {
        return cDirector;
    }

    public void setcDirector(String cDirector) {
        this.cDirector = cDirector;
    }

    public String getcZonaFac() {
        return cZonaFac;
    }

    public void setcZonaFac(String cZonaFac) {
        this.cZonaFac = cZonaFac;
    }

    public String getcListaPrecios() {
        return cListaPrecios;
    }

    public void setcListaPrecios(String cListaPrecios) {
        this.cListaPrecios = cListaPrecios;
    }

    public String getcCondicionPago() {
        return cCondicionPago;
    }

    public void setcCondicionPago(String cCondicionPago) {
        this.cCondicionPago = cCondicionPago;
    }

    public String getcTipoFactura() {
        return cTipoFactura;
    }

    public void setcTipoFactura(String cTipoFactura) {
        this.cTipoFactura = cTipoFactura;
    }

    public String getcDctoFinanciero() {
        return cDctoFinanciero;
    }

    public void setcDctoFinanciero(String cDctoFinanciero) {
        this.cDctoFinanciero = cDctoFinanciero;
    }

    public String gettConRtf() {
        return tConRtf;
    }

    public void settConRtf(String tConRtf) {
        this.tConRtf = tConRtf;
    }

    public short getcConRtf() {
        return cConRtf;
    }

    public void setcConRtf(short cConRtf) {
        this.cConRtf = cConRtf;
    }

    public String gettConIca() {
        return tConIca;
    }

    public void settConIca(String tConIca) {
        this.tConIca = tConIca;
    }

    public short getcConIca() {
        return cConIca;
    }

    public void setcConIca(short cConIca) {
        this.cConIca = cConIca;
    }

    public String getcCampana() {
        return cCampana;
    }

    public void setcCampana(String cCampana) {
        this.cCampana = cCampana;
    }

    public String getcLider() {
        return cLider;
    }

    public void setcLider(String cLider) {
        this.cLider = cLider;
    }

    public String getcTipoPago() {
        return cTipoPago;
    }

    public void setcTipoPago(String cTipoPago) {
        this.cTipoPago = cTipoPago;
    }

    public String getEstadoImpresion() {
        return estadoImpresion;
    }

    public void setEstadoImpresion(String estadoImpresion) {
        this.estadoImpresion = estadoImpresion;
    }

    public String getcFunPik() {
        return cFunPik;
    }

    public void setcFunPik(String cFunPik) {
        this.cFunPik = cFunPik;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getAprobadoFactu() {
        return aprobadoFactu;
    }

    public void setAprobadoFactu(String aprobadoFactu) {
        this.aprobadoFactu = aprobadoFactu;
    }

    public Integer getcCatPedido() {
        return cCatPedido;
    }

    public void setcCatPedido(Integer cCatPedido) {
        this.cCatPedido = cCatPedido;
    }

    public String getEstadoFactu() {
        return estadoFactu;
    }

    public void setEstadoFactu(String estadoFactu) {
        this.estadoFactu = estadoFactu;
    }

    public String getTipoPed() {
        return tipoPed;
    }

    public void setTipoPed(String tipoPed) {
        this.tipoPed = tipoPed;
    }

    public String getDatoRef1() {
        return datoRef1;
    }

    public void setDatoRef1(String datoRef1) {
        this.datoRef1 = datoRef1;
    }

    public String getcTipoEnvio() {
        return cTipoEnvio;
    }

    public void setcTipoEnvio(String cTipoEnvio) {
        this.cTipoEnvio = cTipoEnvio;
    }

    public String getcCodMedioTrans() {
        return cCodMedioTrans;
    }

    public void setcCodMedioTrans(String cCodMedioTrans) {
        this.cCodMedioTrans = cCodMedioTrans;
    }

    public String getPremio3() {
        return premio3;
    }

    public void setPremio3(String premio3) {
        this.premio3 = premio3;
    }

    public String getPremio5() {
        return premio5;
    }

    public void setPremio5(String premio5) {
        this.premio5 = premio5;
    }

    public String getEstadoModifica() {
        return estadoModifica;
    }

    public void setEstadoModifica(String estadoModifica) {
        this.estadoModifica = estadoModifica;
    }

    public String getcPuntoAt() {
        return cPuntoat;
    }

    public void setcPuntoAt(String cPuntoAt) {
        this.cPuntoat = cPuntoat;
    }

    public String getEstadoBanco() {
        return estadoBanco;
    }

    public void setEstadoBanco(String estadoBanco) {
        this.estadoBanco = estadoBanco;
    }

    public String getEstadoPagado() {
        return estadoPagado;
    }

    public void setEstadoPagado(String estadoPagado) {
        this.estadoPagado = estadoPagado;
    }

    public String getcCodTransporta() {
        return cCodTransporta;
    }

    public void setcCodTransporta(String cCodTransporta) {
        this.cCodTransporta = cCodTransporta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacPedidosEnca that = (FacPedidosEnca) o;
        return cEmpresa == that.cEmpresa && Double.compare(that.vPorAnticipo, vPorAnticipo) == 0 && vDiasSaldo == that.vDiasSaldo && estadoOrden == that.estadoOrden && estadoProceso == that.estadoProceso && Double.compare(that.vPorDescuentoPie, vPorDescuentoPie) == 0 && Double.compare(that.vFletes, vFletes) == 0 && Double.compare(that.vManipulacion, vManipulacion) == 0 && cConRtf == that.cConRtf && cConIca == that.cConIca && Objects.equals(nOrdenPedido, that.nOrdenPedido) && Objects.equals(nOrdenCotiza, that.nOrdenCotiza) && Objects.equals(fOrden, that.fOrden) && Objects.equals(fRecepEspe, that.fRecepEspe) && Objects.equals(fRecepReal, that.fRecepReal) && Objects.equals(cTipoTercero, that.cTipoTercero) && Objects.equals(cCodCliente, that.cCodCliente) && Objects.equals(pDireccionCliente, that.pDireccionCliente) && Objects.equals(pCCiudad, that.pCCiudad) && Objects.equals(pCodPostal, that.pCodPostal) && Objects.equals(pTel1, that.pTel1) && Objects.equals(pFax, that.pFax) && Objects.equals(rDireccion, that.rDireccion) && Objects.equals(rCCiudad, that.rCCiudad) && Objects.equals(rCodPostal, that.rCodPostal) && Objects.equals(rTel1, that.rTel1) && Objects.equals(rFax, that.rFax) && Objects.equals(fPagoAnticipoProg, that.fPagoAnticipoProg) && Objects.equals(fPagoSaldoProg, that.fPagoSaldoProg) && Objects.equals(nComentario, that.nComentario) && Objects.equals(cFuncionario, that.cFuncionario) && Objects.equals(fGrabacion, that.fGrabacion) && Objects.equals(cPuntoVenta, that.cPuntoVenta) && Objects.equals(cVendedor, that.cVendedor) && Objects.equals(cDirector, that.cDirector) && Objects.equals(cZonaFac, that.cZonaFac) && Objects.equals(cListaPrecios, that.cListaPrecios) && Objects.equals(cCondicionPago, that.cCondicionPago) && Objects.equals(cTipoFactura, that.cTipoFactura) && Objects.equals(cDctoFinanciero, that.cDctoFinanciero) && Objects.equals(tConRtf, that.tConRtf) && Objects.equals(tConIca, that.tConIca) && Objects.equals(cCampana, that.cCampana) && Objects.equals(cLider, that.cLider) && Objects.equals(cTipoPago, that.cTipoPago) && Objects.equals(estadoImpresion, that.estadoImpresion) && Objects.equals(cFunPik, that.cFunPik) && Objects.equals(estadoReserva, that.estadoReserva) && Objects.equals(aprobadoFactu, that.aprobadoFactu) && Objects.equals(cCatPedido, that.cCatPedido) && Objects.equals(estadoFactu, that.estadoFactu) && Objects.equals(tipoPed, that.tipoPed) && Objects.equals(datoRef1, that.datoRef1) && Objects.equals(cTipoEnvio, that.cTipoEnvio) && Objects.equals(cCodMedioTrans, that.cCodMedioTrans) && Objects.equals(premio3, that.premio3) && Objects.equals(premio5, that.premio5) && Objects.equals(estadoModifica, that.estadoModifica) && Objects.equals(cPuntoat, that.cPuntoat) && Objects.equals(estadoBanco, that.estadoBanco) && Objects.equals(estadoPagado, that.estadoPagado) && Objects.equals(cCodTransporta, that.cCodTransporta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cEmpresa, nOrdenPedido, nOrdenCotiza, fOrden, fRecepEspe, fRecepReal, cTipoTercero, cCodCliente, pDireccionCliente, pCCiudad, pCodPostal, pTel1, pFax, rDireccion, rCCiudad, rCodPostal, rTel1, rFax, vPorAnticipo, vDiasSaldo, fPagoAnticipoProg, fPagoSaldoProg, nComentario, cFuncionario, estadoOrden, estadoProceso, vPorDescuentoPie, vFletes, vManipulacion, fGrabacion, cPuntoVenta, cVendedor, cDirector, cZonaFac, cListaPrecios, cCondicionPago, cTipoFactura, cDctoFinanciero, tConRtf, cConRtf, tConIca, cConIca, cCampana, cLider, cTipoPago, estadoImpresion, cFunPik, estadoReserva, aprobadoFactu, cCatPedido, estadoFactu, tipoPed, datoRef1, cTipoEnvio, cCodMedioTrans, premio3, premio5, estadoModifica, cPuntoat, estadoBanco, estadoPagado, cCodTransporta);
    }
}
