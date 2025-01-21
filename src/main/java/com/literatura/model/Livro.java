package com.literatura.model;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String idioma;

    @ManyToOne
    private Autor autor;

    // Getters e setters
}
