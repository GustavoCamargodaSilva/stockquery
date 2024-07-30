package com.gustavocamargo.stockquery_backend.controller;

import com.gustavocamargo.stockquery_backend.entities.Categoria;
import com.gustavocamargo.stockquery_backend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;
}
