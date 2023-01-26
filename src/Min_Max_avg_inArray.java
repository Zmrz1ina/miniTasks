public class Min_Max_avg_inArray {

    // Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
    //
    // Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

    public static void test() {

        System.out.println("1 Task");

        int[] array = Random_array.array();

        int max = array[0];
        int min = array[0];
        int avg = 0;

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }

            if (min > array[i]) {
                min = array[i];
            }

            avg += array[i] / array.length; // средне арифм.
        }

        System.out.println("max = " + max);
        System.out.println("mix = " + min);
        System.out.println("avg = " + avg + "\n");
    }
}
