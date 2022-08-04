package com.example.sprintcomiaseo.controller;

import com.example.sprintcomiaseo.entity.dto.GenerarPedidoDTO;
import com.example.sprintcomiaseo.entity.dto.PedidoConDetallesDTO;
import com.example.sprintcomiaseo.service.PedidoService;
import com.example.sprintcomiaseo.utils.GenericResponse;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pedido")
public class PedidoController {
    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }
    //LISTAR PEDIDOS CON DETALLES
    @GetMapping("/misPedidos/{idCli}")
    public GenericResponse<List<PedidoConDetallesDTO>> devolverMisComprasConDetalle(@PathVariable String idCli){
        return this.service.devolverMisCompras(idCli);
    }
/*
    //GUARDAR PEDIDO
    @PostMapping
    public GenericResponse guardarPedido(@RequestBody GenerarPedidoDTO dto){
        return this.service.guardarPedido(dto);
    }
    //ANULAR PEDIDO
    @DeleteMapping("/{id}")
    public GenericResponse anularPedido(@PathVariable int id){
        return this.service.anularPedido(id);
    }
    //EXPORTAR PDF DE ORDEN
    @GetMapping("exportInvoice")
    public ResponseEntity<Resource> exportInvoice(@RequestParam int idCli, @RequestParam int idOrden){
        return this.service.exportInvoice(idCli, idOrden);
    }
*/
}
