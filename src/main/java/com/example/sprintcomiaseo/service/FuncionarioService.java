package com.example.sprintcomiaseo.service;


import com.example.sprintcomiaseo.entity.Funcionario;
import com.example.sprintcomiaseo.repository.FuncionarioRepository;
import com.example.sprintcomiaseo.utils.GenericResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

import static com.example.sprintcomiaseo.utils.Global.*;

@Service
@Transactional
public class FuncionarioService {
    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }
    //Método para iniciar sesión
    public GenericResponse<Funcionario> login(String email, String contrasenia){
        Optional<Funcionario> optU = this.repository.login(email, contrasenia);
        if(optU.isPresent()){
            return new GenericResponse<Funcionario>(TIPO_AUTH, RPTA_OK, "Haz iniciado sesión correctamente", optU.get());
        }else{
            return new GenericResponse<Funcionario>(TIPO_AUTH, RPTA_WARNING, "Lo sentimos, ese usuario no existe", new Funcionario());
        }
    }
    //Método para guardar credenciales del Funcionario
   /* public GenericResponse guardarFuncionario(Funcionario u){
        Optional<Funcionario> optU = this.repository.findById (u.getCFuncionario());
        String idf = optU.isPresent() ? optU.get().getCFuncionario() : "0";
        if(idf == "0"){
            return new GenericResponse(TIPO_DATA, RPTA_OK, "Funcionario Registrado Correctamente", this.repository.save(u));
        }else{
            return new GenericResponse(TIPO_DATA, RPTA_OK, "Datos del funcionarnio actualizados", this.repository.save(u));
        }
    }*/
}
