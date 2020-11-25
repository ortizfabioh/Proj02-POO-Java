package Conversores;

public class Comprimento {
    public static class Quilometro {
        public static double paraUnidadeBasica(double valor) { return valor / 1000; }
        public static double deUnidadeBasica(double valor) { return valor * 1000; }
    }
    
    public static class Hectometro {
        public static double paraUnidadeBasica(double valor) { return valor / 100; }
        public static double deUnidadeBasica(double valor) { return valor * 100; }
    }
    
    public static class Decametro {
        public static double paraUnidadeBasica(double valor) { return valor / 10; }
        public static double deUnidadeBasica(double valor) { return valor * 10; }
    }
    
    public static class Decimetro {
        public static double paraUnidadeBasica(double valor) { return valor / 0.1; }
        public static double deUnidadeBasica(double valor) { return valor * 0.1; }
    }
    
    public static class Centimetro {
        public static double paraUnidadeBasica(double valor) { return valor / 0.01; }
        public static double deUnidadeBasica(double valor) { return valor * 0.01; }
    }
    
    public static class Milimetro {
        public static double paraUnidadeBasica(double valor) { return valor / 0.001; }
        public static double deUnidadeBasica(double valor) { return valor * 0.001; }
    }
}