package exercicios_easy;

public class Exec8 {
    public static double calcularImpostoDeRenda(double salarioBruto) {

        double IR = 0;

        if (salarioBruto <= 1903.98) {
            IR = 0;
        }
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            IR = (salarioBruto * 0.075) - 142.79;
        }
        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            IR = (salarioBruto * 0.15) - 354.80;
        }
        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            IR = (salarioBruto * 0.225) - 636.13;
        }
        if (salarioBruto > 4664.68) {
            IR = (salarioBruto * 0.275) - 869.36;

        }
        return IR;
    }

    public static double calcularSalarioLiquido(double salario, double impostoDeRenda) {
        return salario - impostoDeRenda;

    }
}




















//public class exec8 {
//    public Double calcularSalario (double salarioBruto, double impostoDeRenda ) {
//        //Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//        //valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//        //Respeitando a tabela abaixo:
//        double inss = 0;
//
//        salariobruto = 2500;
//        if(salariobruto <=1903.00){
//            System.out.println("isento");
//        }
//        if (salariobruto >=1903.99 && salariobruto <= 2826.65){
//            impostoderenda = (salariobruto *0.075);
//            System.out.println("salariobruto = " + salariobruto );
//            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
//            System.out.println("imposto de renda = " + impostoderenda);
//
//        }
//        if (salariobruto >=2826.66 && salariobruto <= 3751.05){
//            impostoderenda = (salariobruto *0.15);
//            System.out.println("salariobruto = " + salariobruto );
//            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
//            System.out.println("imposto de renda = " + impostoderenda);
//        }
//        if (salariobruto >= 3751.06 && salariobruto <= 4664.08){
//            impostoderenda = (salariobruto*0.225);
//            System.out.println("salariobruto = " + salariobruto );
//            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
//            System.out.println("imposto de renda = " + impostoderenda);
//        }
//        if (salariobruto>= 4664.09 ){
//            impostoderenda = (salariobruto*0.275);
//            System.out.println("salariobruto = " + salariobruto );
//            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
//            System.out.println("imposto de renda = " + impostoderenda);
//        }
//    }
//}
