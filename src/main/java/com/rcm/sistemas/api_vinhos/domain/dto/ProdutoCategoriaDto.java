package com.rcm.sistemas.api_vinhos.domain.dto;

import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoCategoriaDto {

    public ProdutoCategoriaDto() {
    }

    public ProdutoCategoriaDto(Produto produto) {
        ProdutoNome = produto.getNome();
        CategoriaNome = produto.getCategoria().getNome().toLowerCase();
    }

    private String ProdutoNome;
    private String CategoriaNome;

}
