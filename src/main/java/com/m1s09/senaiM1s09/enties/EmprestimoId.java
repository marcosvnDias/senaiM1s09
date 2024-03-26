package com.m1s09.senaiM1s09.enties;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Data
public class EmprestimoId implements Serializable {
    private Long livroId;
    private Long membroId;
}
