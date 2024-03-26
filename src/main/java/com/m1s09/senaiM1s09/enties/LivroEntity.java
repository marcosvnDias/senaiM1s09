package com.m1s09.senaiM1s09.enties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "livro")
@Data
public class LivroEntity {

    @Id private Long id;
    private String titulo;
    private String autor;

    @Column(name = "ano_publicacao")
    private Long anoPublicacao;
}
