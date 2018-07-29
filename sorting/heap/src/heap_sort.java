public class heap_sort {

    public static void main(String[] args) {

        int[] array = {-1, 5, 8, 17, 3, 9, 2, 6, 12};
        buildHeap(array);


    }

    private static void heapSort(int[] arr){

    }

    private static void buildHeap(int[] arr){
        for (int i = (arr.length-1)/2; i >= 1; i--) {
            heapfiy(arr, i);
        }
        print(arr);
    }

    private static void heapfiy(int[] arr, int num){
        int k, tmp;

        if(num*2 > arr.length)
            return;
        else{
            if(arr.length%2 == 1)
                k = num*2;
            else{
                if(arr[num*2] >= arr[num*2 +1])
                    k = num*2;
                else
                    k = num*2 +1;
            }

            if(arr[num] >=  arr[k])
                return;
            else{
                tmp = arr[num];
                arr[num] = arr[k];
                arr[k] = tmp;
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
