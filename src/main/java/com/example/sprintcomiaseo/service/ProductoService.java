package com.example.sprintcomiaseo.service;

import com.example.sprintcomiaseo.repository.ProductoRepository;
import com.example.sprintcomiaseo.utils.GenericResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static com.example.sprintcomiaseo.utils.Global.*;

@Service
@Transactional
@Component
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }
    public GenericResponse listarProductosRecomendados(){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarProductosRecomendados());
    }
    public GenericResponse listarProductosPorCategoria(String idC){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarProductosPorCategoria(idC));
    }
}
