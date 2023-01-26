import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_keyValue {

    // Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.

    public static void test() {

        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();

        keyValue.put(1, "Hello");

        keyValue.put(2, "World");

        keyValue.put(3, "Have a nice day!");

        System.out.println("Размер keyValue = " + keyValue.size());

        System.out.println("\nЦикл While:");

        Iterator iter = keyValue.entrySet().iterator();

        while (iter.hasNext()) {

            Map.Entry qurentMe = (Map.Entry) iter.next();

            System.out.println("Ключ это " + qurentMe.getKey() + " Значение это " + qurentMe.getValue());

        }

        System.out.println("\nЦикл For:");

        for (Map.Entry qurentMe2 : keyValue.entrySet()) {

            System.out.println("Ключ это: " + qurentMe2.getKey() + " Значение это: " + qurentMe2.getValue());

        }

    }
}
