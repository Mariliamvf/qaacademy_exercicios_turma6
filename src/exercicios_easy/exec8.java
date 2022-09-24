package exercicios_easy;

public class exec8 {
    public static void main(String[] args) {
        //Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
        //valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
        //Respeitando a tabela abaixo:

        double salariobruto,impostoderenda;
        salariobruto = 2500;
        if(salariobruto <=1903.00){
            System.out.println("isento");
        }
        if (salariobruto >=1903.99 && salariobruto <= 2826.65){
            impostoderenda = (salariobruto *0.075);
            System.out.println("salariobruto = " + salariobruto );
            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
            System.out.println("imposto de renda = " + impostoderenda);

        }
        if (salariobruto >=2826.66 && salariobruto <= 3751.05){
            impostoderenda = (salariobruto *0.15);
            System.out.println("salariobruto = " + salariobruto );
            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
            System.out.println("imposto de renda = " + impostoderenda);
        }
        if (salariobruto >= 3751.06 && salariobruto <= 4664.08){
            impostoderenda = (salariobruto*0.225);
            System.out.println("salariobruto = " + salariobruto );
            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
            System.out.println("imposto de renda = " + impostoderenda);
        }
        if (salariobruto>= 4664.09 ){
            impostoderenda = (salariobruto*0.275);
            System.out.println("salariobruto = " + salariobruto );
            System.out.println ("salarioliquido = " + (salariobruto- impostoderenda));
            System.out.println("imposto de renda = " + impostoderenda);
        }
    }
}
