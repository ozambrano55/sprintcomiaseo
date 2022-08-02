package com.example.sprintcomiaseo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;


@Entity
//@Table(name = "Fac_Pedidos_Enca", schema = "dbo", catalog = "siinf_casalindap_ec")
//@IdClass(FacPedidosEncaPK.class)
@Table(name = "Fac_Pedidos_Enca")
public class FacPedidosEnca implements Serializable {


    @Column(name = "C_Empresa", nullable = false)
    private Integer cEmpresa;

    public String getnOrdenPedidoS() {
        return nOrdenPedidoS;
    }

    public void setnOrdenPedidoS(String nOrdenPedidoS) {
        this.nOrdenPedidoS = nOrdenPedidoS;
    }

    public List<FacPedidosDeta> getFacPedidosDetaList() {
        return facPedidosDetaList;
    }

    public void setFacPedidosDetaList(List<FacPedidosDeta> facPedidosDetaList) {
        this.facPedidosDetaList = facPedidosDetaList;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "N_Orden_Pedido", nullable = false, length = 15)
    private String nOrdenPedidoS;

    @OneToMany(mappedBy = "nOrdenPedido")
    private List<FacPedidosDeta> facPedidosDetaList;

    @Basic
    @Column(name = "N_Orden_Cotiza", nullable = true, length = 10)
    private String nOrdenCotiza;
    @Basic
    @Column(name = "F_Orden", nullable = false)
    private Date fOrden;
    @Basic
    @Column(name = "F_Recep_Espe", nullable = false)
    private Date fRecepEspe;
    @Basic
    @Column(name = "F_Recep_Real", nullable = true)
    private Date fRecepReal;
    @Basic
    @Column(name = "C_Tipo_Tercero", nullable = false, length = 1)
    private String cTipoTercero;
    @Basic
    @Column(name = "C_Cod_Cliente", nullable = true, length = 20)
    private String cCodCliente;
    @Basic
    @Column(name = "P_Direccion_Cliente", nullable = true, length = 200)
    private String pDireccionCliente;
    @Basic
    @Column(name = "P_C_Ciudad", nullable = false, length = 13)
    private String pCCiudad;
    @Basic
    @Column(name = "P_Cod_Postal", nullable = true, length = 10)
    private String pCodPostal;
    @Basic
    @Column(name = "P_Tel1", nullable = true, length = 20)
    private String pTel1;
    @Basic
    @Column(name = "P_Fax", nullable = true, length = 20)
    private String pFax;
    @Basic
    @Column(name = "R_Direccion", nullable = true, length = 200)
    private String rDireccion;
    @Basic
    @Column(name = "R_C_Ciudad", nullable = false, length = 13)
    private String rCCiudad;
    @Basic
    @Column(name = "R_Cod_Postal", nullable = true, length = 10)
    private String rCodPostal;
    @Basic
    @Column(name = "R_Tel1", nullable = true, length = 20)
    private String rTel1;
    @Basic
    @Column(name = "R_Fax", nullable = true, length = 20)
    private String rFax;
    @Basic
    @Column(name = "V_Por_Anticipo", nullable = false, precision = 0)
    private Double vPorAnticipo;
    @Basic
    @Column(name = "V_Dias_Saldo", nullable = false)
    private Short vDiasSaldo;
    @Basic
    @Column(name = "F_Pago_Anticipo_Prog", nullable = false)
    private Date fPagoAnticipoProg;
    @Basic
    @Column(name = "F_Pago_Saldo_Prog", nullable = false)
    private Date fPagoSaldoProg;
    @Basic
    @Column(name = "N_Comentario", nullable = true, length = 200)
    private String nComentario;
    @Basic
    @Column(name = "C_Funcionario", nullable = false, length = 6)
    private String cFuncionario;
    @Basic
    @Column(name = "Estado_Orden", nullable = false)
    private Boolean estadoOrden;
    @Basic
    @Column(name = "Estado_Proceso", nullable = false)
    private Integer estadoProceso;
    @Basic
    @Column(name = "V_Por_Descuento_Pie", nullable = false, precision = 0)
    private Double vPorDescuentoPie;
    @Basic
    @Column(name = "V_Fletes", nullable = false, precision = 0)
    private Double vFletes;
    @Basic
    @Column(name = "V_Manipulacion", nullable = false, precision = 0)
    private Double vManipulacion;
    @Basic
    @Column(name = "F_Grabacion", nullable = false)
    private Date fGrabacion;
    @Basic
    @Column(name = "C_Punto_Venta", nullable = false, length = 5)
    private String cPuntoVenta;
    @Basic
    @Column(name = "C_Vendedor", nullable = true, length = 20)
    private String cVendedor;
    @Basic
    @Column(name = "C_Director", nullable = true, length = 20)
    private String cDirector;
    @Basic
    @Column(name = "C_Zona_Fac", nullable = false, length = 5)
    private String cZonaFac;
    @Basic
    @Column(name = "C_Lista_Precios", nullable = false, length = 5)
    private String cListaPrecios;
    @Basic
    @Column(name = "C_Condicion_Pago", nullable = false, length = 5)
    private String cCondicionPago;
    @Basic
    @Column(name = "C_Tipo_Factura", nullable = false, length = 3)
    private String cTipoFactura;
    @Basic
    @Column(name = "C_Dcto_Financiero", nullable = false, length = 5)
    private String cDctoFinanciero;
    @Basic
    @Column(name = "T_Con_RTF", nullable = false, length = 1)
    private String tConRtf;
    @Basic
    @Column(name = "C_Con_RTF", nullable = false)
    private Short cConRtf;
    @Basic
    @Column(name = "T_Con_ICA", nullable = false, length = 1)
    private String tConIca;
    @Basic
    @Column(name = "C_Con_ICA", nullable = false)
    private Short cConIca;
    @Basic
    @Column(name = "C_Campana", nullable = false, length = 10)
    private String cCampana;
    @Basic
    @Column(name = "C_Lider", nullable = true, length = 20)
    private String cLider;
    @Basic
    @Column(name = "C_Tipo_Pago", nullable = true, length = 1)
    private String cTipoPago;
    @Basic
    @Column(name = "Estado_Impresion", nullable = true, length = 1)
    private String estadoImpresion;
    @Basic
    @Column(name = "C_Fun_Pik", nullable = true, length = 5)
    private String cFunPik;
    @Basic
    @Column(name = "Estado_Reserva", nullable = true, length = 1)
    private String estadoReserva;
    @Basic
    @Column(name = "Aprobado_Factu", nullable = true, length = 1)
    private String aprobadoFactu;
    @Basic
    @Column(name = "C_Cat_Pedido", nullable = true)
    private Integer cCatPedido;
    @Basic
    @Column(name = "Estado_Factu", nullable = true, length = 1)
    private String estadoFactu;
    @Basic
    @Column(name = "tipo_ped", nullable = true, length = 1)
    private String tipoPed;
    @Basic
    @Column(name = "Dato_Ref1", nullable = true, length = 200)
    private String datoRef1;
    @Basic
    @Column(name = "C_Tipo_Envio", nullable = true, length = 1)
    private String cTipoEnvio;
    @Basic
    @Column(name = "C_Cod_Medio_Trans", nullable = true, length = 3)
    private String cCodMedioTrans;
    @Basic
    @Column(name = "premio3", nullable = true, length = 1)
    private String premio3;
    @Basic
    @Column(name = "premio5", nullable = true, length = 1)
    private String premio5;
    @Basic
    @Column(name = "Estado_Modifica", nullable = false, length = 1)
    private String estadoModifica;
    @Basic
    @Column(name = "C_PuntoAt", nullable = true, length = 5)
    private String cPuntoAt;
    @Basic
    @Column(name = "Estado_banco", nullable = true, length = 1)
    private String estadoBanco;
    @Basic
    @Column(name = "Estado_Pagado", nullable = true, length = 1)
    private String estadoPagado;
    @Basic
    @Column(name = "C_Cod_Transporta", nullable = false, length = 20)
    private String cCodTransporta;

    public Integer getcEmpresa() {
        return cEmpresa;
    }

    public void setcEmpresa(Integer cEmpresa) {
        this.cEmpresa = cEmpresa;
    }

    public String getnOrdenPedido() {
        return nOrdenPedidoS;
    }

    public void setnOrdenPedido(String nOrdenPedido) {
        this.nOrdenPedidoS = nOrdenPedido;
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

    public Double getvPorAnticipo() {
        return vPorAnticipo;
    }

    public void setvPorAnticipo(Double vPorAnticipo) {
        this.vPorAnticipo = vPorAnticipo;
    }

    public Short getvDiasSaldo() {
        return vDiasSaldo;
    }

    public void setvDiasSaldo(Short vDiasSaldo) {
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

    public Boolean getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(Boolean estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public Integer getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(Integer estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Double getvPorDescuentoPie() {
        return vPorDescuentoPie;
    }

    public void setvPorDescuentoPie(Double vPorDescuentoPie) {
        this.vPorDescuentoPie = vPorDescuentoPie;
    }

    public Double getvFletes() {
        return vFletes;
    }

    public void setvFletes(Double vFletes) {
        this.vFletes = vFletes;
    }

    public Double getvManipulacion() {
        return vManipulacion;
    }

    public void setvManipulacion(Double vManipulacion) {
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

    public Short getcConRtf() {
        return cConRtf;
    }

    public void setcConRtf(Short cConRtf) {
        this.cConRtf = cConRtf;
    }

    public String gettConIca() {
        return tConIca;
    }

    public void settConIca(String tConIca) {
        this.tConIca = tConIca;
    }

    public Short getcConIca() {
        return cConIca;
    }

    public void setcConIca(Short cConIca) {
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
        return cPuntoAt;
    }

    public void setcPuntoAt(String cPuntoAt) {
        this.cPuntoAt = cPuntoAt;
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
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacPedidosEnca that = (FacPedidosEnca) o;
        return Objects.equals(cEmpresa, that.cEmpresa) && Objects.equals(nOrdenPedido, that.nOrdenPedido) && Objects.equals(nOrdenCotiza, that.nOrdenCotiza) && Objects.equals(fOrden, that.fOrden) && Objects.equals(fRecepEspe, that.fRecepEspe) && Objects.equals(fRecepReal, that.fRecepReal) && Objects.equals(cTipoTercero, that.cTipoTercero) && Objects.equals(cCodCliente, that.cCodCliente) && Objects.equals(pDireccionCliente, that.pDireccionCliente) && Objects.equals(pCCiudad, that.pCCiudad) && Objects.equals(pCodPostal, that.pCodPostal) && Objects.equals(pTel1, that.pTel1) && Objects.equals(pFax, that.pFax) && Objects.equals(rDireccion, that.rDireccion) && Objects.equals(rCCiudad, that.rCCiudad) && Objects.equals(rCodPostal, that.rCodPostal) && Objects.equals(rTel1, that.rTel1) && Objects.equals(rFax, that.rFax) && Objects.equals(vPorAnticipo, that.vPorAnticipo) && Objects.equals(vDiasSaldo, that.vDiasSaldo) && Objects.equals(fPagoAnticipoProg, that.fPagoAnticipoProg) && Objects.equals(fPagoSaldoProg, that.fPagoSaldoProg) && Objects.equals(nComentario, that.nComentario) && Objects.equals(cFuncionario, that.cFuncionario) && Objects.equals(estadoOrden, that.estadoOrden) && Objects.equals(estadoProceso, that.estadoProceso) && Objects.equals(vPorDescuentoPie, that.vPorDescuentoPie) && Objects.equals(vFletes, that.vFletes) && Objects.equals(vManipulacion, that.vManipulacion) && Objects.equals(fGrabacion, that.fGrabacion) && Objects.equals(cPuntoVenta, that.cPuntoVenta) && Objects.equals(cVendedor, that.cVendedor) && Objects.equals(cDirector, that.cDirector) && Objects.equals(cZonaFac, that.cZonaFac) && Objects.equals(cListaPrecios, that.cListaPrecios) && Objects.equals(cCondicionPago, that.cCondicionPago) && Objects.equals(cTipoFactura, that.cTipoFactura) && Objects.equals(cDctoFinanciero, that.cDctoFinanciero) && Objects.equals(tConRtf, that.tConRtf) && Objects.equals(cConRtf, that.cConRtf) && Objects.equals(tConIca, that.tConIca) && Objects.equals(cConIca, that.cConIca) && Objects.equals(cCampana, that.cCampana) && Objects.equals(cLider, that.cLider) && Objects.equals(cTipoPago, that.cTipoPago) && Objects.equals(estadoImpresion, that.estadoImpresion) && Objects.equals(cFunPik, that.cFunPik) && Objects.equals(estadoReserva, that.estadoReserva) && Objects.equals(aprobadoFactu, that.aprobadoFactu) && Objects.equals(cCatPedido, that.cCatPedido) && Objects.equals(estadoFactu, that.estadoFactu) && Objects.equals(tipoPed, that.tipoPed) && Objects.equals(datoRef1, that.datoRef1) && Objects.equals(cTipoEnvio, that.cTipoEnvio) && Objects.equals(cCodMedioTrans, that.cCodMedioTrans) && Objects.equals(premio3, that.premio3) && Objects.equals(premio5, that.premio5) && Objects.equals(estadoModifica, that.estadoModifica) && Objects.equals(cPuntoAt, that.cPuntoAt) && Objects.equals(estadoBanco, that.estadoBanco) && Objects.equals(estadoPagado, that.estadoPagado) && Objects.equals(cCodTransporta, that.cCodTransporta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cEmpresa, nOrdenPedido, nOrdenCotiza, fOrden, fRecepEspe, fRecepReal, cTipoTercero, cCodCliente, pDireccionCliente, pCCiudad, pCodPostal, pTel1, pFax, rDireccion, rCCiudad, rCodPostal, rTel1, rFax, vPorAnticipo, vDiasSaldo, fPagoAnticipoProg, fPagoSaldoProg, nComentario, cFuncionario, estadoOrden, estadoProceso, vPorDescuentoPie, vFletes, vManipulacion, fGrabacion, cPuntoVenta, cVendedor, cDirector, cZonaFac, cListaPrecios, cCondicionPago, cTipoFactura, cDctoFinanciero, tConRtf, cConRtf, tConIca, cConIca, cCampana, cLider, cTipoPago, estadoImpresion, cFunPik, estadoReserva, aprobadoFactu, cCatPedido, estadoFactu, tipoPed, datoRef1, cTipoEnvio, cCodMedioTrans, premio3, premio5, estadoModifica, cPuntoAt, estadoBanco, estadoPagado, cCodTransporta);
    }

 */
}
