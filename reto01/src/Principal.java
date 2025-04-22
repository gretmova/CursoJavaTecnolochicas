import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        System.out.println("Nombre del paciente: ");
        Scanner nombre = new Scanner(System.in);
        String nombrePaciente = nombre.nextLine();

        System.out.println("Introduzca la edad del paciente: ");
        Scanner edad = new Scanner(System.in);
        int edadPaciente= edad.nextInt();

        System.out.println("Introduzca el número de expediente del paciente: ");
        Scanner expediente = new Scanner(System.in);
        String expedienteP = expediente.nextLine();

        Paciente p1 = new Paciente(nombrePaciente, edadPaciente, expedienteP);

        p1.mostrarInformacion();;

    }
}
