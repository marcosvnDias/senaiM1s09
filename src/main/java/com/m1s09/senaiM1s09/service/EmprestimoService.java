package com.m1s09.senaiM1s09.service;

import com.m1s09.senaiM1s09.enties.EmprestimoEntity;
import com.m1s09.senaiM1s09.repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {
    private EmprestimoRepository emprestimoRepository;

    @Autowired
    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public List<EmprestimoEntity> listar() {
        return emprestimoRepository.findAll();
    }

    public EmprestimoEntity adicionar(EmprestimoEntity emprestimoEntity) {
        return emprestimoRepository.save(emprestimoEntity);
    }

    public void excluir(EmprestimoEntity emprestimoEntity) {
        emprestimoRepository.delete(emprestimoEntity);
    }

    public EmprestimoEntity atualizar(EmprestimoEntity emprestimoEntity){
        emprestimoRepository.update(
          emprestimoEntity.getDataEmprestimo(),
          emprestimoEntity.getDataDevolucao(),
          emprestimoEntity.getId()
        );

        return emprestimoEntity;
    }
}
