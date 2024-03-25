public class Rectangulo implements Figuras {
    double lado1;
    double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}
