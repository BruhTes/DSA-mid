public class Sort{
    void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left)/2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid++, right);

            merge (arr, left, mid, right)
        }
    }

    void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[j] = arr[mid + j + i];
        }

        int i = 0, j = 0;

        int k =left;
        while (i < n1  && j < n2) {
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }    
     }

    public static void main(String[] args{

    }

}