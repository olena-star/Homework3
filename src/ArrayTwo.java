public class ArrayTwo {
    public static void main(String[] args) {
        int[] array = new int[]{10, 35, 35, 45, 70};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        String result = "Это строго возрастащая последовательность.";
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i - 1] >= array[i]) {
                result = "Это не строго возрастащая последовательность.";
                break;
            }
        } System.out.println(result);
    }
}

