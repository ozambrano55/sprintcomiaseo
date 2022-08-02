package com.example.sprintcomiaseo.repository;

import com.example.sprintcomiaseo.entity.FacPedidosEnca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("pedidoRepository")
public interface PedidoRepository extends JpaRepository<FacPedidosEnca, Serializable> {
}
