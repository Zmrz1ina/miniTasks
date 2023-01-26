import java.util.Arrays;

public class DeleteAll_20s {

    // Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).

    public static void test() {

        System.out.println("4 Task");

        int del = 20;

        int[] array = Random_array.array();
        System.out.println("before delete");
        Random_array.printArray(array);

        int counter = 0;

        for(int i = 0; i< array.length; i++){

            if(array[i] == del){
                counter++;
            } else{
                array[i - counter] = array[i]; // counter = 0 - записываем i в i
                                                // counter = 1 - записываем i в i - 1 (пред)
            }
        }

        // Arrays.copyOf копирует значение из массива array в новый массив
        // с длинной array.length - counter
        int[] newArray = Arrays.copyOf(array, array.length - counter);

        System.out.println("after delete");
        Random_array.printArray(newArray);
    }

}
