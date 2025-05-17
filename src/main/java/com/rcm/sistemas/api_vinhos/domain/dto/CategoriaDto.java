package com.rcm.sistemas.api_vinhos.domain.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class CategoriaDto {

    @NotBlank
    private String nome;
}
