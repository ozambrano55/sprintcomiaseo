package com.example.sprintcomiaseo.controller;

import com.example.sprintcomiaseo.entity.Funcionario;
import com.example.sprintcomiaseo.entity.Usuario;
import com.example.sprintcomiaseo.service.FuncionarioService;
import com.example.sprintcomiaseo.service.UsuarioService;
import com.example.sprintcomiaseo.utils.GenericResponse;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/funcionario")
public class FuncionarioController {
    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }
    @PostMapping("/login")
    public GenericResponse<Funcionario> login(HttpServletRequest request){
        String email = request.getParameter("email");
        String contrasenia = request.getParameter("pass");
        return this.service.login(email, contrasenia);
    }
    /*
    @PostMapping
    public GenericResponse save(@RequestBody Funcionario u){
        return this.service.guardarFuncionario(u);
    }
    @PutMapping("/{id}")
    public GenericResponse update(@PathVariable int id, @RequestBody Funcionario u){
        return this.service.guardarFuncionario(u);
    }

     */
}
