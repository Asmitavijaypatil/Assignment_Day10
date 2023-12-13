import java.util.Scanner;

class FruitJuice {
    int product_code;
    String flavor;
    String pack_type;
    int pack_size;
    int product_price;

    public FruitJuice() {
        product_code = 0;
        flavor = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product code: ");
        product_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter flavor: ");
        flavor = scanner.nextLine();

        System.out.print("Enter pack type: ");
        pack_type = scanner.nextLine();

        System.out.print("Enter pack size: ");
        pack_size = scanner.nextInt();

        System.out.print("Enter product price: ");
        product_price = scanner.nextInt();
    }
    public void discount() {
        product_price = product_price - 10;
        //product_price -= (product_price * 0.1); if discount is 10%

    }

    public void display() {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavor: " + flavor);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size + " ml");
        System.out.println("Product Price: " + product_price);
    }
}
public class Question5 {

    public static void main(String[] args) {
        FruitJuice juice = new FruitJuice();

        System.out.println("Enter details for the fruit juice:");
        juice.input();

        System.out.println("\nOriginal Details:");
        juice.display();

        System.out.println("\nDetails after applying discount:");
        juice.discount();
        juice.display();
    }
}