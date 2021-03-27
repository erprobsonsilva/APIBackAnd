package com.silvasdesenvolvimento.playground.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

// Indica que eh uma entidade "objeto de banco de dados" para sua auto criacao
// Classe tem que ter @Id e getters & setters, aki estou simplificando usando anotacao @Data do plugin lombok
@Entity(name = "venda_prduto")
@Data
public class VendaPrduto {

    //  indica qual eh a Pk
    // quando classe tem a anotacao de Entity eh obrigatoro
    // genera sequencial, nao eh obrigatorio
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private double em_cod;
    private double fi_cod;
    private double pr_cod;
    private Date vepr_dat_venda;
    private double vepr_qtd_vendda;
    private double vepr_val_venddo;
    private double vepr_val_impost;
    private double vepr_val_custo_medio;
    private double vepr_qtd_sobra;
    private double vepr_val_sobra;
    private double vepr_qtd_quebra;
    private double vepr_val_quebra;
    private double vepr_val_preco_custo;
    private double vepr_pr_val_ult_prcom;
    private double vepr_val_icms;
    private double vepr_val_pis;
    private double vepr_val_cofins;
    private double vepr_val_outros;
    private double vepr_val_cpmf;
    private double vepr_val_venddo_nfen;
    private double vepr_val_impost_nfen;
    private double vepr_val_custo_medio_nfen;
    private double vepr_val_preco_custo_nfen;
    private double vepr_val_icms_nfen;
    private double vepr_val_pis_nfen;
    private double vepr_val_cofins_nfen;
    private double vepr_val_outros_nfen;
    private double vepr_val_cpmf_nfen;
    private double vepr_qtd_digitad;
    private double vepr_qtd_item_regstdo;
    private double vepr_qtd_devolv;
    private double vepr_val_devolv;
    private double vepr_qtd_prom;
    private double vepr_val_imp_devolv;
    private double vepr_val_cmv_devolv;

    public double getEm_cod() {
        return em_cod;
    }

    public void setEm_cod(double em_cod) {
        this.em_cod = em_cod;
    }

    public double getFi_cod() {
        return fi_cod;
    }

    public void setFi_cod(double fi_cod) {
        this.fi_cod = fi_cod;
    }

    public double getPr_cod() {
        return pr_cod;
    }

    public void setPr_cod(double pr_cod) {
        this.pr_cod = pr_cod;
    }

    public Date getVepr_dat_venda() {
        return vepr_dat_venda;
    }

    public void setVepr_dat_venda(Date vepr_dat_venda) {
        this.vepr_dat_venda = vepr_dat_venda;
    }

    public double getVepr_qtd_vendda() {
        return vepr_qtd_vendda;
    }

    public void setVepr_qtd_vendda(double vepr_qtd_vendda) {
        this.vepr_qtd_vendda = vepr_qtd_vendda;
    }

    public double getVepr_val_venddo() {
        return vepr_val_venddo;
    }

    public void setVepr_val_venddo(double vepr_val_venddo) {
        this.vepr_val_venddo = vepr_val_venddo;
    }

    public double getVepr_val_impost() {
        return vepr_val_impost;
    }

    public void setVepr_val_impost(double vepr_val_impost) {
        this.vepr_val_impost = vepr_val_impost;
    }

    public double getVepr_val_custo_medio() {
        return vepr_val_custo_medio;
    }

    public void setVepr_val_custo_medio(double vepr_val_custo_medio) {
        this.vepr_val_custo_medio = vepr_val_custo_medio;
    }

    public double getVepr_qtd_sobra() {
        return vepr_qtd_sobra;
    }

    public void setVepr_qtd_sobra(double vepr_qtd_sobra) {
        this.vepr_qtd_sobra = vepr_qtd_sobra;
    }

    public double getVepr_val_sobra() {
        return vepr_val_sobra;
    }

    public void setVepr_val_sobra(double vepr_val_sobra) {
        this.vepr_val_sobra = vepr_val_sobra;
    }

    public double getVepr_qtd_quebra() {
        return vepr_qtd_quebra;
    }

    public void setVepr_qtd_quebra(double vepr_qtd_quebra) {
        this.vepr_qtd_quebra = vepr_qtd_quebra;
    }

    public double getVepr_val_quebra() {
        return vepr_val_quebra;
    }

    public void setVepr_val_quebra(double vepr_val_quebra) {
        this.vepr_val_quebra = vepr_val_quebra;
    }

    public double getVepr_val_preco_custo() {
        return vepr_val_preco_custo;
    }

    public void setVepr_val_preco_custo(double vepr_val_preco_custo) {
        this.vepr_val_preco_custo = vepr_val_preco_custo;
    }

    public double getVepr_pr_val_ult_prcom() {
        return vepr_pr_val_ult_prcom;
    }

    public void setVepr_pr_val_ult_prcom(double vepr_pr_val_ult_prcom) {
        this.vepr_pr_val_ult_prcom = vepr_pr_val_ult_prcom;
    }

    public double getVepr_val_icms() {
        return vepr_val_icms;
    }

    public void setVepr_val_icms(double vepr_val_icms) {
        this.vepr_val_icms = vepr_val_icms;
    }

    public double getVepr_val_pis() {
        return vepr_val_pis;
    }

    public void setVepr_val_pis(double vepr_val_pis) {
        this.vepr_val_pis = vepr_val_pis;
    }

    public double getVepr_val_cofins() {
        return vepr_val_cofins;
    }

    public void setVepr_val_cofins(double vepr_val_cofins) {
        this.vepr_val_cofins = vepr_val_cofins;
    }

    public double getVepr_val_outros() {
        return vepr_val_outros;
    }

    public void setVepr_val_outros(double vepr_val_outros) {
        this.vepr_val_outros = vepr_val_outros;
    }

    public double getVepr_val_cpmf() {
        return vepr_val_cpmf;
    }

    public void setVepr_val_cpmf(double vepr_val_cpmf) {
        this.vepr_val_cpmf = vepr_val_cpmf;
    }

    public double getVepr_val_venddo_nfen() {
        return vepr_val_venddo_nfen;
    }

    public void setVepr_val_venddo_nfen(double vepr_val_venddo_nfen) {
        this.vepr_val_venddo_nfen = vepr_val_venddo_nfen;
    }

    public double getVepr_val_impost_nfen() {
        return vepr_val_impost_nfen;
    }

    public void setVepr_val_impost_nfen(double vepr_val_impost_nfen) {
        this.vepr_val_impost_nfen = vepr_val_impost_nfen;
    }

    public double getVepr_val_custo_medio_nfen() {
        return vepr_val_custo_medio_nfen;
    }

    public void setVepr_val_custo_medio_nfen(double vepr_val_custo_medio_nfen) {
        this.vepr_val_custo_medio_nfen = vepr_val_custo_medio_nfen;
    }

    public double getVepr_val_preco_custo_nfen() {
        return vepr_val_preco_custo_nfen;
    }

    public void setVepr_val_preco_custo_nfen(double vepr_val_preco_custo_nfen) {
        this.vepr_val_preco_custo_nfen = vepr_val_preco_custo_nfen;
    }

    public double getVepr_val_icms_nfen() {
        return vepr_val_icms_nfen;
    }

    public void setVepr_val_icms_nfen(double vepr_val_icms_nfen) {
        this.vepr_val_icms_nfen = vepr_val_icms_nfen;
    }

    public double getVepr_val_pis_nfen() {
        return vepr_val_pis_nfen;
    }

    public void setVepr_val_pis_nfen(double vepr_val_pis_nfen) {
        this.vepr_val_pis_nfen = vepr_val_pis_nfen;
    }

    public double getVepr_val_cofins_nfen() {
        return vepr_val_cofins_nfen;
    }

    public void setVepr_val_cofins_nfen(double vepr_val_cofins_nfen) {
        this.vepr_val_cofins_nfen = vepr_val_cofins_nfen;
    }

    public double getVepr_val_outros_nfen() {
        return vepr_val_outros_nfen;
    }

    public void setVepr_val_outros_nfen(double vepr_val_outros_nfen) {
        this.vepr_val_outros_nfen = vepr_val_outros_nfen;
    }

    public double getVepr_val_cpmf_nfen() {
        return vepr_val_cpmf_nfen;
    }

    public void setVepr_val_cpmf_nfen(double vepr_val_cpmf_nfen) {
        this.vepr_val_cpmf_nfen = vepr_val_cpmf_nfen;
    }

    public double getVepr_qtd_digitad() {
        return vepr_qtd_digitad;
    }

    public void setVepr_qtd_digitad(double vepr_qtd_digitad) {
        this.vepr_qtd_digitad = vepr_qtd_digitad;
    }

    public double getVepr_qtd_item_regstdo() {
        return vepr_qtd_item_regstdo;
    }

    public void setVepr_qtd_item_regstdo(double vepr_qtd_item_regstdo) {
        this.vepr_qtd_item_regstdo = vepr_qtd_item_regstdo;
    }

    public double getVepr_qtd_devolv() {
        return vepr_qtd_devolv;
    }

    public void setVepr_qtd_devolv(double vepr_qtd_devolv) {
        this.vepr_qtd_devolv = vepr_qtd_devolv;
    }

    public double getVepr_val_devolv() {
        return vepr_val_devolv;
    }

    public void setVepr_val_devolv(double vepr_val_devolv) {
        this.vepr_val_devolv = vepr_val_devolv;
    }

    public double getVepr_qtd_prom() {
        return vepr_qtd_prom;
    }

    public void setVepr_qtd_prom(double vepr_qtd_prom) {
        this.vepr_qtd_prom = vepr_qtd_prom;
    }

    public double getVepr_val_imp_devolv() {
        return vepr_val_imp_devolv;
    }

    public void setVepr_val_imp_devolv(double vepr_val_imp_devolv) {
        this.vepr_val_imp_devolv = vepr_val_imp_devolv;
    }

    public double getVepr_val_cmv_devolv() {
        return vepr_val_cmv_devolv;
    }

    public void setVepr_val_cmv_devolv(double vepr_val_cmv_devolv) {
        this.vepr_val_cmv_devolv = vepr_val_cmv_devolv;
    }
}
