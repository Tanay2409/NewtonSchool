public class ForExample {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("-----------");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");

        System.out.println("2");
        System.out.println("-----------");
        int i = 0;
        for(; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");

        System.out.println("3");
        System.out.println("-----------");
        i = 0;
        for(; ; i++) {
            if(i < 5) {
                System.out.println(i);
            }
            else {
                break; //go out of the loop
            }
        }
        System.out.println("-----------");

        System.out.println("4");
        System.out.println("-----------");
        i = 0;
        for(; ;) {
            if(i < 5) {
                System.out.println(i);
            }
            else {
                break;
            }
            i++;
        }
        System.out.println("-----------");
    }
}
