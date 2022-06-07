package br.mv.test.repository;

import br.mv.test.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainMV {

    public static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        createClientes();

        listClients();
    }

    public static void listClients() {

        System.out.println("\n CLIENTES \n");

        for (Cliente cliente : clientes) {

            System.out.println("=============================== \n");
            System.out.println("Tipo: " + cliente.tipoCliente());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Documento: " + cliente.getDocumento());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Endereco: " + cliente.getEndereco());
            System.out.println("Contas: \n");
            for (Conta conta : cliente.getContas()) {
                System.out.println(conta);
            }


        }

    }

    public static void createClientes() {

        ClientePF client1 = new ClientePF();
        client1.setDocumento("000.111.222-33");
        client1.setNome("Joao Alberto");
        client1.setTelefone("(81)99999-8888");
        {
            Endereco endereco = new Endereco();
            endereco.setCep("12345-000");
            endereco.setCidade("Recife");
            endereco.setUf("PE");
            endereco.setLogradouro("Rua do Sol");
            endereco.setNumero("51");
            endereco.setComplemento("Apto 204");

            Conta conta1 = new Conta();
            conta1.setCodigoBanco("341");
            conta1.setNomeBanco("Itau");
            conta1.setAgencia("0001");
            conta1.setConta("12345-9");

            Credito credito1 = new Credito(new Date(), 300);
            Credito credito2 = new Credito(new Date(), 80);
            conta1.addCredito(credito1);
            conta1.addCredito(credito2);

            Debito debito1 = new Debito(new Date(), 100);
            Debito debito2 = new Debito(new Date(), 200);
            conta1.addDebito(debito1);
            conta1.addDebito(debito2);

            client1.setEndereco(endereco);
            client1.addConta(conta1);
        }

        clientes.add(client1);

        ClientePJ client2 = new ClientePJ();
        client2.setDocumento("99.999.999/0001-01");
        client2.setNome("Lojas Arapuã");
        client2.setTelefone("(81)3444-4434");
        {
            Endereco endereco = new Endereco();
            endereco.setCep("98765-111");
            endereco.setCidade("Recife");
            endereco.setUf("PE");
            endereco.setLogradouro("Avenida Agamenom Magalhães");
            endereco.setNumero("2005");
            endereco.setComplemento("");

            Conta conta1 = new Conta();
            conta1.setCodigoBanco("341");
            conta1.setNomeBanco("Itau");
            conta1.setAgencia("2233");
            conta1.setConta("98765-0");
            Credito credito1 = new Credito(new Date(), 5000);
            Credito credito2 = new Credito(new Date(), 800);
            conta1.addCredito(credito1);
            conta1.addCredito(credito2);
            Debito debito1 = new Debito(new Date(), 3500);
            Debito debito2 = new Debito(new Date(), 1200);
            conta1.addDebito(debito1);
            conta1.addDebito(debito2);


            Conta conta2 = new Conta();
            conta2.setCodigoBanco("341");
            conta2.setNomeBanco("Itau");
            conta2.setAgencia("2233");
            conta2.setConta("98765-0");
            Credito credito3 = new Credito(new Date(), 5000);
            Credito credito4 = new Credito(new Date(), 800);
            conta2.addCredito(credito3);
            conta2.addCredito(credito4);
            Debito debito3 = new Debito(new Date(), 3500);
            Debito debito4 = new Debito(new Date(), 1200);
            conta2.addDebito(debito3);
            conta2.addDebito(debito4);

            client2.setEndereco(endereco);
            client2.addConta(conta1);
        }


        clientes.add(client2);




        ClientePF client3 = new ClientePF();

        client3.setDocumento("094.819.214-33");
        client3.setNome("Carolyne sobreira Ferreira");
        client3.setTelefone("(81)98195-9396");

        {
            Endereco endereco = new Endereco();
            endereco.setCep("51350-530");
            endereco.setCidade("Recife");
            endereco.setUf("PE");
            endereco.setLogradouro("Rua padre cícero");
            endereco.setNumero("965");
            endereco.setComplemento("Apto 03");

            Conta conta1 = new Conta();
            conta1.setCodigoBanco("853");
            conta1.setNomeBanco("Bradesco");
            conta1.setAgencia("6535");
            conta1.setConta("96552-0");
            Credito credito1 = new Credito(new Date(), 6523);
            Credito credito2 = new Credito(new Date(), 569);
            conta1.addCredito(credito1);
            conta1.addCredito(credito2);
            Debito debito1 = new Debito(new Date(), 965);
            Debito debito2 = new Debito(new Date(), 1500);
            conta1.addDebito(debito1);
            conta1.addDebito(debito2);


            Conta conta2 = new Conta();
            conta2.setCodigoBanco("341");
            conta2.setNomeBanco("Itau");
            conta2.setAgencia("2233");
            conta2.setConta("98765-0");
            Credito credito3 = new Credito(new Date(), 5000);
            Credito credito4 = new Credito(new Date(), 800);
            conta2.addCredito(credito3);
            conta2.addCredito(credito4);
            Debito debito3 = new Debito(new Date(), 3500);
            Debito debito4 = new Debito(new Date(), 1200);
            conta2.addDebito(debito3);
            conta2.addDebito(debito4);

            Conta conta3 = new Conta();
            conta3.setCodigoBanco("652");
            conta3.setNomeBanco("polibanco");
            conta3.setAgencia("2233");
            conta3.setConta("98653-0");
            Credito credito5 = new Credito(new Date(), 60006);
            Credito credito6 = new Credito(new Date(), 450000);
            conta3.addCredito(credito5);
            conta3.addCredito(credito6);
            Debito debito5 = new Debito(new Date(), 300000);
            Debito debito6 = new Debito(new Date(), 65000);
            conta3.addDebito(debito5);
            conta3.addDebito(debito6);

            client3.setEndereco(endereco);
            client3.addConta(conta3);
        }

        clientes.add(client3);
    }
}







