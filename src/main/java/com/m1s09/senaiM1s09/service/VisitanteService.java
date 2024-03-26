package com.m1s09.senaiM1s09.service;

import com.m1s09.senaiM1s09.enties.VisitanteEntity;
import com.m1s09.senaiM1s09.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {
    private VisitanteRepository visitanteRepository;

    @Autowired
    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    public List<VisitanteEntity> listar() {
        return visitanteRepository.findAll();
    }

    public VisitanteEntity salvar(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }

    public void excluir(VisitanteEntity visitanteEntity) {
        visitanteRepository.delete(visitanteEntity);
    }

    public VisitanteEntity atualizar(VisitanteEntity visitanteEntity) {
         visitanteRepository.update(
                visitanteEntity.getNome(),
                visitanteEntity.getTelefone(),
                visitanteEntity.getId());

//      return visitanteRepository.save(visitanteEntity);
        return visitanteEntity;
    }
}
