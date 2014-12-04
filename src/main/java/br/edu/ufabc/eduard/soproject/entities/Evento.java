package br.edu.ufabc.eduard.soproject.entities;

import java.util.Date;

/**
 * Created by dumorango on 02/12/14.
 */
public class Evento {
    private Date data;
    private Aeroporto aeroporto;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }
}
