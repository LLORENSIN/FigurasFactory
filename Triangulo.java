public class Triangulo implements Figuras{
    double lado1;
    double lado2;
    double lado3;
    static Triangulo instancia;
    public Triangulo() {
        this.lado1 = 2;
        this.lado2 = 3;
        this.lado3 = 3;
    }
    public static Triangulo getInstance(){
        if(instancia == null){
            instancia = new Triangulo();
        }
        return instancia;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s*(s - lado1) * (s - lado2)* (s - lado2));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
