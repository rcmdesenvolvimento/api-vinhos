package com.rcm.sistemas.api_vinhos.controller;

import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import com.rcm.sistemas.api_vinhos.modelmapper.Assembler.CategoriaModelAssembler;
import com.rcm.sistemas.api_vinhos.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;
    private final CategoriaModelAssembler categoriaModelAssembler;

    public CategoriaController(CategoriaService categoriaService,
                               CategoriaModelAssembler categoriaModelAssembler) {
        this.categoriaService = categoriaService;
        this.categoriaModelAssembler = categoriaModelAssembler;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listAllCategoria() {
        return ResponseEntity.ok(this.categoriaService.listAllCategoria());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaDto salvar(@RequestBody CategoriaDto categoriaDto) {
        Categoria categoria = categoriaModelAssembler.toDomain(categoriaDto);
        return this.categoriaModelAssembler.toModel(this.categoriaService.salvar(categoria));
    }
}
