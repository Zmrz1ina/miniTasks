public class BubbleSorting {

    //Реализуйте алгоритм сортировки пузырьком для сортировки массива

    public static void test() {

        System.out.println("2 Task");

        int array[] = Random_array.array();

        System.out.println("NO Sorted array");
        Random_array.printArray(array);

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) { // if (last < last - 1)
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;
                }

            }
        }
        System.out.println("Sorted array");
        Random_array.printArray(array);

    }
}
