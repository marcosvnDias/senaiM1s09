package com.m1s09.senaiM1s09.controller;

import com.m1s09.senaiM1s09.enties.EmprestimoEntity;
import com.m1s09.senaiM1s09.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @GetMapping
    public List<EmprestimoEntity> get() {
        return emprestimoService.listar();
    }

    @PostMapping
    public EmprestimoEntity post(@RequestBody EmprestimoEntity emprestimoEntity) {
//        return emprestimoEntity;
        return emprestimoService.adicionar(emprestimoEntity);
    }

    @PutMapping
    public EmprestimoEntity put(@RequestBody EmprestimoEntity emprestimoEntity) {
        return emprestimoService.atualizar(emprestimoEntity);
    }

    @DeleteMapping
    public void delete(@RequestBody EmprestimoEntity emprestimoEntity) {
        emprestimoService.excluir(emprestimoEntity);
    }
}
