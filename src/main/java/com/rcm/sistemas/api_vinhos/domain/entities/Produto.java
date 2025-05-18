package com.rcm.sistemas.api_vinhos.domain.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produto {

    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "prod_nome", length = 100, nullable = false)
    private String nome;

    @NotBlank
    @Column(name = "prod_quantidade", length = 100, nullable = false)
    private String quantidade;

    @NotBlank
    @Column(name = "prod_preco", nullable = false)
    private BigDecimal preco;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    @JoinColumn(name = "categ_id", referencedColumnName = "categ_id")
    private Categoria categoria;
}
