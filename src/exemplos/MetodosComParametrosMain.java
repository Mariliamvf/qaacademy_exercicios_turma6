package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        System.out.println(cor("A maça ", "é vermelha"));
        System.out.println(soma(10, 23));
        System.out.println(subtracao(25, 11));
        System.out.println(divisao(15, 3));
        System.out.println(multiplicacao(28, 5));


    }


    public static int soma(int num1, int num2) {
        return num1 + num2;


    }

    public static int subtracao(int num2, int num3) {
        return num2 - num3;
    }

    public static String cor(String a, String b) {
        return a + b;
    }

    public static int divisao(int num1, int num2) {
        return num1 / num2;

    }

        public static int multiplicacao (int num4, int num5) {
            return num4* num5;
        }



    }