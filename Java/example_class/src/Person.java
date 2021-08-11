public class Person {
    private String nombre;
    private int edad;
    private double cedula;

    public Person(String nombre, int edad, double cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public Person() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        if (cedula>100000){
            this.cedula = cedula;
        }else{
            System.out.println("Cedula invalida");
        }
    }

    public String rangoEdad() {
        if (this.edad >= 15 && this.edad <= 22) {
            return "Es un joven";
        } else if (this.edad >= 22 && this.edad <= 40) {
            return "Es adulto";
        } else {
            return "Es mayor";
        }
    }

    public String comparacion(int edad2) {
        if (this.edad < edad2) {
            return this.nombre + " es menor que la otra persona";
        } else {
            return this.nombre + " es mayor que la otra persona";
        }
    }

}
