
public class MainFiguras {
    public static void main(String[] args) {
        Figuras triangulo = FigurasFactory.crearFigura("triangulo");
        Figuras rectangulo = FigurasFactory.crearFigura("rectangulo", 4, 5);
        Figuras circulo = FigurasFactory.crearFigura("circulo", 3);

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
    }
}