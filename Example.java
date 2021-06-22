import java.util.Scanner;

public class Example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
        int i;
        float f;

        System.out.println("Enter an integer: ");
        i = sc.nextInt();
        System.out.println("Enter a decimal: ");
        f = sc.nextFloat();

        float sum = i + f;
        float diff = i - f;
        float mult = i * f;
        float div = i / f;
        float rem = i % f;

        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Mult: " + mult);
        System.out.println("Div: " + div);
        System.out.println("Rem: " + rem);

        sum = sum + 100;
        System.out.println("Sum after adding 100: " + sum);

        sum += 100; //sum = sum + 100;
        System.out.println("Sum after adding 100 (using shorthand notation): " + sum);

        diff -= 100; //diff = diff - 100;
        mult *= 100; //mult = mult * 100;

        //
        //sum = 100 - sum;
        //sum = -(sum - 100);
        System.out.println("sum =+ : " + sum);
        sum =+ 98; //sum = (+100) -> sum = 100;
        System.out.println("sum =+ : " + sum);

        //(sum += 100) * 100; //(sum = sum + 100) * 100

        int a = 5;
        int b = a++; //a = a + 1
        System.out.println("b: " + b);
        System.out.println("a: " + a);
        a = 5;
        int c = ++a; //a = a + 1
        System.out.println("c: " + c);
        System.out.println("a: " + a);
        a = 5;
        int d = a--;
        System.out.println("d: " + d);
        System.out.println("a: " + a);
        a = 5;
        int e = --a;
        System.out.println("e: " + e);
        System.out.println("a: " + a);

        int a = 7;
        System.out.println(a);
        int b = a++ + ++a + ++a + a-- - --a; //7 + 9 + 10 + 10 - 8;
        //7 -> 8 ->  -> 10 -> 9 -> 8
        System.out.println(a);
        System.out.println(b);

        int a = 11;
        int b = 14;
        int c = a & b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c (a & b): " + c);

        a = 11;
        b = 14;
        c = a | b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c (a | b): " + c);

        a = 11;
        b = ~a;
        System.out.println("a: " + a);
        System.out.println("b (~): " + b);

        a = 11;
        b = 14;
        c = a ^ b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c (a ^ b): " + c);
         */

        int a = 13; //00001101
        System.out.println("a: " + a);
        int b = a >> 2; //00000011
        System.out.println("b: " + b);
        a = 13; //00001101
        System.out.println("a: " + a);
        int c = a << 3; //01101000
        System.out.println("c: " + c);
        a = 13;
        int d = a >>> 3; //00001101
        System.out.println("d: " + d);
    }
}