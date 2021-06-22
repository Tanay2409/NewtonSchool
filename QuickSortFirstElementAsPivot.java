public class QuickSortFirstElementAsPivot {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;

        for(int j = low + 1; j <= high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }

    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {25, 5, 15, 10, 80, 30, 90, 10, 40, 50, 70, 20, -10};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
