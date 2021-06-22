public class ForEachExample {
    public static void main(String[] args) {
        int numArr[] = {1, 2, 3, 4, 5};

        for(int i = 0; i < 5; i++) {
            System.out.println(numArr[i]);
        }

        //Enhanced 'for' loop
        for(int i : numArr) {
            System.out.println(i);
        }
    }
}
