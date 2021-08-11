public class find_values {
    public static void main(String[] args) {
        int[] numeros = {1,5,4,18,22,10,3,4,16,48};
        int[] mayores = new int[numeros.length];

        int pos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>100){
                mayores[pos]=numeros[i];
                pos++;
            }
        }

        if (pos==0){
            System.out.println("No hay mayores");
        }else{
            for (int i = 0; i < pos; i++) {
                System.out.println(mayores[i]);
            }
        }
    }
}
