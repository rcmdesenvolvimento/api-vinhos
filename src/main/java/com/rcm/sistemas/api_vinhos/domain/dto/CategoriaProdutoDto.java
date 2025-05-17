package com.rcm.sistemas.api_vinhos.domain.dto;

import jakarta.persistence.Column;

public class CategoriaProdutoDto {

    public CategoriaProdutoDto(String produtoNome, String categoriaNome) {
        ProdutoNome = produtoNome;
        CategoriaNome = categoriaNome;
    }

    @Column(name = "prod_nome")
    private String ProdutoNome;

    @Column(name = "cat_nome")
    private String CategoriaNome;

}
