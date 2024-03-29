public class MergeSort {
    static void printArray(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    void sort(int arr[], int l, int r) {
        if(l < r) {
            int m = l + (r - l) / 2; //int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            //Merge
            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Array: ");
        printArray(arr);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, left, right);

        System.out.println();

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
