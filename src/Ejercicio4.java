import java.util.Scanner;

public class Ejercicio4 {
    static double calcularValorArriendo(int sueldo)
    {
        double arriendo = (double)sueldo * 0.4;
        return arriendo;
    }

    static double calcularValorComida(int sueldo)
    {
        double comida = (double)sueldo * 0.15;
        return comida;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sueldo;
        double arriendo, comida, saldo;

        System.out.print("Ingrese sueldo: ");
        sueldo = teclado.nextInt();

        arriendo = calcularValorArriendo(sueldo);
        comida = calcularValorComida(sueldo);
        saldo = sueldo - arriendo - comida;

        System.out.println("Gasto en arriendo: " + arriendo);
        System.out.println("Gasto en comida: " + comida);
        System.out.println("Dinero restante: " + saldo);
    }
}
