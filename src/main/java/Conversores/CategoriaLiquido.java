package Conversores;

import java.util.ArrayList;

public class CategoriaLiquido {
    
    public static ArrayList<String> nome() {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Litro (L)");
        nome.add("Quilolitro (kL)");
        nome.add("Hectolitro (hL)");
        nome.add("Decalitro (daL)");
        nome.add("Decilitro (dL)");
        nome.add("Centilitro (cL)");
        nome.add("Mililitro (mL)");
        
        return nome;
    }
}
