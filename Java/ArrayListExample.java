import java.io.*;
import java.util.*;

class ArrayListExample {
    public static void main(String[] args) {
        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        ArrayList<Integer> arrl2 = new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++) {
            arrli.add(i);
            arrl2.add(i * i);
        }
        for (int i = 0; i < arrli.size(); i++) {
            System.out.println(
                Integer.toString(arrli.get(i)) + " " + Integer.toString(arrl2.get(i)));
        }

    }
}