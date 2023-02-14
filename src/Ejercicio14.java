import java.util.Scanner;
public class Ejercicio14 {

    public static class Hermano
    {
        private String nombre;
        private int edad;
        public Hermano(String nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String obtenerNombre()
        {
            return nombre;
        }

        public int obtenerEdad()
        {
            return edad;
        }
    }

    static Hermano retornaHermanoMayor(Hermano[] hermanos)
    {
        Hermano mayor = null;
        for (int i = 0; i < hermanos.length; i++) {
            Hermano hermanoActual = hermanos[i];
            if(i == 0)
            {
                mayor = hermanoActual;
            } else if (mayor.obtenerEdad() < hermanoActual.obtenerEdad()) {
                mayor = hermanoActual;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Hermano[] hermanos = new Hermano[3];

        for (int i = 0; i < hermanos.length; i++) {
            int indiceHermano = i + 1;
            System.out.print("Ingrese nombre hermano " + indiceHermano + ":");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese edad hermano " + indiceHermano + ":");
            int edad = teclado.nextInt();
            teclado.nextLine();
            hermanos[i] = new Hermano(nombre, edad);
        }

        Hermano hermanoMayor = retornaHermanoMayor(hermanos);
        System.out.println("El nombre del hermano mayor es:" + hermanoMayor.obtenerNombre());
    }
}
