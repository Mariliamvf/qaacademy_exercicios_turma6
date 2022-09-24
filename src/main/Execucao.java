package main;

import exemplos.MetodoSemMain;
import exercicios_easy.Exec2;
import exercicios_easy.Exec3;
import exercicios_easy.Exec4;
import exercicios_easy.Exec5;

import java.sql.SQLOutput;

public class Execucao {

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


    public static void main(String[] args) {
        Exec5 exec5 = new Exec5();
        System.out.println(exec5.exibirSoma(55, 89, 7));
        System.out.println((exec5.exibirSubtacao(55, 7665, 7)));
        System.out.println((exec5.exibirMultiplicacao(55, 48, 2354)));
        System.out.println(exec5.exibirMedia(1, 48, 7 / 3));

    }


}





