package exercicios_easy;

public class Exec11 {
    public String somaMais2 (int numero) {
        // Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao número
        //digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
        //completar 100 iterações.

        int i=1;
        while (i <=100) {
            numero = numero + 2;
            i++;
        }
            return "A soma é" + numero;


        }


    }

