package exercicios_easy;

public class Exec10 {
    public String calcularInvestimento (double investimento) {
         double taxa =0.05, juros=0, valorJuros=0, valorTotal=0,
                i=1;
                while (i <=10) {
            valorJuros = investimento * taxa + valorJuros;
            i = i + 1;
        }
            return "Valor dos Juros=" + valorJuros;


        }
    }

