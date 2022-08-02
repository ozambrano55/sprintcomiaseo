package com.example.sprintcomiaseo.repository;


import com.example.sprintcomiaseo.entity.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    @Query(value="SELECT TOP 10 * FROM Pro_Prod_Terminados",nativeQuery = true)
    Iterable<Producto> listarProductosRecomendados();

    @Query(value="SELECT  * FROM Pro_Prod_Terminados WHERE C_Producto_Terminado=: idC", nativeQuery = true)
    Iterable<Producto> listarProductosPorCategoria(int idC);

    /*
    @Modifying
    @Query("UPDATE Producto P SET P.stock=stock-:cant WHERE P.id=:id")
    void descontarStock(int cant, int id);

    @Modifying
    @Query("UPDATE Producto P SET P.stock=stock+:cant WHERE P.id=:id")
    void aumentarStock(int cant, int id);

     */
}
