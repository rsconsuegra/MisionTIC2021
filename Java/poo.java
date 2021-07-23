class Vehicles {
    int speed = 50;



}

public class poo {
    public static void main(String[] args) {
        Vehicles myObj = new Vehicles();
        System.out.println(myObj.speed);
        myObj.setspeed(15);
        System.out.println(myObj.speed);
        Vehicles myObj2 = new Vehicles();
        System.out.println(myObj2.speed);
    }
}