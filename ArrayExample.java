import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int num[] = new int[n];

        for(int i = 0; i < n ; i++) {
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(num[i] + " ");
        }
    }
}