package com.silvasdesenvolvimento.playground.rest.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SimplesObject {

    @NotNull
    // Annotacoes tem suas proprias mensages de erros (ingles) podemos sobreescrever
    @Size(min = 2, max = 20, message = "Nome deve conter entre 2 a 20 caracteres")
    private String nome;
    private String info;

    public SimplesObject() {
    }

    public SimplesObject(String nome, String info) {
        this.nome = nome;
        this.info = info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "SimplesObject{" +
                "nome='" + nome + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
