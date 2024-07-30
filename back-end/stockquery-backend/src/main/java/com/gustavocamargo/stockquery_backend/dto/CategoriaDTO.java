package com.gustavocamargo.stockquery_backend.dto;

import com.gustavocamargo.stockquery_backend.entities.Categoria;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public class CategoriaDTO {

    @NotNull(message = "Id produto nao pode estar vazio!")
    private Long id;
    @NotNull(message = "Nome do produto nao pode estar vazio!")
    private String nome;
    @NotNull(message = "Descricao do produto nao pode estar vazio!")
    @Column(columnDefinition = "TEXT")
    private String descricao;

    public CategoriaDTO() { }

    public CategoriaDTO(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public CategoriaDTO(Categoria entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.descricao = entity.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
