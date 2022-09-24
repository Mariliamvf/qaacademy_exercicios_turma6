package exercicios_easy;

import javax.swing.*;

public class exec9 {
    public static void main(String[] args) {
        int num1=10, i=1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        while (i<=10) {
        System.out.println(num1 + " x " + i + " = " + num1 *i);
                i++;

        }
    }
}
