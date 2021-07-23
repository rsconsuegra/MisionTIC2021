public class elementos {
    public static void main(String[] args) {
        String[] pacientes = {"maria","sofia","sofia","maria","pedro","maria"};
        String[] nombres = {"maria","sofia","pedro"};
        int[] contadores = new int[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < pacientes.length; j++) {
                if (nombres[i].equals(pacientes[j])){
                    contadores[i]++;
                }                
            }
        }

        for (int i=0;i<nombres.length;i++) {
            System.out.println("El nombre " + nombres[i] + " aparecio" + contadores[i]);
        }
    }
}
