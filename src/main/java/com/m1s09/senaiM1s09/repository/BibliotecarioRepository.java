package com.m1s09.senaiM1s09.repository;

import com.m1s09.senaiM1s09.enties.BibliotecarioEntity;
import com.m1s09.senaiM1s09.enties.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
    @Modifying
    @Transactional
    @Query("update BibliotecarioEntity bibliotecario set " +
            "bibliotecario.nome = :nome, " +
            "bibliotecario.email = :email, " +
            "bibliotecario.senha = :senha " +
            "where bibliotecario.id = :id")
    void update(
            @Param("nome") String nome,
            @Param("email") String email,
            @Param("senha") String senha,
            @Param("id") Long id);
}
