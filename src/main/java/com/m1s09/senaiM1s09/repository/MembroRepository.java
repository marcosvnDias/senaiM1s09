package com.m1s09.senaiM1s09.repository;

import com.m1s09.senaiM1s09.enties.MembroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
    @Modifying
    @Transactional
    @Query("update MembroEntity membro set " +
            "membro.nome = :nome, " +
            "membro.endereco = :endereco, " +
            "membro.telefone = :telefone " +
            "where membro.id = :id")
    void update(
            @Param("nome") String nome,
            @Param("endereco") String endereco,
            @Param("telefone") String telefone,
            @Param("id") Long id);
}
