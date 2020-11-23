package Conversores;

public class comprimento {
    /*Object[][] comprimento = {
        {"Metro", "m", 1},
        {"Quilômetro", "km", 1000},
        {"Hectômetro", "hm", 100},
        {"Decâmetro", "dam", 10},
        {"Decímetro", "dm", 0.1},
        {"Centímetro", "cm", 0.01},
        {"Milímetro", "km", 0.001}
    };*/
    
    final private double km = 1000;
    final private double hm = 100;
    final private double dam = 10;
    final private double dm = 0.1;
    final private double cm = 0.01;
    final private double mm = 0.001;
    
    private double fator;
    
    public double paraUnidadeBasica(double medida) {
        return (medida * fator);
    }
    
    public double deUnidadeBasica(double medida) {
        return (medida / fator);
    }
}
