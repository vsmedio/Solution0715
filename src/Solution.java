import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Объяви переменную типа список строк и сразу проинициализируй ee.
3. Добавь в список слова: «мама», «мыла», «раму».
4. После каждого слова добавь в список строку, содержащую слово «именно».
5. Выведи элементы списка на экран, каждый с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"мама", "мыла", "раму"}));
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < list.size(); i += 2) {
            list.add(i+1, "именно");
        }

        for (String word : list) {
            System.out.println(word);
        }
    }
}
