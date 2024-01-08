package edu.ebac;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vinisantosn
 */
public class Main {
    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<>();
        list = adicionarPessoas();
        System.out.println(getPessoasSexoMasc(list));
        System.out.println(getPessoasSexoFem(list));

    }

    private static List<Pessoa> getPessoasSexoMasc(List<Pessoa> lista) {
        List<Pessoa> pessoasSexMascList = new ArrayList<>();
        for (Pessoa p: lista
             ) {
            if (p.getSexo().equalsIgnoreCase("Masculino")){
                pessoasSexMascList.add(p);
            }
        }
        return pessoasSexMascList;
    }

    private static List<Pessoa> getPessoasSexoFem(List<Pessoa> lista) {
        List<Pessoa> pessoasSexFemList = new ArrayList<>();
        for (Pessoa p: lista
        ) {
            if (p.getSexo().equalsIgnoreCase("Feminino")){
                pessoasSexFemList.add(p);
            }
        }
        return pessoasSexFemList;
    }

    private static List<Pessoa> adicionarPessoas() {
        List<Pessoa> pessoaList = new ArrayList<>();

        pessoaList.add(new Pessoa("João","Masculino"));
        pessoaList.add(new Pessoa("Davi","Masculino"));
        pessoaList.add(new Pessoa("Ana","Feminino"));
        pessoaList.add(new Pessoa("Marcos","Masculino"));
        pessoaList.add(new Pessoa("Safira","Feminino"));

        return pessoaList;
    }
}