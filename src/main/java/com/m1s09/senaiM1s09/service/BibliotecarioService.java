package com.m1s09.senaiM1s09.service;

import com.m1s09.senaiM1s09.enties.BibliotecarioEntity;
import com.m1s09.senaiM1s09.repository.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {
    public BibliotecarioRepository bibliotecarioRepository;

    @Autowired
    public BibliotecarioService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    public List<BibliotecarioEntity> listar() {
        return bibliotecarioRepository.findAll();
    }

    public BibliotecarioEntity adicionar(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }

    public void excluir(BibliotecarioEntity bibliotecarioEntity) {
        bibliotecarioRepository.delete(bibliotecarioEntity);
    }

    public BibliotecarioEntity atualizar(BibliotecarioEntity bibliotecarioEntity) {
        bibliotecarioRepository.update(
                bibliotecarioEntity.getNome(),
                bibliotecarioEntity.getEmail(),
                bibliotecarioEntity.getSenha(),
                bibliotecarioEntity.getId()
        );

        return bibliotecarioEntity;
    }
}
