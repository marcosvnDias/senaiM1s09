package com.m1s09.senaiM1s09.controller;

import com.m1s09.senaiM1s09.enties.MembroEntity;
import com.m1s09.senaiM1s09.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membro")
public class MembroContoller {
    private final MembroService membroService;

    public MembroContoller(MembroService membroService) {
        this.membroService = membroService;
    }

    @GetMapping
    public List<MembroEntity> get() {
        return membroService.listar();
    }

    @PostMapping
    public MembroEntity post(@RequestBody MembroEntity membroEntity) {
        return membroService.adicionar(membroEntity);
    }

    @PutMapping
    public MembroEntity put(@RequestBody MembroEntity membroEntity) {
        return membroService.atualizar(membroEntity);
    }

    @DeleteMapping
    public void delete(@RequestBody MembroEntity membroEntity) {
        membroService.excluir(membroEntity);
    }
}
