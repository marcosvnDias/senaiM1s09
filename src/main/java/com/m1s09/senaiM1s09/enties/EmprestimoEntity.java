package com.m1s09.senaiM1s09.enties;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "emprestimo")
@Data
public class EmprestimoEntity {
    @Id private Long id;

    @ManyToOne
    private LivroEntity livro;

    @ManyToOne
    private MembroEntity membro;

    @Column(name = "data_emprestimo")
    private Date dataEmprestimo;

    @Column(name = "data_devolucao")
    private Date dataDevolucao;
}

