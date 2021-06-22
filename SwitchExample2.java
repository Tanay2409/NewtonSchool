public class SwitchExample2 {
    public static void main(String args[]) {
        int choice = 1;

        switch(choice) {
            case 1:
            case 2:
                System.out.println("Case");
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
            default:
                System.out.println("Default");
        }
    }
}
