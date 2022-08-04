package com.example.sprintcomiaseo.entity.dto;


import com.example.sprintcomiaseo.entity.FacPedidosDeta;
import com.example.sprintcomiaseo.entity.FacPedidosEnca;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerarPedidoDTO {
    private FacPedidosEnca facPedidosEnca;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Iterable<FacPedidosDeta> facPedidosDetas;
    // private Cliente cliente;

    public GenerarPedidoDTO() {
    }

    public FacPedidosEnca getFacPedidosEnca() {
        return facPedidosEnca;
    }

    public void setFacPedidosEnca(FacPedidosEnca facPedidosEnca) {
        this.facPedidosEnca = facPedidosEnca;
    }

    public Iterable<FacPedidosDeta> getFacPedidosDeta() {
        return facPedidosDetas;
    }

    public void setFacPedidosDetas(Iterable<FacPedidosDeta> facPedidosDetas) {
        this.facPedidosDetas = facPedidosDetas;
    }








}
