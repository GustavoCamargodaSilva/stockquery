package com.gustavocamargo.stockquery_backend.repositorio;

import com.gustavocamargo.stockquery_backend.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Long, Categoria> {

}
