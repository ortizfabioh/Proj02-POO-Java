package Conversores;

public enum TipoMedida {
    AREA("area", "metro quadrado (m\\u33a1)"),
    ARMAZENAMENTO("armazenamento", "byte (B)"),
    COMPRIMENTO("comprimento", "metro (m)"),
    FREQUENCIA("frequencia", "hertz (Hz)"),
    LIQUIDO("liquido", "litro (O)"),
    MASSA("massa", "quilograma (kg)"),
    PRESSAO("pressao", "pascal (Pa)"),
    TEMPERATURA("temperatura", "graus celsius (\\u00BAC)"),
    TEMPO("tempo", "segundo (s)"),
    VELOCIDADE("velocidade", "m/s");
    
    private String tipo;
    private String unidadeBasica;
    
    private TipoMedida(String tipo, String unidadeBasica) {
        this.tipo = tipo;
        this.unidadeBasica = unidadeBasica;
    }
    public final String getBasicUnit() {
        return unidadeBasica;   
    }
    public String getTypeString() {
        return (tipo);
    }
}

