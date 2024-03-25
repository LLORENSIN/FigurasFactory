class FigurasFactory {
    public static Figuras crearFigura(String tipo, double... parametros) {
        switch (tipo.toLowerCase()) {
            case "triangulo":
                return Triangulo.getInstance();
            case "rectangulo":
                if (parametros.length != 2) {
                    throw new IllegalArgumentException("Se requieren dos parámetros para un rectángulo: lado1 y lado2");
                }
                return new Rectangulo(parametros[0], parametros[1]);
            case "circulo":
                if (parametros.length != 1) {
                    throw new IllegalArgumentException("Se requiere un parámetro para un círculo: radio");
                }
                return new Circulo(parametros[0]);
            default:
                throw new IllegalArgumentException("Tipo de figura no válido");
        }
    }
}

