package com.gustavocamargo.stockquery_backend.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dataCriacao;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant ultimaAlteracao;

    public Categoria() { }

    public Categoria(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    @PrePersist
    public void prePersiste(){
        dataCriacao = Instant.now();
    }
    @PreUpdate
    public void preUpdate(){
        ultimaAlteracao = Instant.now();
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

    public Instant getDataCriacao() {
        return dataCriacao;
    }


    public Instant getUltimaAlteracao() {
        return ultimaAlteracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
