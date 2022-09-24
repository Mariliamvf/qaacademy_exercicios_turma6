package main;

import exemplos.MetodoSemMain;

import java.sql.SQLOutput;

public class Execucao {

    public static void main(String[] args) {
        MetodoSemMain metodo = new MetodoSemMain();
        metodo.idade(43);
        System.out.println(metodo.anoNascimento("1987"));
        System.out.println(metodo.mesNascimento());

    }


}
