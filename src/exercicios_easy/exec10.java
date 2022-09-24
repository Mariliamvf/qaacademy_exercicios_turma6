package exercicios_easy;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class exec10 {
    public static void main(String[] args) {
        double investimento=0,taxa=0.05,juros=0,valorJuros=0, valorTotal=0, i=1;
        investimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Investimento"));
        while (i <=10) {
            valorJuros = investimento * taxa + valorJuros;
            i = i + 1;
        }
            System.out.println("Valor dos Juros=" + valorJuros);
            System.out.println("Valor investido=" + investimento);
            System.out.println("Valor Total= " + (valorJuros + investimento));

        }
    }

