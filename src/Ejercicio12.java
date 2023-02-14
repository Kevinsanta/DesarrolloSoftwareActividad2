import java.util.Scanner;

public class Ejercicio12 {

    static String obtenerDiaSiguiente(String dia)
    {
        String diaSiguiente;
        if(dia.equals("lunes"))
        {
            diaSiguiente = "martes";
        } else if (dia.equals("martes")) {
            diaSiguiente = "miercoles";
        } else if (dia.equals("miercoles")) {
            diaSiguiente = "jueves";
        } else if (dia.equals("jueves")) {
            diaSiguiente = "viernes";
        } else if (dia.equals("viernes")) {
            diaSiguiente = "sabado";
        } else if (dia.equals("sabado")) {
            diaSiguiente = "domingo";
        } else if (dia.equals("domingo")) {
            diaSiguiente = "lunes";
        }
        else{
            diaSiguiente = "Dia invalido";
        }
        return diaSiguiente;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dia de la semana");
        String dia = teclado.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(dia);
        System.out.println("El dia siguiente es: " + diaSiguiente);
    }
}
