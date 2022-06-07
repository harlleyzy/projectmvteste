package br.mv.test.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String codigoBanco;
    private String nomeBanco;
    private String agencia;
    private String conta;
    private int saldo;

    private List<Debito> debitos = new ArrayList<>();
    private List<Credito> creditos = new ArrayList<>();

    public Conta() {
    }

    public Conta(String codigoBanco, String nomeBanco, String agencia, String conta, int saldo) {
        this.codigoBanco = codigoBanco;
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void creditoSaldo(Credito credito) {
        saldo += credito.getValor();
    }

    public void debitoSaldo(Debito debito) {
        saldo -= debito.getValor();
    }

    public void addCredito(Credito credito){
        creditos.add(credito);
        creditoSaldo(credito);
    }

    public void addDebito(Debito debito){
        debitos.add(debito);
        debitoSaldo(debito);
    }


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Debito> getDebitos() {
        return debitos;
    }

    public void setDebitos(List<Debito> debitos) {
        this.debitos = debitos;
    }

    public List<Credito> getCreditos() {
        return creditos;
    }

    public void setCreditos(List<Credito> creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        StringBuilder buf = new StringBuilder();

        buf.append("---------\n");
        buf.append("\t").append("Código Banco: ").append(getCodigoBanco()).append("\n");
        buf.append("\t").append("Nome Banco: ").append(getNomeBanco()).append("\n");
        buf.append("\t").append("Agência: ").append(getAgencia()).append("\n");
        buf.append("\t").append("Conta: ").append(getConta()).append("\n");
        buf.append("\t").append("Saldo: ").append(df.format(getSaldo())).append("\n");

        buf.append("\t").append("Movimentações: ").append("\n");

        for(Credito credito: creditos){
            buf.append("\t\t").append("Credito: ").append(sdf.format(credito.getData())).append(" -> R$").append(df.format(credito.getValor())).append("\n");
        }
        buf.append("\n");
        for(Debito debito: debitos){
            buf.append("\t\t").append("Debito: ").append(sdf.format(debito.getData())).append(" -> R$").append(df.format(debito.getValor())).append("\n");
        }

        buf.append("\n");

        return buf.toString();
    }
}