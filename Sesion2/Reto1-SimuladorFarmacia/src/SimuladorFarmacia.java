import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el nombre del medicamento :");
        String nombreMedicamento = input.nextLine();
        System.out.println("Introduzca su precio unitario:");
        double precio = input.nextDouble();
        System.out.println("Cantidad de piezas:");
        int piezas = input.nextInt();


        var total = precio * piezas;
        var CantidadDescuento = total * 0.15;

        boolean descuento = total > 500;
        var totalFinal = (descuento) ? (total - CantidadDescuento) : total;

        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + piezas);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Total sin descuento: " + total);
        System.out.println("¿Aplica descuento?: " + descuento);
        System.out.println("Descuento: " + CantidadDescuento);
        System.out.println("Total a pagar: " + totalFinal);
    }
}
