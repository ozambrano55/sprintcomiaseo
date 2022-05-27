package com.example.sprintcomiaseo.entity;

import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Fac_Pedidos_Enca")
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 779444310440406252L;
	@Id
	@Column(name = "C_Empresa")
	private Integer empresa;
	@Column(name = "N_Orden_Pedido")
	@OneToMany (mappedBy = "NOrdenPedido")
	private List<DetallePedido> detallePedidoList;

	@Column(name = "N_Orden_Cotiza")
	private String NOrdenCotiza;

	@Column(name = "F_Recep_Espe")
	private java.sql.Timestamp FRecepEspe;

	@Column(name = "F_Recep_Real")
	private java.sql.Timestamp FRecepReal;

	@Column(name = "C_Tipo_Tercero")
	private String CTipoTercero;

	@Column(name = "C_Cod_Cliente")
	private String CCodCliente;

	@Column(name = "P_Direccion_Cliente")
	private String PDireccionCliente;

	@Column(name = "P_C_Ciudad")
	private String PCCiudad;

	@Column(name = "P_Cod_Postal")
	private String PCodPostal;

	@Column(name = "P_Tel1")
	private String P_Tel1;

	@Column(name = "P_Fax")
	private String PFax;

	@Column(name = "R_Direccion")
	private String RDireccion;

	@Column(name = "R_C_Ciudad")
	private String RCCiudad;

	@Column(name = "R_Cod_Postal")
	private String RCodPostal;

	@Column(name = "R_Tel1")
	private String RTel1;

	@Column(name = "R_Fax")
	private String RFax;

	@Column(name = "V_Por_Anticipo")
	private Float VPorAnticipo;

	@Column(name = "V_Dias_Saldo")
	private Short VDiasSaldo;

	@Column(name = "F_Pago_Anticipo_Prog")
	private java.sql.Timestamp FPagoAnticipoProg;

	@Column(name = "F_Pago_Saldo_Prog")
	private java.sql.Timestamp FPagoSaldoProg;

	@Column(name = "N_Comentario")
	private String NComentario;

	@Column(name = "C_Funcionario")
	private String CFuncionario;

	@Column(name = "Estado_Orden")
	private Boolean EstadoOrden;

	@Column(name = "Estado_Proceso")
	private Integer EstadoProceso;

	@Column(name = "V_Por_Descuento_Pie")
	private Float VPorDescuentoPie;

	@Column(name = "V_Fletes")
	private Float VFletes;

	@Column(name = "V_Manipulacion")
	private Float VManipulacion;

	@Column(name = "F_Grabacion")
	private java.sql.Timestamp FGrabacion;

	@Column(name = "C_Punto_Venta")
	private String CPuntoVenta;

	@Column(name = "C_Vendedor")
	private String CVendedor;

	@Column(name = "C_Director")
	private String CDirector;

	@Column(name = "C_Zona_Fac")
	private String CZonaFac;

	@Column(name = "C_Lista_Precios")
	private String CListaPrecios;

	@Column(name = "C_Condicion_Pago")
	private String CCondicionPago;

	@Column(name = "C_Tipo_Factura")
	private String CTipoFactura;

	@Column(name = "C_Dcto_Financiero")
	private String CDctoFinanciero;

	@Column(name = "T_Con_RTF")
	private String TConRTF;

	@Column(name = "C_Con_RTF")
	private Short CConRTF;

	@Column(name = "T_Con_Ica")
	private String TConIca;

	@Column(name = "C_Con_ICA")
	private Short CConICA;

	@Column(name = "C_Campana")
	private String CCampana;

	@Column(name = "C_Lider")
	private String CLider;

	@Column(name = "C_Tipo_Pago")
	private String CTipoPago;

	@Column(name = "Estado_Impresion")
	private String EstadoImpresion;

	@Column(name = "C_Fun_Pik")
	private String CFunPik;

	@Column(name = "Aprobado_Factu")
	private String AprobadoFactu;

	@Column(name = "C_Cat_Pedido")
	private Integer CCatPedido;

	@Column(name = "Estado_Factu")
	private String EstadoFactu;

	@Column(name = "tipo_ped")
	private String tipoPed;

	@Column(name = "Dato_Ref1")
	private String DatoRef1;
}
