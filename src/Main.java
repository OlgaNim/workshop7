import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Automobile myCar = new Car("sedan", "white");
        Automobile myPickup = new Pickup("ute", "silver");
        Automobile mySUV = new SUV("universal", "black");
        letsDrive();
    }

    public static void letsDrive () {
        System.out.println("Lets drive the car!");
        System.out.println("Enter the car type: Car, Pickup or SUV");
        Scanner sc = new Scanner(System.in);
        String carType = sc.nextLine();
        if (carType.equals("Car")) {
            System.out.println(myCar);
        } else if (carType.equals("Pickup")) {

        } else if (carType.equals("SUV")) {

        } else {
            System.out.println("Wrong type");
        }
    }
}