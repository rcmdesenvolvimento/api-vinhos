package com.rcm.sistemas.api_vinhos.repository;

import com.rcm.sistemas.api_vinhos.domain.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
