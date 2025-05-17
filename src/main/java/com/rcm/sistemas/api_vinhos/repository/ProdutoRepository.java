package com.rcm.sistemas.api_vinhos.repository;

import com.rcm.sistemas.api_vinhos.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    //    @Query(value = "Select cat.categ_id, cat.categ_nome as nomeCategoria, "+
//                           "prod.prod_id,prod.prod_nome, prod.prod_preco, prod.prod_quantidade "+
//                           "from categoria cat join produto prod on cat.categ_id = prod.categ_id", nativeQuery = true)
    Optional<Produto> findById(Long id);

}

// Alga 11.10
