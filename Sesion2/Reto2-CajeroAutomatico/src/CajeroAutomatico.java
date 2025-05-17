import java.util.Scanner;
public class CajeroAutomatico {
    private static double saldo = 1000.0;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {

        boolean ejecucion = true;
        //ejecutar programa con do while

        do {
            String menu = """
                    Bienvenido al cajero automático
                    1. Consultar saldo
                    2. Depositar dinero
                    3. Retirar dinero
                    4. Salir
                    """;
            System.out.println(menu);
            System.out.println("Elija su opción: ");
            int userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    consultar();
                    continue;

                case 2:
                    depositar();
                    continue;
                case 3:
                    retirar();
                    continue;


                case 4:
                    ejecucion = false;
                    break;
                default: {
                    System.out.println("Porfavor introduzca una opción válida");
                }


            }

        } while (ejecucion);
        System.out.println("Gracias por usar nuestro cajero automático");

        input.close();
    }

    public static void consultar() {
        System.out.printf("Su saldo actual es: $%.2f%n", saldo);
    }


    public static void depositar() {
        System.out.println("Ingrese la cantidad a depositar:");
        double cantidad = input.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f%n", saldo);
        } else {
            System.out.println("Cantidad no válida");
        }
    }

    public static void retirar() {
        System.out.println("Ingrese la cantidad a retirar:");
        double cantidad = input.nextDouble();
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f%n", saldo);
        } else {
            System.out.println("Cantidad no válida o saldo insuficiente");
        }
    }
            //switch para diferentes operaciones
    }

