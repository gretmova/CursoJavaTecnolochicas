import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre del medicamento: ");
        var medicamento = scanner.nextLine();  // Usamos 'var' para inferencia de tipo

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // Cálculo del total sin descuento
        double totalSinDescuento = precioUnitario * cantidad;

        // Verificar si aplica descuento
        boolean aplicaDescuento = totalSinDescuento > 500;

        // Calcular descuento usando operador ternario
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // Total a pagar después del descuento
        double totalAPagar = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\n--- Resumen de Compra ---");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.printf("Precio unitario: $%.2f%n", precioUnitario);
