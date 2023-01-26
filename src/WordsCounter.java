import java.util.HashMap;

public class WordsCounter {

    // Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.

    public static void test() {

        String st = "Current task posted for Java developers Java developers";

        String[] words = st.split(" "); // разбивает строку на массив слов по опред. знаку " "

        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();

        for (int i = 0; i < words.length; i++) {

            if (keyValue.containsKey(words[i])) { // заходим если нашли совпад с записынным словом

                int counter = keyValue.get(words[i]); // узнаем counter ([слово, -- 1 -- ])

                keyValue.put(words[i], counter + 1); // увелич counter

            } else {

                keyValue.put(words[i], 1); // записываем знач в keyValue [слово, 1]

            }

        }

        System.out.println(keyValue);

    }
}
