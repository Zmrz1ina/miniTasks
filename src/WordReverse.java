public class WordReverse {

// Напишите программу на Java для переворачивания строки,
// изменив расположение символов в строке задом наперёд без использования встроенных в String функций

    public static void test() {

        String str = "Hello world";

        char[] mass = str.toCharArray();

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }

        System.out.println();

        for (int i = mass.length - 1; i >= 0; i--) { // до .length - 1, тк последний элем. доп знак
            System.out.print(mass[i]);
        }

    }
}