public class Random_array {

    // Random array generator
    public static int[] array() {

        int n = 50; // length
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100); // 0 to 99
            // System.out.print(array[i] + ", ");
        }
        // System.out.println();
        return array;
    }

    // array output
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
}
