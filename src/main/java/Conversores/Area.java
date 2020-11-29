package Conversores;

public enum Area {

    METROQUADRADO("Metro quadrado", "m²", 1, 1),
    QUILOMETROQUADRADO("Quilômetro quadrado", "km²", 1000, 0.001),
    HECTOMETROQUADRADO("Hectometro quadrado", "hm²", 100, 0.01),
    DECAMETROQUADRADO("Decâmetro quadrado", "dam²", 10, 0.1),
    DECIMETROQUADRADO("Decimetro quadrado", "dm²", 0.1, 10),
    CENTIMETROQUADRADO("Centímetro quadrado", "cm²", 0.01, 100),
    MILIMETROQUADRADO("Milímetro quadrado", "mm²", 0.001, 1000);
    
    private String nome;
    private String sigla;
    private double paraUB;
    private double deUB;
    
    private Area(String nome, String sigla, double paraUB, double deUB) {
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
