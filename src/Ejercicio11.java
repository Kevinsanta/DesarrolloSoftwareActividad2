import java.util.Scanner;

public class Ejercicio11 {

    static int retornarCifraDecenas(int numero)
    {
        int cifraDecenas = (int)((double) numero / (double) 10);
        return cifraDecenas;
    }

    static int retornaCifraUnidades(int numero)
    {
        int cifraDecenas = retornarCifraDecenas (numero);
        int cifraUnidades = numero - (cifraDecenas * 10);
        return cifraUnidades;
    }

    static String retornaRomanoUnidades(int numero)
    {
        String romano = "";
        if(numero == 1)
        {
            romano = "I";
        } else if (numero == 2) {
            romano = "II";
        }else if (numero == 3) {
            romano = "III";
        } else if (numero == 4) {
            romano = "IV";
        } else if (numero == 5) {
            romano = "V";
        } else if (numero == 6) {
            romano = "VI";
        } else if (numero == 7) {
            romano = "VII";
        } else if (numero == 8) {
            romano = "VIII";
        } else if (numero == 9) {
            romano = "IX";
        }
        return romano;
    }

    static String retornaRomanoDecenas(int numero)
    {
        String romano = "";
        if(numero == 1)
        {
            romano = "X";
        } else if (numero == 2) {
            romano = "XX";
        }else if (numero == 3) {
            romano = "XXX";
        } else if (numero == 4) {
            romano = "XL";
        } else if (numero == 5) {
            romano = "L";
        } else if (numero == 6) {
            romano = "LX";
        } else if (numero == 7) {
            romano = "LXX";
        } else if (numero == 8) {
            romano = "LXXX";
        } else if (numero == 9) {
            romano = "XC";
        }
        return romano;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String romano;

        System.out.print("Ingrese número entero: ");
        numero = teclado.nextInt();

        if(numero < 0 || numero >= 100)
        {
            System.out.println("Error: el número no puede ser negativo o tener 3 cifras o mas");
        }
        else
        {
            int cifraDecenas = retornarCifraDecenas(numero);
            int cifraUnidades = retornaCifraUnidades(numero);

            String decenasRomano = retornaRomanoDecenas(cifraDecenas);
            String unidadesRomano = retornaRomanoUnidades(cifraUnidades);

            System.out.println("El número en romano es: " + decenasRomano + unidadesRomano);
        }
    }
}
