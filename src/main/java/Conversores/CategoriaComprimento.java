package Conversores;

import java.util.ArrayList;

public class CategoriaComprimento {

    public static ArrayList<String> nome() {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Metro (m)");
        nome.add("Quilometro (km)");
        nome.add("Hectometro (hm)");
        nome.add("Decametro (dam)");
        nome.add("Decimetro (dm)");
        nome.add("Centimetro (cm)");
        nome.add("Milimetro (mm)");
        
        return nome;
    }
}
