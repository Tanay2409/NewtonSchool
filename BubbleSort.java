public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        int size = arr.length;
        boolean isSwapped;

        for(int i = 0; i < size; i++) {
            isSwapped = false;
            System.out.println("i: " + i);
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j + 1] = temp;

                    isSwapped = true;
                }
            }

            if(!isSwapped) {
                break;
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
