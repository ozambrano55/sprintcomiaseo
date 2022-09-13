package com.example.sprintcomiaseo.repository;


import com.example.sprintcomiaseo.entity.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
    @Query(value = "{call sp_login(:correo, :password)}", nativeQuery = true)
   // @Query("SELECT U FROM Funcionario U WHERE U.cFuncionario=:correo AND U.claveFuncionario=:password")
    Optional<Funcionario> login(String correo, String password);
}
