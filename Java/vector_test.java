import java.util.Scanner;

class Vehicle {
    private String color;

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}

public class vector_test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());

        Vehicle v2 = new Vehicle();
        v2.setColor("Blue");
        System.out.println(v2.getColor());
    }
}