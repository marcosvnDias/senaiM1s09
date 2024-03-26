package com.m1s09.senaiM1s09.enties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bibliotecario")
@Data
public class BibliotecarioEntity {
    @Id private Long id;
    private String nome;
    private String email;
    private String senha;
}
