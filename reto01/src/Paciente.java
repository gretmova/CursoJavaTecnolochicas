
public class Paciente {

    String nombre;

    int edad;
    String IdExpediente;

    public Paciente(String paciente,  int edadP, String expediente){
        nombre = paciente;
        edad =edadP;
        IdExpediente=expediente;
    }

    public void mostrarInformacion(){
        System.out.println("Paciente: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Expediente: "+ IdExpediente);
    }

}
