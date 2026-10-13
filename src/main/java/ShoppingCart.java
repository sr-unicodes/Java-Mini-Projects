import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String item ;
        char currency ='$';
        double price;
        int quantity;
        double grandTotal = 0;

        while (true) {
            System.out.print("what you would like to buy: ");
            item = scanner.nextLine();
            if (item.isEmpty()) {
                break;
            }
            System.out.print("what is the price for each? : ");
            price = scanner.nextDouble();

            System.out.print("how many would you like? : ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            grandTotal += price * quantity;

            System.out.println("\n you  buy " + quantity + " " + item + "'s");
            System.out.print("Would you like to add another item? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.printf("Your total is: %c%.2f\n", currency, grandTotal);
        scanner.close();
    }

}

