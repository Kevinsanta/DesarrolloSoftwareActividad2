import java.util.Scanner;

public class Ejercicio10 {
    static double calcularOperacionAritmetica(int entero1, int entero2, String operacion)
    {
        double resultado = 0;
        if(operacion.equals("+"))
        {
            resultado = entero1 + entero2;
        } else if (operacion.equals("-")) {
            resultado = entero1 - entero2;
        } else if (operacion.equals("*")) {
            resultado = (double) entero1 * (double) entero2;
        } else if (operacion.equals("/")) {
            resultado = (double) entero1 / (double) entero2;
        } else if (operacion.equals("%")) {
            resultado = (double) entero1 % (double) entero2;
        } else if (operacion.equals("**")) {
            resultado = Math.pow(entero1, entero2);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entero1, entero2;
        String operacion;
        double resultado;

        System.out.println("Ingrese Operación \"+\", \"-\", \"*\", \"/\", \"%\" o \"**\": ");
        operacion = teclado.nextLine();

        System.out.print("Ingrese entero 1: ");
        entero1 = teclado.nextInt();
        System.out.print("Ingrese entero 2: ");
        entero2 = teclado.nextInt();

        resultado = calcularOperacionAritmetica(entero1, entero2, operacion);

        System.out.println("El resultado es: " + resultado);
    }
}
