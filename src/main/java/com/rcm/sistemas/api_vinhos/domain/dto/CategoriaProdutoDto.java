package com.rcm.sistemas.api_vinhos.domain.dto;

import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaProdutoDto {

    public CategoriaProdutoDto() {
    }

    public CategoriaProdutoDto(Produto produto) {
        ProdutoNome = produto.getNome();
        CategoriaNome = produto.getCategoria().getNome().toLowerCase();
    }

    private String ProdutoNome;
    private String CategoriaNome;

}
