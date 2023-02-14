import java.util.Scanner;

public class Ejercicio3 {
    static double hallarLongitudEscalera(double altura, double angulo)
    {
        double anguloRadianes = Math.toRadians(angulo);
        double longitud = altura / Math.sin(anguloRadianes);
        return longitud;
    }

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double altura, angulo, longitud;

        System.out.print("Ingrese altura: ");
        altura = teclado.nextDouble();
        System.out.print("Ingrese angulo: ");
        angulo = teclado.nextDouble();

        longitud = hallarLongitudEscalera(altura, angulo);
        System.out.println("La longitud de la escalera es: " + longitud);
    }
}
