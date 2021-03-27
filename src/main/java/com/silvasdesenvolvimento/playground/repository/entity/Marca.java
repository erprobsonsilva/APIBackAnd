package com.silvasdesenvolvimento.playground.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

// aqui usando anotacoes de lombok @Getter @Setter
@Getter
@Setter
@Entity
public class Marca {

    @Id
    private String nome;
    private String xxx;
}
