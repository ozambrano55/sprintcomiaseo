package com.example.sprintcomiaseo.service;


import com.example.sprintcomiaseo.entity.FacPedidosDeta;
import com.example.sprintcomiaseo.repository.DetallePedidoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DetallePedidoService {
    private final DetallePedidoRepository repository;

    public DetallePedidoService(DetallePedidoRepository repository) {
        this.repository = repository;
    }
    //Método para guardar detalles del pedido
    public void guardarDetalles(Iterable<FacPedidosDeta> detalle){
        this.repository.saveAll(detalle);
    }
}
