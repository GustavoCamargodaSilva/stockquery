package com.gustavocamargo.stockquery_backend.dto;

import com.gustavocamargo.stockquery_backend.entities.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class CategoriaDTOTest {

    @Test
    public void testDefaultConstructor() {
        CategoriaDTO dto = new CategoriaDTO();
        assertNull(dto.getId(), "Id produto nao pode estar vazio!");
        assertNull(dto.getNome(), "Nome do produto nao pode estar vazio!");
        assertNull(dto.getDescricao(), "Descricao do produto nao pode estar vazio!");
    }

    @Test
    public void testConstrutorParametrizado() {
        Long id = 1L;
        String nome = "Categoria A";
        String descricao = "Descricao da Categoria A";

        CategoriaDTO dto = new CategoriaDTO(id, nome, descricao);

        assertEquals(id, dto.getId(), "ID deve ser igual");
        assertEquals(nome, dto.getNome(), "Nome deve ser igual");
        assertEquals(descricao, dto.getDescricao(), "Descricao deve ser igual");
    }

    @Test
    public void testSettersEGetters() {
        CategoriaDTO dto = new CategoriaDTO();

        dto.setId(2L);
        dto.setNome("Categoria B");
        dto.setDescricao("Descricao da Categoria B");

        assertEquals(2L, dto.getId(), "ID deve ser igual");
        assertEquals("Categoria B", dto.getNome(), "Nome deve ser igual");
        assertEquals("Descricao da Categoria B", dto.getDescricao(), "Descricao deve ser igual");
    }

    @Test
    public void testConstrutorAPartirDaEntidade() {
        Categoria categoria = new Categoria();
        categoria.setId(3L);
        categoria.setNome("Categoria C");
        categoria.setDescricao("Descricao da Categoria C");

        CategoriaDTO dto = new CategoriaDTO(categoria);

        assertEquals(3L, dto.getId(), "ID deve ser igual");
        assertEquals("Categoria C", dto.getNome(), "Nome deve ser igual");
        assertEquals("Descricao da Categoria C", dto.getDescricao(), "Descricao deve ser igual");
    }
}
