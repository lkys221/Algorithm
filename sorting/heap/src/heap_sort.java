public class heap_sort {

    public static void main(String[] args) {

        int[] array = {-1, 5, 8, 17, 3, 9, 2, 6, 12};
        heapSort(array);
        print(array);


    }

    private static void heapSort(int[] arr){
        int heap_size = arr.length-1;
        buildHeap(arr);
        for (int i = heap_size; i >= 2; i--) {
            int tmp = arr[1];
            arr[1] = arr[i];
            arr[i] = tmp;
            heap_size--;
            heapfiy(arr, 1);

        }
    }

    private static void buildHeap(int[] arr){
        for (int i = (arr.length-1)/2; i >= 1; i--) {
            heapfiy(arr, i);
        }
    }

    private static void heapfiy(int[] arr, int num){
        int k, tmp;

        if(num*2 > arr.length)
            return;
        else{
            if(arr.length%2 == 1 && num == (arr.length-1)/2 )
                k = num*2;
            else{
                if(arr[num*2] >= arr[num*2 +1])
                    k = num*2;
                else
                    k = num*2 +1;
            }

            if(arr[num] >=  arr[k])
                return;

            tmp = arr[num];
            arr[num] = arr[k];
            arr[k] = tmp;
            heapfiy(arr, k);
        }

    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
