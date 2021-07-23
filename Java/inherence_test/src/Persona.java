public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

} // Cierre de la clase

class Profesor extends Persona {

    // Campos específicos de la subclase.
    private String IdProfesor;
    // Constructor de la subclase: incluimos como parámetros al menos los del
    // constructor de la superclase

    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        IdProfesor = "Unknown";
    } // Cierre del constructor

    // Métodos específicos de la subclase
    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void mostrar_datos() {
        /*
         * nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de
         * la superclase, salta un error Sí podemos acceder a variables de instancia a
         * través de los métodos de acceso públicos de la superclase
         */
        System.out.println("Profesor de nombre: " + getNombre() + " " + getApellidos() + " con Id de profesor: "
                + getIdProfesor());
    }

} // Cierre de la clase

class Estudiante extends Persona {

    private String id;

    public Estudiante(String nombre, String apellidos, int edad, String id) {
        super(nombre, apellidos, edad);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}