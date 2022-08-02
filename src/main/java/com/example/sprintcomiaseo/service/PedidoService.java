package com.example.sprintcomiaseo.service;

import com.example.sprintcomiaseo.entity.FacPedidosEnca;
import com.example.sprintcomiaseo.repository.DetallePedidoRepository;
import com.example.sprintcomiaseo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@CrossOrigin
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    DetallePedidoRepository detallePedidoRepository;

    @GetMapping(path = "/buscar")
    public List<FacPedidosEnca> buscar(){
    return pedidoRepository.findAll();
    }
}
