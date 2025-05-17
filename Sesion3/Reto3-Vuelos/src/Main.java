public class Main {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        boolean exito = vuelo1.reservarAsiento(pasajero1);
        System.out.println(exito ? "✅ Reserva realizada con éxito." : "⚠️ No se pudo realizar la reserva.");

        // Mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar reserva
        vuelo1.cancelarReserva();

        // Mostrar itinerario otra vez
        System.out.println(vuelo1.obtenerItinerario());

        // Reservar con sobrecarga
        vuelo1.reservarAsiento("Mario Gonzalez", "P654321");

        // Mostrar itinerario final
        System.out.println(vuelo1.obtenerItinerario());
    }
}
