public class NestedLoopExample {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        int n = 8;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 1 || j == 3)
                    continue;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
