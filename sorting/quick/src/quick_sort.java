public class quick_sort {
    public static void main(String[] args) {
        int array[] = {3, 5, 1, 2, 7, 8};

        quickSort(array, 0, array.length-1);



    }

    private static void quickSort(int[] arr, int a, int c){

        if(a < c) {
            int b = sort(arr, a, c);
            quickSort(arr, a, b - 1);
            quickSort(arr, b + 1, c);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int sort(int[] arr, int a, int c){
        int i = a-1;
        int j = a;
        int pivot = arr[c];
        int tmp, tmp2;

        for (int k = a; k < c-1; k++) {
            if(arr[j] > pivot)
                j++;
            else{
                i++;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }

        tmp2 = arr[i+1];
        arr[i+1] = arr[c];
        arr[c] = tmp2;
        
        return i+1;
    }
}
