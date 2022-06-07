package br.mv.test.model;


public abstract class ClientePF extends Cliente {

    public static String TIPO_CLIENTE = "Pessoa Física";

    private Integer id;
    private String nome;
    private String cpf;

    @Override
    public Integer getId() {
        return id;
    }


    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String razaoSocial) {
        this.nome = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return getCpf();
    }

    @Override
    public void setDocumento(String documento) {
        setCpf(documento);
    }

    @Override
    public String tipoCliente() {
        return TIPO_CLIENTE;
    }

}