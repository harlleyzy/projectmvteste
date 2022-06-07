package br.mv.test.model;

public class ClientePJ extends Cliente {

    public static String TIPO_CLIENTE = "Pessoa Jurídica";

    private String id;
    private String razaoSocial;
    private String cnpj;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return getCnpj();
    }

    @Override
    public void setDocumento(String documento) {
        setCnpj(documento);
    }

    @Override
    public String getNome() {
        return getRazaoSocial();
    }

    @Override
    public void setNome(String nome) {
        setRazaoSocial(nome);
    }

    @Override
    public String tipoCliente() {
        return TIPO_CLIENTE;
    }
}
