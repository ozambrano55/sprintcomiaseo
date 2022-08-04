package com.example.sprintcomiaseo.repository;


import com.example.sprintcomiaseo.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, String> {
    @Query(value="SELECT P FROM Producto P")
    Iterable<Producto> listarProductosRecomendados();

    @Query(value="SELECT  P FROM Producto P WHERE P.categoria =:idC ")
    Iterable<Producto> listarProductosPorCategoria(String idC);

    /*
    @Modifying
    @Query("UPDATE Producto P SET P.stock=stock-:cant WHERE P.id=:id")
    void descontarStock(int cant, int id);

    @Modifying
    @Query("UPDATE Producto P SET P.stock=stock+:cant WHERE P.id=:id")
    void aumentarStock(int cant, int id);

     */
}
