import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first  = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double second  = sc.nextDouble();

        switch (operator){
            case '+':
                System.out.println("Adding");
                System.out.println("Result: " + (first + second));
                break;

            case '-':
                System.out.println("subtracting");
                System.out.println("Result: " + (first - second));
                break;

            case '*':
                System.out.println("Multiplication");
                System.out.println("Result: " + (first * second));
                break;

            case '/' :
                System.out.println("Division");
                if (second == 0){
                    System.out.println("Number cant be divided by zero!");
                }else {
                    System.out.println("Result: " + (first / second));
                }
                break;


            default:
                System.out.println("Invalid operation!");
        }
    }
}
