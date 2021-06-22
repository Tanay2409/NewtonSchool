public class FactorialUsingRecursion {
    int fact(int num) {
        int result;
        if(num == 1 || num == 0) {
            result = 1;
        }
        else {
            result = fact(num - 1) * num;
        }

        return result;
    }

    public static void main(String[] args) {
        FactorialUsingRecursion factorialUsingRecursion = new FactorialUsingRecursion();
        int factorial = factorialUsingRecursion.fact(5);
        System.out.println("Factorial is: " + factorial);
    }
}
