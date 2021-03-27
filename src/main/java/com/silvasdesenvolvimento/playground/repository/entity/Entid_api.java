package com.silvasdesenvolvimento.playground.repository.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

// Indica que eh uma entidade "objeto de banco de dados" para sua auto criacao
// Classe tem que ter @Id e getters & setters, aki estou simplificando usando anotacao @Data do plugin lombok
@Entity
@Data
public class Entid_api {

    //  indica qual eh a Pk
    // quando classe tem a anotacao de Entity eh obrigatoro

    @Id
    // genera sequencial, nao eh obrigatorio
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long en_cod;
    private String en_nom;
    private String en_flg_tip_pessoa;

    public Long getEn_cod() {
        return en_cod;
    }

    public void setEn_cod(Long en_cod) {
        this.en_cod = en_cod;
    }

    public String getEn_nom() {
        return en_nom;
    }

    public void setEn_nom(String en_nom) {
        this.en_nom = en_nom;
    }

    public String getEn_flg_tip_pessoa() {
        return en_flg_tip_pessoa;
    }

    public void setEn_flg_tip_pessoa(String en_flg_tip_pessoa) {
        this.en_flg_tip_pessoa = en_flg_tip_pessoa;
    }
}
