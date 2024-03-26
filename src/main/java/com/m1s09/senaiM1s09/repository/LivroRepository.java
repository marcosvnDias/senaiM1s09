package com.m1s09.senaiM1s09.repository;

import com.m1s09.senaiM1s09.enties.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
    @Modifying
    @Transactional
    @Query("update LivroEntity livro set " +
            "livro.titulo = :titulo, " +
            "livro.autor = :autor, " +
            "livro.anoPublicacao = :anoPublicacao " +
            "where livro.id = :id")
    void update(
            @Param("titulo") String titulo,
            @Param("autor") String autor,
            @Param("anoPublicacao") Long anoPublicacao,
            @Param("id") Long id);
}
