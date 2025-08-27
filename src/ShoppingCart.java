
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //Declare
        String item;
        double price;
        int quantity;
        double total;
        char currency = '₱';


        //Prompts
        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like to get?: ");
        quantity = scanner.nextInt();

        //Calculate
        total = price * quantity;

        //Display
        System.out.print("\nYou have bought " + quantity + item + "/s");
        System.out.println("\nYour total is " + currency + " " + total);

        scanner.close();

    }
}
