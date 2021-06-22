public class Test {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        String s1="";
        String s2="";
        String msg="";
        for (int i = 0; i < arr.length; i++) {
            msg = (arr[i] % 2 == 0) ? (s1+=arr[i]+" ") : (s2+=arr[i]+" ");
        }
        System.out.println(msg);
        System.out.println(s1);
        System.out.println(s2);

    }
}
