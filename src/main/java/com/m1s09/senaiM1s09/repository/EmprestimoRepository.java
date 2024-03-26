package com.m1s09.senaiM1s09.repository;

import com.m1s09.senaiM1s09.enties.EmprestimoEntity;
import com.m1s09.senaiM1s09.enties.EmprestimoId;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, EmprestimoId> {
    @Modifying
    @Transactional
    @Query("update EmprestimoEntity emprestimo set " +
            "emprestimo.dataEmprestimo = :dataEmprestimo, " +
            "emprestimo.dataDevolucao = :dataDevolucao " +
            "where emprestimo.id = :id")
    void update(
            @Param("dataEmprestimo") Date dataEmprestimo,
            @Param("dataDevolucao") Date dataDevolucao,
            @Param("id") Long id);
}
