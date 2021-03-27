package com.silvasdesenvolvimento.playground.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VendaPrdutoDto {
    private long en_cod;

    @NotNull (message = "en_nom é obrigatório!")
    private String en_nom;

    private String en_flg_tip_pessoa;

    public long getEn_cod() {
        return en_cod;
    }

    public void setEn_cod(long en_cod) {
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
