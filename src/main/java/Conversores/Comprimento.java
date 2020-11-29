package Conversores;

public enum Comprimento {

    METRO("Metro", "m", 1, 1),
    QUILOMETRO("Quilômetro", "km", 1000, 0.001),
    HECTOMETRO("Hectômetro", "hm", 100, 0.01),
    DECAMETRO("Decâmetro", "dam", 10, 0.1),
    DECIMETRO("Decímetro", "dm", 0.1, 10),
    CENTIMETRO("Centímetro", "cm", 0.01, 100),
    MILIMETRO("Milímetro", "mm", 0.001, 1000);
    
    private String nome;
    private String sigla;
    private double paraUB;
    private double deUB;
    
    private Comprimento(String nome, String sigla, double paraUB, double deUB) {
        this.nome = nome;
        this.sigla = sigla;
        this.paraUB = paraUB;
        this.deUB = deUB;
    }
    
    public final String getNome() {
        return nome;
    }
    
    public final String getSigla() {
        return sigla;
    }
    
    public final double getParaUB() {
        return paraUB;
    }
    
    public final double getDeUB() {
        return deUB;
    }
    
    public final double paraUnidadeBasica(double valor) {
        return paraUB * valor;
    }
    
    public final double deUnidadeBasica(double valor) {
        return deUB * valor;
    }
}
