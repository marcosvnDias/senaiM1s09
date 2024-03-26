package com.m1s09.senaiM1s09.controller;

import com.m1s09.senaiM1s09.enties.VisitanteEntity;
import com.m1s09.senaiM1s09.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitante")
public class VisitanteController {
    private final VisitanteService visitanteService;

    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }

    @GetMapping
    public List<VisitanteEntity> get() {
        return visitanteService.listar();
    }

    @PostMapping
    public VisitanteEntity post(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvar(visitanteEntity);
    }

    @PutMapping
    public VisitanteEntity put(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.atualizar(visitanteEntity);
    }

    @DeleteMapping
    public void delete(@RequestBody VisitanteEntity visitanteEntity){
        visitanteService.excluir(visitanteEntity);
    }
}
