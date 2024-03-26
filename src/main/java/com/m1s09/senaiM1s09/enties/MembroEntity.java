package com.m1s09.senaiM1s09.enties;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "membro")
@Data
public class MembroEntity {
    @Id private Long id;
    private String nome;
    private String endereco;
    private String telefone;
}
