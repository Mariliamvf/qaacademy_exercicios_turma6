package tests;

import exercicios_easy.Exec2;
import exercicios_easy.Exec4;
import exercicios_easy.Exec5;
import exercicios_easy.Exec6;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasytest {
    @Test

   public void testeDeJuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        //exec2.exibirPalavra("Bolsolula");
        assertEquals("A palavra é:Bolsolula", exec2.exibirPalavra("Bolsolula"));

    }

    @Test
    public void testeDobro(){
       Exec4 exec4 = new Exec4();
            int dobro = exec4.lerNumeroInteiroArmazenarCalculareExibir( 5);
            assertEquals("O dobro é invalido", 10,dobro);
        }
    @Test

    public void testeSoma(){
        Exec5 exec5 = new Exec5();
        assertEquals(6,exec5.exibirSoma(2,2,2));
    }
    @Test
    public void testeSubtracao(){
        Exec5 exec5 = new Exec5();
        assertEquals(5, exec5.exibirSubtacao(15,5,5));
    }

    @Test
    public void testeMultiplicacao(){
        Exec5 exec5 = new Exec5();
        assertEquals(8,exec5.exibirMultiplicacao(2,2,2));
    }
    @Test
    public void testeMedia(){
        Exec5 exec5 = new Exec5();
        assertEquals(10,exec5.exibirMedia(10,10,10));
    }
    @Test
    public void testeNotaMedia(){
        Exec6 exec6 = new Exec6();
        assertEquals("Exame",exec6.calcularMedia(5,5));

    }
    }

