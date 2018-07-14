public class merge_sort {
    public static void main(String[] args) {
        int[] array = [3, 6, 1, 9, 4, 8, 2, 7];

        mergeSort(array, 0, array.length-1);


    }

    public static void mergeSort(int[] arr, int a, int c){
        if(a < c) {
            int b = (a + c) / 2;
            mergeSort(arr, a, b);
            mergeSort(arr, b + 1, c);
            merge(arr, a, b, c);
        }
    }

    public static void merge(int[] arr, int a, int b, int c){
        int i = a;
        int j = c;
        int k = 0;
        int tmp[];

        while(i <= b && j <= c){
            if(arr[i] <= arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }

        while(i <= b){
            tmp[k++] = arr[i++];
        }
        while(j <= c){
            tmp[k++] = arr[j++];
        }
    }
}
