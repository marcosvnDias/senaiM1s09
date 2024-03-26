package com.m1s09.senaiM1s09.service;

import com.m1s09.senaiM1s09.enties.MembroEntity;
import com.m1s09.senaiM1s09.repository.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {
    private MembroRepository membroRepository;

    @Autowired
    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public List<MembroEntity> listar() {
        return membroRepository.findAll();
    }

    public MembroEntity adicionar(MembroEntity membroEntity) {
        return membroRepository.save(membroEntity);
    }

    public void excluir(MembroEntity membroEntity) {
        membroRepository.delete(membroEntity);
    }

    public MembroEntity atualizar(MembroEntity membroEntity) {
        membroRepository.update(
                membroEntity.getNome(),
                membroEntity.getEndereco(),
                membroEntity.getTelefone(),
                membroEntity.getId()
        );

        return membroEntity;
    }
}
