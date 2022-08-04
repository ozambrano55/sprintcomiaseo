package com.example.sprintcomiaseo.service;


import com.example.sprintcomiaseo.entity.FacPedidosDeta;
import com.example.sprintcomiaseo.entity.FacPedidosEnca;
import com.example.sprintcomiaseo.entity.dto.GenerarPedidoDTO;
import com.example.sprintcomiaseo.entity.dto.PedidoConDetallesDTO;
import com.example.sprintcomiaseo.repository.DetallePedidoRepository;
import com.example.sprintcomiaseo.repository.PedidoRepository;
import com.example.sprintcomiaseo.utils.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.sprintcomiaseo.utils.Global.*;



@RestController
@RequestMapping("/pedido")
@CrossOrigin
public class PedidoService {
    private final PedidoRepository repository;

    private final DetallePedidoRepository detallePedidoRepository;

    private final DetallePedidoService dpService;
//seria producto repository
    //private final PlatilloRepository pRepository;
    public PedidoService(PedidoRepository repository, DetallePedidoRepository detallePedidoRepository, DetallePedidoService dpService
                         ) {
        this.repository = repository;
        this.detallePedidoRepository = detallePedidoRepository;
        this.dpService = dpService;

    }
    //Método para devolver los pedidos con su respectivo detalle
    public GenericResponse<List<PedidoConDetallesDTO>> devolverMisCompras(String idCli) {
        final List<PedidoConDetallesDTO> dtos = new ArrayList<>();
        final Iterable<FacPedidosEnca> pedidos = repository.devolverMisCompras(idCli);
        pedidos.forEach(p -> {
            dtos.add(new PedidoConDetallesDTO(p, detallePedidoRepository.findByPedido(p.getNOrdenPedido())));
        });
        return new GenericResponse(OPERACION_CORRECTA, RPTA_OK, "Petición Encontrada", dtos);
    }
/*
    //Método para guardar el pedido
    public GenericResponse guardarPedido(GenerarPedidoDTO dto) {
        Date date = new Date();
        dto.getFacPedidosEnca().setCEmpresa(3);
        dto.getFacPedidosEnca().setNOrdenPedido(dto.getFacPedidosEnca().getNOrdenPedido());
        dto.getFacPedidosEnca().setNOrdenCotiza(dto.getFacPedidosEnca().getNOrdenCotiza());
        dto.getFacPedidosEnca().setFOrden(new java.sql.Date(date.getTime()));
        this.repository.save(dto.getFacPedidosEnca());
        for (FacPedidosDeta dp : dto.getFacPedidosDeta()) {
            dp.setFacPedidosEnca(dto.getFacPedidosEnca());
            //this.pRepository.descontarStock(dp.getCantidad(), dp.getPlatillo().getId());
        }
        //Llamamos al DetallePedidoService
        this.dpService.guardarDetalles(dto.getFacPedidosDeta());
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, dto);

    }*/
  /*
   @Autowired
   PedidoRepository pedidoRepository;

   @Autowired
    DetallePedidoRepository detallePedidoRepository;
   @GetMapping(path="/buscar")
    public List<FacPedidosEnca>buscar(){
       return pedidoRepository.findAll();
   }

   */

}
