import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        double cedula = sc.nextDouble();

        sc.close();
        Person[] personas = new Person[4];
        
        personas[0] = new Person(nombre, edad, cedula);
        System.out.println(personas[0].rangoEdad());

        System.out.println(personas[0].comparacion(16));

        personas[1] = new Person("Maria", 16, 45454857d);
        System.out.println(personas[1].getNombre() + " " + personas[1].rangoEdad());
    }
}
