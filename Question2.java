import java.util.Scanner;

class Car {
    private int price;

    public Car(int p) {
       price  = p;
    }
    public void swap(Car c1, Car c2) {
       int price =c1.price;
       c1.price = c2.price;
       c2.price= price;
    }
    public int getPrice() {
        return price;
    }

}
public class Question2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter price of BMW: ");
    int p1 = sc.nextInt();

    System.out.println("Enter price of Maruticar: ");
    int p2 = sc.nextInt();

    Car c1 = new Car(p1);
    Car c2 = new Car(p2);
    c1.swap(c1,c2);

    System.out.println("Price of BMW = " + c1.getPrice());
    System.out.println("Price of MarutiCar = " + c2.getPrice());
    }

}
