package com.rcm.sistemas.api_vinhos.service;

import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import com.rcm.sistemas.api_vinhos.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listAllCategoria() {
        return this.categoriaRepository.findAll();
    }
}
