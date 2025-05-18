package com.rcm.sistemas.api_vinhos.controller;

import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaDto;
import com.rcm.sistemas.api_vinhos.domain.dto.CategoriaProdutoDto;
import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import com.rcm.sistemas.api_vinhos.modelmapper.Assembler.CategoriaModelAssembler;
import com.rcm.sistemas.api_vinhos.service.CategoriaService;
import jakarta.validation.Valid;
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
    public ResponseEntity<List<CategoriaDto>> listAllCategoria() {
        return ResponseEntity.ok(this.categoriaModelAssembler.toCollectionModel(this.categoriaService.listAllCategoria()));
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public CategoriaDto salvar(@RequestBody CategoriaDto categoriaDto) {
//        Categoria categoria = categoriaModelAssembler.toDomain(categoriaDto);
//        categoria.setProdutos(categoriaDto.getProdutos());
//        return this.categoriaModelAssembler.toModel(this.categoriaService.salvar(categoria));
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria salvar(@RequestBody Categoria categoria) {
        //Categoria categoria = categoriaModelAssembler.toDomain(categoriaDto);
        //categoria.setProdutos(categoria.getProdutos());
        return this.categoriaService.salvar(categoria);
    }
}
