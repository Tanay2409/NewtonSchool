public class XPowerYUsingRecursion {
    static int pow(int x, int y) {
        int result;

        if(y == 0) {
            result = 1;
        }
        else {
            result = x * pow(x, y - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int result = pow(x, y);

        System.out.println("Result: " + result);
    }
}
