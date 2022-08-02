package com.example.sprintcomiaseo.entity.dto;


import com.example.sprintcomiaseo.entity.FacPedidosDeta;
import com.example.sprintcomiaseo.entity.FacPedidosEnca;

import java.util.ArrayList;

public class PedidoConDetallesDTO {
    private FacPedidosEnca facPedidosEnca;
    private Iterable<FacPedidosDeta> facPedidosDeta;

    public PedidoConDetallesDTO() {
        this.facPedidosEnca = new FacPedidosEnca();
        this.facPedidosDeta = new ArrayList<>();
    }

    public PedidoConDetallesDTO(FacPedidosEnca facPedidosEnca, Iterable<FacPedidosDeta> facPedidosDeta) {
        this.facPedidosEnca = facPedidosEnca;
        this.facPedidosDeta = facPedidosDeta;
    }

    public FacPedidosEnca getFacPedidosEnca() {
        return facPedidosEnca;
    }

    public void setFacPedidosEnca(FacPedidosEnca facPedidosEnca) {
        this.facPedidosEnca = facPedidosEnca;
    }

    public Iterable<FacPedidosDeta> getFacPedidosDeta() {
        return facPedidosDeta;
    }

    public void setFacPedidosDeta(Iterable<FacPedidosDeta> facPedidosDeta) {
        this.facPedidosDeta = facPedidosDeta;
    }

}
