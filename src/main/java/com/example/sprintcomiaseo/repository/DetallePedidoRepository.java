package com.example.sprintcomiaseo.repository;

import com.example.sprintcomiaseo.entity.FacPedidosDeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


public interface DetallePedidoRepository extends CrudRepository<FacPedidosDeta, String> {
    @Query(value = "SELECT DP FROM FacPedidosDeta DP WHERE DP.nOrdenPedido=:idP" )
    Iterable<FacPedidosDeta> findByPedido(String idP);
    @Query(value = "SELECT sum(DP.vlr_Total) AS Total FROM Fac_Pedidos_Deta dp inner JOIN Fac_Pedidos_Enca p \n"
            + "ON p.N_Orden_Pedido = dp.N_Orden_Pedido\n"
            + "WHERE p.c_Cod_Cliente =:idCli", nativeQuery = true)
    Double totalByIdCustomer(String idCli);

}

/*
@Repository ("detallePedidoRepository")
public interface DetallePedidoRepository extends JpaRepository<FacPedidosDeta, Serializable> {
}

 */