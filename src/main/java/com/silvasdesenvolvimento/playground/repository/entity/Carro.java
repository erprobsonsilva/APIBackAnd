package com.silvasdesenvolvimento.playground.repository.entity;

import com.silvasdesenvolvimento.playground.repository.entity.enums.CorCarro;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// Indica que eh uma entidade "objeto de banco de dados" para sua auto criacao
// Classe tem que ter @Id e getters & setters, aki estou simplificando usando anotacao @Data do plugin lombok
@Entity
@Data
public class Carro {

    //  indica qual eh a Pk
    // quando classe tem a anotacao de Entity eh obrigatoro
    @Id
    // genera sequencial, nao eh obrigatorio
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // podemos fazer validacoes assim no controller nao deixamos usuario tentar fazer insercoes invalidas
    // e na base de dados tbm genera um campo com restricoes como as anotacoes
    @NotNull
    @Size(min = 2,  max = 50)
    private String nome;
    @Enumerated(EnumType.STRING)
    private CorCarro cor;

    // varios carros para uma marca
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca_id")
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CorCarro getCor() {
        return cor;
    }

    public void setCor(CorCarro cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
