import java.util.Scanner;

public class SwitchExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter choice: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        char choice = sc.next().charAt(0);

        int result = 0;

        switch(choice) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);

                switch(1) {
                    case 1:
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("Default");
                }
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Wrong input");
        }
    }
}