package Conversores;

public enum TipoMedida {

    COMPRIMENTO("Comprimento", "Conversores.Comprimento"),
    AREA("Área", "Conversores.Area"),
    LIQUIDO("Líquido", "Conversores.Liquido"),
    MASSA("Massa", "Conversores.Massa");
    
    private String tipo;
    private String diretorio;
    
    private TipoMedida(String tipo, String diretorio) {
        this.tipo = tipo;
        this.diretorio = diretorio;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public static String getDiretorio(int index) {
        return TipoMedida.values()[index].diretorio;
    }
}