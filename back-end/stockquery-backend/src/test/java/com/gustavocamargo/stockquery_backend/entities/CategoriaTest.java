package com.gustavocamargo.stockquery_backend.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CategoriaTest {

        private Categoria categoria;

        @BeforeEach
        public void setUp() {
            categoria = new Categoria();
        }

        @Test
        public void testDefaultConstructor() {
            assertNotNull(categoria);
        }

        @Test
        public void testParameterizedConstructor() {
            Long id = 1L;
            String nome = "Eletrônicos";
            String descricao = "Categoria de eletrônicos";

            Categoria categoria = new Categoria(id, nome, descricao);

            assertEquals(id, categoria.getId());
            assertEquals(nome, categoria.getNome());
            assertEquals(descricao, categoria.getDescricao());
        }

        @Test
        public void testSettersAndGetters() {
            categoria.setId(1L);
            categoria.setNome("Roupas");
            categoria.setDescricao("Categoria de roupas");

            assertEquals(1L, categoria.getId());
            assertEquals("Roupas", categoria.getNome());
            assertEquals("Categoria de roupas", categoria.getDescricao());
        }

        @Test
        public void testPrePersist() {
            categoria.prePersiste();
            assertNotNull(categoria.getDataCriacao());
            assertNull(categoria.getUltimaAlteracao()); // Deveria ser null após @PrePersist
        }

        @Test
        public void testPreUpdate() {
            categoria.preUpdate();
            assertNotNull(categoria.getUltimaAlteracao());
        }
    }
