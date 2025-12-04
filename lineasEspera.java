import java.util.Scanner;

public class lineasEspera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t Teoria de lineas de espera");
        System.out.println("---------------------------------------------------");
        int opcion = 0;
        System.out.println("Seleccione el modelo que desea calcular: ");
        System.out.println("1. Modelo M/M/1");
        System.out.println("2. Modelo M/M/c");
        System.out.println("3. Modelo M/M/1/K");
        opcion = scanner.nextInt();
        double lambda = 0, mu = 0;
        int c = 0, K = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado el modelo M/M/1");
                System.out.println("Ingrese la tasa de llegada (λ): ");
                lambda = scanner.nextDouble();
                System.out.println("Ingrese la tasa de servicio (μ): ");
                mu = scanner.nextDouble();
                break;
            case 2:
                System.out.println("Ha seleccionado el modelo M/M/c");
                System.out.println("Ingrese la tasa de llegada (λ): ");
                lambda = scanner.nextDouble();
                System.out.println("Ingrese la tasa de servicio (μ): ");
                mu = scanner.nextDouble();
                System.out.println("Ingrese el numero de servidores (c): ");
                c = scanner.nextInt();
                break;
            case 3:
                System.out.println("Ha seleccionado el modelo M/M/1/K");
                System.out.println("Ingrese la tasa de llegada (λ): ");
                lambda = scanner.nextDouble();
                System.out.println("Ingrese la tasa de servicio (μ): ");
                mu = scanner.nextDouble();
                System.out.println("Ingrese la capacidad del sistema (K): ");
                K = scanner.nextInt();
                break;
        }

    }
}