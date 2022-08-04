package com.example.sprintcomiaseo.repository;


import com.example.sprintcomiaseo.entity.FacPedidosEnca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

public interface PedidoRepository extends CrudRepository<FacPedidosEnca, Integer> {
    @Query("SELECT P FROM FacPedidosEnca P WHERE P.cCodCliente=:idCli")
    Iterable<FacPedidosEnca> devolverMisCompras(String idCli);
    @Query("SELECT P FROM FacPedidosEnca P WHERE P.nOrdenPedidoS=:idOrden AND P.cCodCliente=:idCli")
    Optional<FacPedidosEnca> findByIdAndClienteId(String idCli, String idOrden);
}

/*
@Repository("pedidoRepository")
public interface PedidoRepository extends JpaRepository<FacPedidosEnca, Serializable> {

 */
