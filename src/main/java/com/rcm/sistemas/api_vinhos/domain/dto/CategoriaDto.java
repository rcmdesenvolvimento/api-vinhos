package com.rcm.sistemas.api_vinhos.domain.dto;

import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CategoriaDto {

    private String nome;
    private List<Produto> produtos = new ArrayList<>();
}
