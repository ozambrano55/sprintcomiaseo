package com.example.sprintcomiaseo.repository;

import com.example.sprintcomiaseo.entity.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("detallePedidoRepository")
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Serializable> {

}
