package com.m1s09.senaiM1s09.service;

import com.m1s09.senaiM1s09.enties.EmprestimoId;
import com.m1s09.senaiM1s09.enties.LivroEntity;
import com.m1s09.senaiM1s09.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {
    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<LivroEntity> listar() {
        return livroRepository.findAll();
    }

    public LivroEntity adicionar(LivroEntity livroEntity){
        return livroRepository.save(livroEntity);
    }

    public void excluir(LivroEntity livroEntity) {
        livroRepository.delete(livroEntity);
    }

    public LivroEntity atualizar(LivroEntity livroEntity) {
        livroRepository.update(
                livroEntity.getTitulo(),
                livroEntity.getAutor(),
                livroEntity.getAnoPublicacao(),
                livroEntity.getId()
        );

        return livroEntity;
    }
}
