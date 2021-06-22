import java.util.Scanner;

public class SelectionStatements {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        int salary = s.nextInt();
        System.out.println("Age: ");
        int age = s.nextInt();

        int taxRate;

        if(salary < 500000) {
            taxRate = 0;
        }
        else if(salary < 1000000) {
            taxRate = 20;
        }
        else if (salary < 3000000) {
            if(age < 60) {
                taxRate = 30;
            }
            else {
                taxRate = 20;
            }
        }
        else {
            taxRate = 40;
        }

        System.out.println("Tax Rate: " + taxRate);
    }
}
