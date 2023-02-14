import java.util.Scanner;

public class Ejercicio8 {
    static int calcularNumeroDeSalones(int numeroEstudiantes, int capacidadPorSalon)
    {
        int numeroDeSalones = (int) Math.ceil((double)numeroEstudiantes / (double) capacidadPorSalon);
        return numeroDeSalones;
    }

    static int calcularNumeroDePisos(int numeroDeSalones, int salonesPorPiso)
    {
        int numeroDePisos = (int) Math.ceil((double)numeroDeSalones / (double) salonesPorPiso);
        return numeroDePisos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroEstudiantes, capacidadPorSalon, salonesPorPiso, numeroDeSalones, numeroDePisos;

        System.out.print("Número de estudiantes de la universidad: ");
        numeroEstudiantes = teclado.nextInt();
        System.out.print("Capacidad de estudiantes por salon: ");
        capacidadPorSalon = teclado.nextInt();
        System.out.print("Número de salones por piso: ");
        salonesPorPiso = teclado.nextInt();

        numeroDeSalones = calcularNumeroDeSalones(numeroEstudiantes, capacidadPorSalon);
        numeroDePisos = calcularNumeroDePisos(numeroDeSalones, salonesPorPiso);

        System.out.println("Número de salones: " + numeroDeSalones);
        System.out.println("Número de pisos: " + numeroDePisos);
    }
}
