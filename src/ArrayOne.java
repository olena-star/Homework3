public class ArrayOne {
    public static void main(String[] args) {

        int[] array = new int[]{17,8,9,37,4,50,45,25};

        for(int i = 0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i = 0; i< array.length;i++){
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
