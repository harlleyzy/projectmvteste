1 OBSERVAÇÃO - A partir do java.MAIN, todos os dados dos clientes já podem ser vizualizados sem necessitar de um banco diretamente.
2 OBSERVAÇÃO - usei a IDE Intellij pois acho mais prática e bem didática.
3 OBSERVAÇÃO - Foi colocado, também uma função de conta, onde podemos colocar tudo de débito e crédito do cliente em questão, porém ainda faltou o saldo final.
4 OBSERVAÇÃO - Criei a estrutura de conexãoi com o banco sql developer da oracle, mas não interligou diretamente, mas sim local, pelo própiro intellij.




--tables
CREATE TABLE clientes
(   id_cliente   INTEGER NOT NULL PRIMARY KEY,
    nome_cliente VARCHAR2(50) NULL ,
    cpf_cliente  VARCHAR(12)  NULL ,
    cnpj_cliente VARCHAR(15) NULL ,
    razao_social VARCHAR2(50) NULL ,
    telefone     VARCHAR(12) NULL
);

CREATE TABLE endereco (
    id_cliente      INTEGER NOT NULL PRIMARY KEY,
    logradouro      VARCHAR(15) NULL ,
    numero          VARCHAR(6)  NULL ,
    complemento     VARCHAR(10) NULL ,
    cidade          VARCHAR(15) NULL ,
    uf              VARCHAR2(2) NULL ,
    cep             VARCHAR(8)  NULL
);

CREATE TABLE contas (
                        id_cliente          INTEGER NOT NULL PRIMARY KEY,
                        codigoBanco         VARCHAR(5) NOT NULL ,
                        nomeBanco           VARCHAR(10) NOT NULL ,
                        agencia             VARCHAR(5) NOT NULL ,
                        conta               VARCHAR(10) NOT NULL  ,
                        saldo               VARCHAR(1000) NOT NULL ,
                        debitos             VARCHAR(1000) NOT NULL,
                        creditos            VARCHAR(1000) NOT NULL
);

--inserts

INSERT INTO clientes (id_cliente, nome_cliente, cpf_cliente, cnpj_cliente, razao_social, telefone)  VALUES ('1', 'Carolyne', '09481921465','n/a', 'n/a', '8198195-9396' );
INSERT INTO clientes (id_cliente, nome_cliente, cpf_cliente, cnpj_cliente, razao_social, telefone)  VALUES ('2', 'ERIC ALEXANDRE', '65326485498','6656356400010', 'Empresa de produção téxtil', '3556-8562' );
INSERT INTO clientes (id_cliente, nome_cliente, cpf_cliente, cnpj_cliente, razao_social, telefone)  VALUES ('3', 'COOPERH', 'n/a','5236568900011', 'Empresa de consultoria', '3228-9749' );


INSERT INTO endereco(id_cliente,logradouro, numero, complemento, cidade, uf, cep)  VALUES ('2', 'Rua Limeira', '56', 'casa','olinda', 'PE', '566598-3' );
INSERT INTO endereco(id_cliente, logradouro, numero, complemento, cidade, uf, cep)   VALUES ('1','Rua alvorada', '365', 'apto 106','Recife', 'PE', '5134909' );
INSERT INTO endereco(id_cliente, logradouro, numero, complemento, cidade, uf, cep)   VALUES ('3','Rua palmeiras', '77', 'empre.1011','Paulista', 'PE', '563298-6');



INSERT INTO contas(id_cliente,codigoBanco, nomeBanco, agencia, conta, saldo, debitos, creditos) VALUES ('1', '341', 'bradesco', '9876', '96532-5', '500', '150', '250' );
INSERT INTO contas(id_cliente,codigoBanco, nomeBanco, agencia, conta, saldo, debitos, creditos) VALUES ('2', '652', 'itau', '2222', '66666-7', '600', '560', '900' );
INSERT INTO contas(id_cliente,codigoBanco, nomeBanco, agencia, conta, saldo, debitos, creditos) VALUES ('3', '555', 'picpay', '6352', '55555-9', '9000', '1000', '5000' );



--select


SELECT *
FROM endereco;

SELECT *
FROM contas;

SELECT *
FROM clientes;


--drop

drop table contas;
drop table endereco;

