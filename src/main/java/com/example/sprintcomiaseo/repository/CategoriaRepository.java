package com.example.sprintcomiaseo.repository;


import com.example.sprintcomiaseo.entity.Categoria;
import com.example.sprintcomiaseo.entity.InvSubgrupos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    @Query(value = "select C_Grupo, Rtrim(D_Grupo)Grupo,rtrim(C_Subgrupo)C_Subgrupo, 'http://190.110.214.14/comi/'+ RTRIM(C_Grupo)+'.jpeg' as Image from V_Inv_Subgrupos",nativeQuery = true)
    Iterable<Categoria> listarCategoriasActivas();
}
