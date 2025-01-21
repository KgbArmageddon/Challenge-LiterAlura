package com.literatura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.literatura.service.LivroService;

@RestController
public class MenuController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/menu")
    public String menu() {
        return "1. Buscar livro pelo título\n" +
               "2. Listar livros registrados\n" +
               "3. Listar autores registrados\n" +
               "4. Listar autores vivos em determinado ano\n" +
               "5. Listar livros por idioma\n" +
               "6. Sair";
    }
}
