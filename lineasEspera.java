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

    public static void modeloMM1(double lambda, double mu) {
        double p = lambda / mu;
        double P0 = 1 - p;
        double Lq = (Math.pow(p, 2)) / (1 - p);
        double L = p / (1 - p);
        double Wq = Lq / lambda;
        double W = L / lambda;
        System.out.println("\n\n\t Resultados del modelo M/M/1:");
        System.out.println("Utilizacion del sistema (p): " + p);
        System.out.println("Probabilidad de que el sistema esté vacío (P0): " + P0);
        System.out.println("Numero promedio de clientes en la cola (Lq): " + Lq);
        System.out.println("Numero promedio de clientes en el sistema (L): " + L);
        System.out.println("Tiempo promedio en la cola (Wq): " + Wq);
        System.out.println("Tiempo promedio en el sistema (W): " + W);
    }
}