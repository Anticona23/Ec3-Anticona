package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer>, CrudRepository<Categoria, Integer> {

    List<Categoria> findByNombre(@Param("nombre") String nombre);
      
}