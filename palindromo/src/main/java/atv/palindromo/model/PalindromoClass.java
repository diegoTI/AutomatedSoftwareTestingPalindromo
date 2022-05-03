package atv.palindromo.model;

import java.io.Console;

public class PalindromoClass {

    public PalindromoClass(){

    }

    public boolean ValidarTexto(String texto){
        //Padronizar texto "Limpar"
        String textoLimpo = texto.replace(" ", "")
                                 .replace(".", "")
                                 .replace(",", "")
                                 .replace("'", "")
                                 .replace("/", "")
                                 .replace("!", "")
                                 .replace("-", "")
                                 .replace("’", "")
                                 .toLowerCase();

        for (int i = 0; i < textoLimpo.length(); i++) {
            if (textoLimpo.charAt(i) != textoLimpo.charAt(textoLimpo.length() - (i + 1))) {
                return false;
            }
        }
        
        return true;
    }
    
}
