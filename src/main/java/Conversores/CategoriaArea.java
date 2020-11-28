package Conversores;

import java.util.ArrayList;

public class CategoriaArea {

    public static ArrayList<String> nome() {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Metro quadrado (m²)");
        nome.add("Quilômetro quadrado (km²)");
        nome.add("Hectômetro quadrado (hm²)");
        nome.add("Decâmetro quadrado (dam²)");
        nome.add("Decímetro quadrado (dm²)");
        nome.add("Centímetro quadrado (cm²)");
        nome.add("Milímetro quadrado (mm²)");
        
        return nome;
    }
}
