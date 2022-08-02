package com.example.sprintcomiaseo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FacPedidosEncaPK implements Serializable {
    @Column(name = "C_Empresa", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cEmpresa;
    @Column(name = "N_Orden_Pedido", nullable = false, length = 15)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nOrdenPedido;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacPedidosEncaPK that = (FacPedidosEncaPK) o;
        return Objects.equals(cEmpresa, that.cEmpresa) && Objects.equals(nOrdenPedido, that.nOrdenPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cEmpresa, nOrdenPedido);
    }
}
