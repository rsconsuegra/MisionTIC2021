import java.util.Scanner;

/*
A main class which uses a employee class, which extends from persona.  
*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        int edad = Integer.parseInt(sc.nextLine());
        String cargo = sc.nextLine();
        int tiempo_en_compania = Integer.parseInt(sc.nextLine());
        sc.close();

        Employee empleado = new Employee(nombre, edad, cargo, tiempo_en_compania);

        System.out.println(empleado.bonification());

        Employee[] empleados = new Employee[5];

        empleados[0] = new Employee(nombre, edad, cargo, tiempo_en_compania);
        empleados[1] = new Employee("Maria", 32, cargo, 8);
        empleados[2] = new Employee("Sofia", 45, cargo, 21);
        empleados[3] = new Employee("Gabriel", 16, cargo, 4);

        int max = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (max < empleados[i].getTiempo_en_compania()) {
                max = empleados[i].getTiempo_en_compania();
            }
        }
        System.out.println(max);
    }
}
