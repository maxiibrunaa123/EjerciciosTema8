//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último
// muéstralas por consola.

public class Main {

    public static void main(String[] args){

        Persona miPersona = new Persona();
        miPersona.setEdad(29);
        miPersona.setNombre("Maximiliano Bruna");
        miPersona.setTelefono("2612518591");
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getTelefono());
    }
}

