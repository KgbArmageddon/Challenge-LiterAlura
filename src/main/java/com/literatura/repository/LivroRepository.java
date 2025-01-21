package com.literatura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literatura.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    // Queries derivadas podem ser adicionadas aqui
}
