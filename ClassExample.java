public class ClassExample {
    //Data Members
    int num1; //Instance Variable
    int num2; //Instance Variable
    static int sum; //Static Variable

    void display() {
        System.out.println("Sum is: " + sum);
    }
    void sum(int num1, int num2) {
        sum = num1 + num2;

        display();
    }
    int multiply(int num1, int num2) {
        int product = num1 * num2;

        return product;
    }

    public static void main(String args[]) {
        ClassExample classExample1 = new ClassExample();
        ClassExample classExample2 = new ClassExample();

        classExample1.num1 = 10;
        classExample1.num2 = 20;

        classExample2.num1 = 100;
        classExample2.num2 = 200;

        classExample1.sum(classExample1.num1, classExample1.num2);
        classExample2.sum(classExample2.num1, classExample2.num2);

        System.out.println("Product: " + classExample1.multiply(classExample1.num1, classExample1.num2));
    }
}