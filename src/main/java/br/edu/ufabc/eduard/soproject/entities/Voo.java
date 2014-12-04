package br.edu.ufabc.eduard.soproject.entities;

import javax.annotation.ManagedBean;

/**
 * Created by dumorango on 02/12/14.
 */

@ManagedBean
public class Voo {

    private long id;
    Partida partida;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Chegada getChegada() {
        return chegada;
    }

    public void setChegada(Chegada chegada) {
        this.chegada = chegada;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Integer getOcupadas() {
        return ocupadas;
    }

    public void setOcupadas(Integer ocupadas) {
        this.ocupadas = ocupadas;
    }

    Chegada chegada;
    Integer vagas;
    Integer ocupadas;
}
