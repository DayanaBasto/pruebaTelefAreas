public class figuraGeometrica {

    //El area del triangulo es A= (base*alt) / 2
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    //El area de circulo es A=pi*(r)^2
    public static double calcularAreaCirculo(double radio) {
        return 3.14 * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        double base = 5.0;
        double altura = 10.0;

        double area = calcularAreaTriangulo(base, altura);

        System.out.println("El área del triángulo es: " + area);


        double radio = 6.3;

        double areaCirculo = calcularAreaCirculo(radio);

        System.out.println("El área del circulo es: " + areaCirculo);

    }

}
