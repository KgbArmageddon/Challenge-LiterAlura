package com.literatura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literatura.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Queries derivadas podem ser adicionadas aqui
}
