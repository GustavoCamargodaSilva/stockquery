package com.gustavocamargo.stockquery_backend.service;

import com.gustavocamargo.stockquery_backend.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepositorio repositorio;
}
