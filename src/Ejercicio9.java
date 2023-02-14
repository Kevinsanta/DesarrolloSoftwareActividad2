import java.util.Scanner;

public class Ejercicio9 {
    static int retornaEnteroMayor(int entero1, int entero2)
    {
        int enteroMayor = entero1;
        if(entero2 > entero1)
        {
            enteroMayor = entero2;
        }
        return enteroMayor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entero1, entero2, enteroMayor;

        System.out.print("Ingrese entero 1: ");
        entero1 = teclado.nextInt();
        System.out.print("Ingrese entero 2: ");
        entero2 = teclado.nextInt();

        enteroMayor = retornaEnteroMayor(entero1, entero2);
        System.out.println("El entero mayor es : " + enteroMayor);
    }
}
