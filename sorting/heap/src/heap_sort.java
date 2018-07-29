public class heap_sort {

    public static void main(String[] args) {

        int[] array = {-1, 5, 8, 14, 1, 3, 9, 15, 16, 2, 6, 12};
        heapfiy(array, 1);
        print(array);


    }

    private static void heapSort(int[] arr){

    }

    private static void buildHeap(int[] arr){

    }

    private static void heapfiy(int[] arr, int num){
        int k, tmp;
        if(num*2 > arr.length)
            return;
        else{
            if(arr[num*2] > arr[num*2 +1])
                k = num*2;
            else
                k = num*2 +1;

            if(arr[num] >=  arr[k])
                return;
            else{
                tmp = arr[num];
                arr[num] = arr[k];
                arr[k] = tmp;
                print(arr);
                heapfiy(arr, k);

            }
        }

    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
