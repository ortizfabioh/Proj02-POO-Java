package Conversores;

public enum Massa {

    GRAMA("Grama", "g", 1, 1),
    QUILOGRAMA("Quilograma", "kg", 1000, 0.001),
    HECTOGRAMA("Hectograma", "hg", 100, 0.01),
    DECALGRAMA("Decagrama", "dag", 10, 0.1),
    DECIGRAMA("Decigrama", "dg", 0.1, 10),
    CENTIGRAMA("Centigrama", "cg", 0.01, 100),
    MILIGRAMA("Miligrama", "mg", 0.001, 1000);
    
    private String nome;
    private String sigla;
    private double paraUB;
    private double deUB;
    
    private Massa(String nome, String sigla, double paraUB, double deUB) {
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
