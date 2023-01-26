public class PrimeNumbers {

    // Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
    // Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

    public static void test() {

        System.out.println("3 Task");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) { // выходит из цикла когда j = i и не попадает в if тк. j строго < i !!!
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
