import java.text.DecimalFormat;
import java.util.Scanner;

public class decformat_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double k = n*n;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String numberAsString = decimalFormat.format(k).replace('.', ',');
        System.out.println(numberAsString);

        
        String data = sc.nextLine();
        String[] vars = data.split("-");

        System.out.println(vars[0]);
        System.out.println(vars[1]);
        System.out.println(vars[2]);
        sc.close();
    }
}
