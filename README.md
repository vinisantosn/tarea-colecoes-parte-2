# Atividade: Divisão de Pessoas por Sexo

## Descrição da Atividade

Este projeto em Java tem como objetivo fornecer uma compreensão prática da manipulação de listas de objetos. A atividade consiste em criar um programa que recebe informações sobre pessoas (nome e sexo) e as divide em dois grupos: masculino e feminino. O código utiliza uma classe `Pessoa` para representar cada indivíduo e utiliza listas para armazenar e separar as pessoas com base no sexo.

## Estrutura do Código

### Arquivo: Main.java

O arquivo `Main.java` contém o código principal do programa. Ele está estruturado da seguinte maneira:

1. **Pacote e Autoria:**
   - O código está contido no pacote `edu.ebac`.
   - O autor do código é identificado como `vinisantosn`.

2. **Declaração de Variáveis:**
   - `list`: Lista que armazena objetos do tipo `Pessoa` representando informações sobre cada indivíduo.

3. **Método Principal:**
   - Invoca métodos para adicionar pessoas à lista, obter pessoas do sexo masculino e do sexo feminino, e imprime os resultados.

4. **Métodos Auxiliares:**
   - `adicionarPessoas()`: Adiciona pessoas à lista inicial.
   - `getPessoasSexoMasc()`: Retorna uma lista contendo apenas as pessoas do sexo masculino.
   - `getPessoasSexoFem()`: Retorna uma lista contendo apenas as pessoas do sexo feminino.

## Execução do Programa

1. **Compilação:**
   - Antes de executar o programa, é necessário compilá-lo. Isso pode ser feito utilizando um compilador Java, como o `javac`.

     ```bash
     javac Main.java
     ```

2. **Execução:**
   - Após a compilação, o programa pode ser executado com o seguinte comando:

     ```bash
     java Main
     ```

3. **Resultados:**
   - O programa imprimirá duas listas no console: uma contendo as pessoas do sexo masculino e outra contendo as pessoas do sexo feminino.

