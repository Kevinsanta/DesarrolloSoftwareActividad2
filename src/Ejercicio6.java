import java.util.Scanner;

public class Ejercicio6 {
    static double calcularAreaRectangulo(double base, double altura)
    {
        double area = base * altura;
        return area;
    }

    static double calcularHipotenusa(double cateto1, double cateto2)
    {
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return  hipotenusa;
    }

    static double calcularAreaTrianguloRectangulo(double base, double altura)
    {
        double area = calcularAreaRectangulo(base, altura) / (double) 2;
        return area;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, alturaTriangulo, hipotenusa, perimetro, areaRectangulo, areaTriangulo, areaTotal;

        System.out.print("Ingrese lado A: ");
        a = teclado.nextDouble();
        System.out.print("Ingrese lado B: ");
        b = teclado.nextDouble();
        System.out.print("Ingrese lado C: ");
        c = teclado.nextDouble();

        alturaTriangulo = a - c;
        hipotenusa = calcularHipotenusa(b, alturaTriangulo);
        perimetro = a + b + c + hipotenusa;
        System.out.println("Perimeto del terreno es: " + perimetro);

        areaRectangulo = calcularAreaRectangulo(b, c);
        areaTriangulo = calcularAreaTrianguloRectangulo(b, alturaTriangulo);
        areaTotal = areaRectangulo + areaTriangulo;
        System.out.println("Area del terreno es: " + areaTotal);
    }
}
