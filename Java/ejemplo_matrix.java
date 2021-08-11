public class ejemplo_matrix {
    public static void main(String[] args) {
        String[] pacientes = { "maria", "sofia", "sofia", "maria", "pedro", "maria" };
        String[] nombres = { "maria", "sofia", "pedro" };
        int[] contadores = new int[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < pacientes.length; j++) {
                if (nombres[i].equals(pacientes[j])) {
                    contadores[i]++;
                }
            }
        }

        int pos = 3;
        System.out.println(nombres[pos - 1]);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El nombre " + nombres[i] + " aparecio" + contadores[i]);
        }
    }
}
