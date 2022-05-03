package atv.palindromo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class palindromoTest {

    @Test
    public void TestePositivoPalavraMaiusculaEMinuscula(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("Rotator");
        boolean resultado2 = palindromo.ValidarTexto("mAlAyAlam");

        assertEquals(true, resultado1);
        assertEquals(true, resultado2);
    }

    @Test
    public void TestePositivoPalavaMinuscula(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("bob");
        boolean resultado2 = palindromo.ValidarTexto("madam");

        assertEquals(true, resultado1);
        assertEquals(true, resultado2);
    }

    @Test
    public void TestePositivoNumero(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("1");
        boolean resultado2 = palindromo.ValidarTexto("353");

        assertEquals(true, resultado1);
        assertEquals(true, resultado2);
    }

    @Test
    public void TestePositivoData(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("02/02/2020");

        assertEquals(true, resultado1);
    }

    @Test
    public void TestePositivoTextoMaiusculaEMinuscula(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("Able was I, ere I saw Elba");

        assertEquals(true, resultado1);
    }    

    @Test
    public void TestePositivoTextoComCaracterEspecial(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("Step on no pets.");
        boolean resultado2 = palindromo.ValidarTexto("Madam I’m Adam");
        boolean resultado3 = palindromo.ValidarTexto("Top spot!");

        assertEquals(true, resultado1);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
    }    

    @Test
    public void TesteNegativoPalavraMaiusculaEMinuscula(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("Country");

        assertEquals(false, resultado1);
    }

    @Test
    public void TesteNegativoPalavaMinuscula(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("xyz");
        boolean resultado2 = palindromo.ValidarTexto("elephant");

        assertEquals(false, resultado1);
        assertEquals(false, resultado2);
    }

    @Test
    public void TesteNegativoTextoComCaracterEspecial(){
        PalindromoClass palindromo = new PalindromoClass();

        boolean resultado1 = palindromo.ValidarTexto("Top . post!");
        boolean resultado2 = palindromo.ValidarTexto("Wonderful-fool");
        boolean resultado3 = palindromo.ValidarTexto("Wild imagination!");

        assertEquals(false, resultado1);
        assertEquals(false, resultado2);
        assertEquals(false, resultado3);
    }    

    
    
}
