/*Your task is to sort a given string.
Each word in the string will contain a single number.
This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""*/

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static String order(String words) {
        if(words.equals("")) return "";

        String[] words1 = words.split(" ");

        Map<Integer, String> w = new HashMap<>();

        for (String word : words1) {
            int index = Integer.parseInt(word.replaceAll("[a-zA-Z]", ""));
            w.put(index, word);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <words1.length; i++) {
            sb.append(w.get(i+1)+" ");
        }

        return sb.toString().trim();
    }
}