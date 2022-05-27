package com.example.sprintcomiaseo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Fac_Pedidos_Deta")
public class DetallePedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3972480056144893018L;

	@Column(name="C_Empresa")
	private Integer empresa;
	@Id
	@Column (name = "N_Orden_Pedido")
	private String NOrdenPedido;

	@Column(name = "T_Elemento")
	private String TElemento;

	@Column(name = "C_Item")
	private String CItem;

	@Column(name = "C_Despieze2")
	private String CDespieze2;

	@Column(name = "V_Cantidad_Orden")
	private Float VCantidadOrden;

	@Column(name = "V_Valor_Und")
	private Float VValorUnd;

	@Column(name = "V_Por_Descuento")
	private Float VPorDescuento;

	@Column(name = "V_Por_Impuesto")
	private Float VPorImpuesto;

	@Column(name = "F_Recep_Espe_Item")
	private java.sql.Timestamp FRecepEspeItem;

	@Column(name = "F_Recep_Real_Item")
	private java.sql.Timestamp FRecepRealItem;

	@Column(name = "V_Cant_Recepcion")
	private Float VCantRecepcion;

	@Column(name = "V_Cant_Devolucion")
	private Float VCantDevolucion;

	@Column(name = "C_Und_Venta")
	private String CUndVenta;

	@Column(name = "Cant_Desp1")
	private Float CantDesp1;
	@Column(name = "Cant_Desp2")
	private Float CantDesp2;
	@Column(name = "Cant_Desp3")
	private Float CantDesp3;
	@Column(name = "Cant_Desp4")
	private Float CantDesp4;
	@Column(name = "Cant_Desp5")
	private Float CantDesp5;
	@Column(name = "Cant_Desp6")
	private Float CantDesp6;
	@Column(name = "Cant_Desp7")
	private Float CantDesp7;
	@Column(name = "Cant_Desp8")
	private Float CantDesp8;
	@Column(name = "Cant_Desp9")
	private Float CantDesp9;
	@Column(name = "Cant_Desp10")
	private Float CantDesp10;

	@Column(name = "Cant_Remis1")
	private Float CantRemis1;
	@Column(name = "Cant_Remis2")
	private Float CantRemis2;
	@Column(name = "Cant_Remis3")
	private Float CantRemis3;
	@Column(name = "Cant_Remis4")
	private Float CantRemis4;
	@Column(name = "Cant_Remis5")
	private Float CantRemis5;
	@Column(name = "Cant_Remis6")
	private Float CantRemis6;
	@Column(name = "Cant_Remis7")
	private Float CantRemis7;
	@Column(name = "Cant_Remis8")
	private Float CantRemis8;
	@Column(name = "Cant_Remis9")
	private Float CantRemis9;
	@Column(name = "Cant_Remis10")
	private Float CantRemis10;

	@Column(name = "Cant_Devol1")
	private Float CantDevol1;
	@Column(name = "Cant_Devol2")
	private Float CantDevol2;
	@Column(name = "Cant_Devol3")
	private Float CantDevol3;
	@Column(name = "Cant_Devol4")
	private Float CantDevol4;
	@Column(name = "Cant_Devol5")
	private Float CantDevol5;
	@Column(name = "Cant_Devol6")
	private Float CantDevol6;
	@Column(name = "Cant_Devol7")
	private Float CantDevol7;
	@Column(name = "Cant_Devol8")
	private Float CantDevol8;
	@Column(name = "Cant_Devol9")
	private Float CantDevol9;
	@Column(name = "Cant_Devol10")
	private Float CantDevol10;

	@Column(name = "V_Por_Descuento_Pie")
	private Float VPorDescuentoPie;

	@Column(name = "Vlr_Bruto")
	private Float VlrBruto;

	@Column(name = "Vlr_Dcto")
	private Float VlrDcto;

	@Column(name = "Vlr_Neto")
	private Float Vlr_Neto;

	@Column(name = "Vlr_Dcto_Pie")
	private Float VlrDctoPie;

	@Column(name = "Vlr_Neto_Final")
	private Float VlrNetoFinal;

	@Column(name = "Vlr_Impto")
	private Float VlrImpto;

	@Column(name = "Vlr_Total")
	private Float VlrTotal;

	@Column(name = "C_Bodega")
	private String CBodega;

	@Column(name = "Estado_Disponible")
	private String EstadoDisponible;

	@Column(name = "C_Cat_Activo")
	private Integer CCatActivo;

	@Column(name = "C_Cat_Item")
	private Integer CCatItem;

	@Column(name = "V_Pvp")
	private Float VPvp;


}
