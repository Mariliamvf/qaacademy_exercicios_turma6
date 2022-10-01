package main;

import exemplos.MetodoSemMain;
import exercicios_easy.*;

import javax.swing.*;
import java.sql.SQLOutput;

public class Execucao {
    public static void main(String[] args) {
        ;

//    public static void main(String[] args) {
//        MetodoSemMain metodo = new MetodoSemMain();
//        metodo.idade(43);
//        System.out.println(metodo.anoNascimento("1987"));
//        System.out.println(metodo.mesNascimento());
//
//  //  }


//    public static void main(String [] args ) {
//        Exec2 exec2 = new Exec2();
//        System.out.println(exec2.exibirPalavra("Batismo"));
//
//    }


//    public static void main(String[] args) {
//        Exec3 exec3 = new Exec3();
//        System.out.println(Exec3.exibirDoisValoresTrocados("Piedade", "Sao Paulo") );


//    public static void main(String[] args) {
//        Exec4 exec4 = new Exec4();
//        System.out.println(Exec4.lerNumeroInteiroArmazenarCalculareExibir(50));


//    public static void main(String[] args) {
//        Exec5 exec5 = new Exec5();
//        System.out.println(exec5.exibirSoma(55, 89, 7));
//        System.out.println((exec5.exibirSubtacao(55, 7665, 7)));
//        System.out.println((exec5.exibirMultiplicacao(55, 48, 2354)));
//        System.out.println(exec5.exibirMedia(1, 48, 7 / 3));

//    }
//    }

//        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
//        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
//        Exec6 exec6 = new Exec6();
//        System.out.println("Você está:" + exec6.calcularMedia(nota1, nota2));
//        JOptionPane.showMessageDialog(null, "Você está:" + exec6.calcularMedia(nota1, nota2));





       double salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor,digite um salario"));
       Exec8 exec8 = new Exec8();
       System.out.println("O Imposto de Renda sera : " + Exec8.calcularImpostoDeRenda(salario));
        double impostoDeRenda = Exec8.calcularImpostoDeRenda(salario);
        System.out.println("O Salario Liquido será : " + Exec8.calcularSalarioLiquido(salario,impostoDeRenda));



    }
}






