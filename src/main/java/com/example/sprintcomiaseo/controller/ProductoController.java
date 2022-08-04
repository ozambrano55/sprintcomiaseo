package com.example.sprintcomiaseo.controller;


import com.example.sprintcomiaseo.service.ProductoService;
import com.example.sprintcomiaseo.utils.GenericResponse;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("api/producto")
@Component
public class ProductoController {
    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse listarProductosRecomendados(){
        return this.service.listarProductosRecomendados();
    }
    @GetMapping("/{idC}")
    public GenericResponse listarProductosPorCategoria(@PathVariable String idC){
        return this.service.listarProductosPorCategoria(idC);
    }
}
