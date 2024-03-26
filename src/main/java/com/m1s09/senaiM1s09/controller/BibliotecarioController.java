package com.m1s09.senaiM1s09.controller;

import com.m1s09.senaiM1s09.enties.BibliotecarioEntity;
import com.m1s09.senaiM1s09.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {
    private final BibliotecarioService bibliotecarioService;

    public BibliotecarioController(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }

    @GetMapping
    public List<BibliotecarioEntity> get() {
        return bibliotecarioService.listar();
    }

    @PostMapping
    public BibliotecarioEntity post(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.adicionar(bibliotecarioEntity);
    }

    @PutMapping
    public BibliotecarioEntity put(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.atualizar(bibliotecarioEntity);
    }

    @DeleteMapping
    public void delete(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        bibliotecarioService.excluir(bibliotecarioEntity);
    }
}
