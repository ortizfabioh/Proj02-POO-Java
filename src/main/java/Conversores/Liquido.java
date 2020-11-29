package Conversores;

public enum Liquido {

    LITRO("Litro", "L", 1, 1),
    QUILOLITRO("Quilolitro", "kL", 1000, 0.001),
    HECTOLITRO("Hectolitro", "hL", 100, 0.01),
    DECALITRO("Decalitro", "daL", 10, 0.1),
    DECILITRO("Decilitro", "dL", 0.1, 10),
    CENTILITRO("Centilitro", "cL", 0.01, 100),
    MILILITRO("Mililitro", "mL", 0.001, 1000);
    
    private String nome;
    private String sigla;
    private double paraUB;
    private double deUB;
    
    private Liquido(String nome, String sigla, double paraUB, double deUB) {
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
