public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};
        int size = arr.length;

        for(int i = 1; i < size; i++) {
            int currentElement = arr[i];

            int j = i - 1;

            while(j >= 0 && arr[j] > currentElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentElement;
        }

        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
}
