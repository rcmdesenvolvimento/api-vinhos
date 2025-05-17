package com.rcm.sistemas.api_vinhos.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Categoria {

    @Id
    @Column(name = "categ_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "categ_nome", length = 100, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();

}
