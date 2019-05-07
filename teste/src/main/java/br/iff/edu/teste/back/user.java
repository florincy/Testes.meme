/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iff.edu.teste.back;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "user")
public class user implements Serializable {

    /**
     * @return the cdUser
     */
    public Integer getCdUser() {
        return cdUser;
    }

    /**
     * @param cdUser the cdUser to set
     */
    public void setCdUser(Integer cdUser) {
        this.cdUser = cdUser;
    }

    /**
     * @return the dia
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Integer dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    @Column(name="dia")
    private Integer dia;
    @Column(name="mes")
    private Integer mes;
    @Column(name="ano")
    private Integer ano;
    private Integer cdUser;
}
