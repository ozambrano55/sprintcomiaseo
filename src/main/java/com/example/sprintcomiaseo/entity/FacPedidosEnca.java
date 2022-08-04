package com.example.sprintcomiaseo.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
//@Table(name = "Fac_Pedidos_Enca", schema = "dbo", catalog = "siinf_casalindap_ec")
//@IdClass(FacPedidosEncaPK.class)
@Table(name = "Fac_Pedidos_Enca")
public class FacPedidosEnca {

    @Column(name = "C_Empresa", nullable = false)
    private Integer cEmpresa;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "N_Orden_Pedido", nullable = false, length = 15)
    private String nOrdenPedido;
    @OneToMany(mappedBy = "nOrdenPedido")
    private List<FacPedidosDeta> facPedidosDetaList;
    @Basic
    @Column(name = "N_Orden_Cotiza", nullable = true, length = 10)
    private String nOrdenCotiza;
    @Basic
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Lima")
    @Column(name = "F_Orden", nullable = false)
    private Date fOrden;
    @Basic
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Lima")
    @Column(name = "F_Recep_Espe", nullable = false)
    private Date fRecepEspe;
    @Basic
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Lima")
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
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Lima")
    @Column(name = "F_Pago_Anticipo_Prog", nullable = false)
    private Date fPagoAnticipoProg;
    @Basic
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Lima")
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
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "America/Lima")
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
