package br.mv.test.model;

import java.util.Date;

public class Credito {

    private Date data;
    private int valor;

    public Credito() {
    }

    public Credito(Date data, int valor) {
        this.data = data;
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}