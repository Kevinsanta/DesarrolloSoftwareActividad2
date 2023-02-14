import java.util.Scanner;

public class Ejercicio2 {
    private static int hallarCantidadBuses(int gordos, int flacos, int sillas)
    {
        int buses = (int) Math.ceil((gordos * 2 + flacos) / (double)sillas);
        return buses;
    }
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int gordos, flacos, sillas, buses;

        System.out.print("Cantidad de gordos: ");
        gordos = teclado.nextInt();
        System.out.print("Cantidad de flacos: ");
        flacos = teclado.nextInt();
        System.out.print("Cantidad de sillas en un bus: ");
        sillas = teclado.nextInt();

        buses = hallarCantidadBuses(gordos, flacos, sillas);
        System.out.println("Se necesitan alquilar " + buses + " buses");
    }


}
