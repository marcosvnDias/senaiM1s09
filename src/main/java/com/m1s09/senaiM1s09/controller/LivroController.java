package com.m1s09.senaiM1s09.controller;

import com.m1s09.senaiM1s09.enties.LivroEntity;
import com.m1s09.senaiM1s09.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<LivroEntity> get() {
        return livroService.listar();
    }

    @PostMapping
    public LivroEntity post(@RequestBody LivroEntity livroEntity) {
        return livroService.adicionar(livroEntity);
//        return livroEntity;
    }

    @PutMapping
    public LivroEntity put(@RequestBody LivroEntity livroEntity) {
        return livroService.atualizar(livroEntity);
    }

    @DeleteMapping
    public void delete(@RequestBody LivroEntity livroEntity) {
        livroService.excluir(livroEntity);
    }
}
