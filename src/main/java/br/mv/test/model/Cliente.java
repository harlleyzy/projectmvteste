package br.mv.test.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

private Endereco endereco;

private List<Conta> contas = new ArrayList<>();

private String telefone;

public abstract Integer getId();

public abstract void setId(String id);

    public abstract void setId(int id);

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getDocumento();

    public abstract void setDocumento(String documento);

    public abstract String tipoCliente();

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void removeConta(Conta conta){
        this.contas.remove(conta);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
