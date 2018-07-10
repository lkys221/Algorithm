public class selection_sort {
    public static void main(String[] args) {

        int[] array = {5, 3, 7, 8, 2, 4, 6};
        int max = -1;
        int tmp, pos = 0;

        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > max){
                    pos = j;
                    max = array[j];
                }
            }
            tmp = array[i-1];
            array[i-1] = max;
            array[pos] = tmp;
            max = -1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
