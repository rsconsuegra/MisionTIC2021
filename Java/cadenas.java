import java.util.Scanner;

public class cadenas {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // ArrayList<String> datapaciente = new ArrayList<String>();
        String[] dpaciente;
        int nEntradas;

        System.out.print("Digite el numero de " + "entradas de pacientes a  registrar: ");
        nEntradas = entrada.nextInt();
        entrada.nextLine();
        String data1[] = new String[nEntradas], data2[] = new String[nEntradas], data3[] = new String[nEntradas],
                data4[] = new String[nEntradas], data5[] = new String[nEntradas], data6[] = new String[nEntradas],
                data7[] = new String[nEntradas];
        

        String[] pacientes = new String[nEntradas];
        for (int i = 0; i < nEntradas; i++) {
            pacientes[i] = entrada.nextLine();
            dpaciente = pacientes[i].split("-");
            data1[i] = dpaciente[0];
            data2[i] = dpaciente[1];
            data3[i] = dpaciente[2];
            data4[i] = dpaciente[3];
            data5[i] = dpaciente[4];
            data6[i] = dpaciente[5];
            data7[i] = dpaciente[6];
        }
        for (int i = 0; i < nEntradas; i++) {
            System.out.println(pacientes[i]);
        }
    }
}
