package Conversores;

public enum TipoMedida {
    AREA("Area", "metro quadrado (m\\u33a1)"),
    ARMAZENAMENTO("Armazenamento", "byte (B)"),
    COMPRIMENTO("Comprimento", "metro (m)"),
    FREQUENCIA("Frequencia", "hertz (Hz)"),
    LIQUIDO("liquido", "litro (O)"),
    MASSA("massa", "quilograma (kg)"),
    PRESSAO("Pressao", "pascal (Pa)"),
    TEMPERATURA("Temperatura", "graus celsius (\\u00BAC)"),
    TEMPO("Tempo", "segundo (s)"),
    VELOCIDADE("Velocidade", "m/s");
    
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

