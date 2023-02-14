import java.util.Scanner;

public class Ejercicio7 {
    static double calcularDistanciaEntrePuntos(double x1, double y1, double x2, double y2)
    {
        double distancia = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        return distancia;
    }

    static double calcularPendienteEntrePuntos(double x1, double y1, double x2, double y2)
    {
        double pendiente = (y2 - y1) / (x2 - x1);
        return pendiente;
    }

    static String calcularCoordenadasPuntoMedio(double x1, double y1, double x2, double y2)
    {
        double puntoMedioX = (x1 + x2) / 2;
        double puntoMedioY = (y1 + y2) / 2;
        return puntoMedioX + "," + puntoMedioY;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia, pendiente;
        String puntoMedio;

        System.out.print("Ingrese coordenada X1: ");
        x1 = teclado.nextDouble();
        System.out.print("Ingrese coordenada Y1: ");
        y1 = teclado.nextDouble();
        System.out.print("Ingrese coordenada X2: ");
        x2 = teclado.nextDouble();
        System.out.print("Ingrese coordenada Y2: ");
        y2 = teclado.nextDouble();

        distancia = calcularDistanciaEntrePuntos(x1, y1, x2, y2);
        pendiente = calcularPendienteEntrePuntos(x1, y1, x2, y2);
        puntoMedio = calcularCoordenadasPuntoMedio(x1, y1, x2, y2);

        System.out.println("Distancia entre puntos: " + distancia);
        System.out.println("Pendiente de la recta: " + pendiente);
        System.out.println("Punto medio: " + puntoMedio);
    }
}
