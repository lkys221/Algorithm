public class bubble_sort {
    public static void main(String[] args) {

        int[] array = {5, 3, 7, 8, 2, 4, 6, 1};
        int tmp;

        for (int i = array.length-1; i > 0 ; i--) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
