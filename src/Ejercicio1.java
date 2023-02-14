import java.util.Scanner;

public class Ejercicio1 {
    static int funcion(int x, int y)
    {
        int f = x * x + 2 * x * y + y *y;
        return f;
    }

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int x, y, f;

        System.out.print("Entre el valor de x ");
        x = teclado.nextInt();
        System.out.print("Entre el valor de y ");
        y = teclado.nextInt();

        f = funcion(x, y);
        System.out.print("El resultado es " + f);
    }
}
