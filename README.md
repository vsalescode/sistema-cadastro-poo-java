# 📌 Sistema de Cadastro de Pessoas -- Java (POO)

Projeto simples desenvolvido para praticar **lógica de programação**,
**Programação Orientada a Objetos (POO)** e manipulação de coleções em
Java, sem uso de frameworks ou banco de dados.

## 🎯 Objetivo

Treinar conceitos fundamentais:

-   Classes e objetos\
-   Encapsulamento (getters e setters com validação)\
-   Construtores\
-   Listas (`ArrayList`)\
-   Estruturas de repetição e condição (`for`, `if/else`)\
-   Métodos com retorno\
-   Organização básica de um sistema em camadas simples

------------------------------------------------------------------------

## 🚀 Funcionalidades

✔ Cadastrar pessoa\
✔ Listar todas as pessoas cadastradas\
✔ Buscar pessoa por CPF\
✔ Remover pessoa por CPF\
✔ Validações básicas nos atributos

------------------------------------------------------------------------

## 🧱 Estrutura do Projeto

    src/
     ├── Model/
     │     └── Pessoa.java
     ├── SistemaCadastro.java
     └── Main.java

### Classe Pessoa

-   Representa a entidade principal\
-   Contém validações nos setters\
-   Método que retorna os dados formatados

### Classe SistemaCadastro

-   Gerencia a lista de pessoas\
-   Regras de negócio:
    -   Não permite CPF duplicado\
    -   Busca e remoção por CPF\
    -   Exibição dos registros

### Classe Main

-   Simula o uso do sistema\
-   Cria objetos e chama as funcionalidades

------------------------------------------------------------------------

## ▶ Como executar

1.  Clone o repositório

``` bash
git clone <seu-repositorio>
```

2.  Compile o projeto

``` bash
javac Main.java
```

3.  Execute

``` bash
java Main
```

------------------------------------------------------------------------

## 📚 Conceitos praticados

-   Programação Orientada a Objetos\
-   Encapsulamento\
-   Tratamento de exceções\
-   Manipulação de listas\
-   Boas práticas básicas de Java

------------------------------------------------------------------------

## 🔧 Possíveis melhorias futuras

-   Menu interativo com `Scanner`\
-   Persistência em arquivo\
-   Validação real de CPF\
-   Interface gráfica\
-   Integração com banco de dados

------------------------------------------------------------------------

## 👨‍💻 Autor

Projeto criado para fins de estudo e evolução na linguagem Java.
