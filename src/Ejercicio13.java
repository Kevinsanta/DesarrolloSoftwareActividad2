import java.util.Scanner;

public class Ejercicio13 {
    static double calcularAumento(double sueldo)
    {
        double aumento;
        if(sueldo <= 800000)
        {
            aumento = sueldo * 0.1;
        } else if (sueldo > 800000 && sueldo <= 1200000) {
            aumento = sueldo * 0.08;
        } else
        {
            aumento = sueldo * 0.05;
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldo, aumento, nuevoSueldo;

        System.out.print("Ingrese sueldo: ");
        sueldo = teclado.nextDouble();

        if(sueldo <= 0)
        {
            System.out.println("El sueldo ingresado es invalido");
        }
        else
        {
            aumento = calcularAumento(sueldo);
            nuevoSueldo = sueldo + aumento;
            System.out.println("El nuevo salario es: " + nuevoSueldo);
        }
    }
}
