import java.util.Scanner;

public class Ejercicio5 {
    static double calcularAreaCirculo(double radio)
    {
        double area = Math.PI * radio * radio;
        return area;
    }

    static double calcularAreaCoronaCircular(double radio1, double radio2)
    {
        double area1 = calcularAreaCirculo(radio1);
        double area2 = calcularAreaCirculo(radio2);

        double coronaCircular;
        if(area1 >= area2)
        {
            coronaCircular = area1 - area2;
        }
        else
        {
            coronaCircular = area2 - area1;
        }
        return coronaCircular;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio1, radio2, areaCoronaCircular;

        System.out.print("Ingrese el radio 1: ");
        radio1 = teclado.nextDouble();
        System.out.print("Ingrese el radio 2: ");
        radio2 = teclado.nextDouble();

        areaCoronaCircular = calcularAreaCoronaCircular(radio1, radio2);
        System.out.println("Area corona circular: " + areaCoronaCircular);
    }
}
