package com.rcm.sistemas.api_vinhos.controller;

import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import com.rcm.sistemas.api_vinhos.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listAllCategoria() {
        return ResponseEntity.ok(this.categoriaService.listAllCategoria());
    }

}
