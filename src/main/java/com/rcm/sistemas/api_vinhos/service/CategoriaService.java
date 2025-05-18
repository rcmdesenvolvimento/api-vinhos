package com.rcm.sistemas.api_vinhos.service;

import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import com.rcm.sistemas.api_vinhos.repository.CategoriaRepository;
import com.rcm.sistemas.api_vinhos.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final ProdutoRepository produtoRepository;

    public CategoriaService(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.produtoRepository = produtoRepository;
    }

    public List<Categoria> listAllCategoria() {
        return this.categoriaRepository.findAll();
    }

    @Transactional
    public Categoria salvar(Categoria categoria) {
        Categoria cat = this.categoriaRepository.save(categoria);
        for (Produto prod : categoria.getProdutos()) {
            prod.setCategoria(categoria);
            this.produtoRepository.save(prod);
        }
        return cat;
    }

    public Boolean buscaCategoria(Long id) {
        return this.categoriaRepository.existsById(id);
    }


}
