public class insertion_sort {
    public static void main(String[] args) {

        int[] array= {3, 6, 8, 4, 9, 1, 2, 2};

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];

            for (int j = i-1 ; j >= 0; j--) {
                if(array[j] > array[j+1]){
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
