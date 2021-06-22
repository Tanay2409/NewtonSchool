public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        int size = arr.length;

        for(int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < size; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
