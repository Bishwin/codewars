import java.util.Arrays;

public class Keypad {

    public static int presses(String phrase) {
        phrase = phrase.toUpperCase();

        int totalPresses = 0;
        totalPresses = totalPresses + getSpaces(phrase);

        phrase = phrase.replaceAll(" ", "");

        char[] chars = phrase.toCharArray();
        Arrays.sort(chars);

        String[] keys = {
                "1",
                "ABC2",
                "DEF3",
                "GHI4",
                "JKL5",
                "MNO6",
                "PQRS7",
                "TUV8",
                "WXYZ9",
                " 0",
                "*",
                "#",
        };

        for (char c : chars) {
            for (String key : keys) {
                if (key.contains(String.valueOf(c))) {
                    int presses = key.indexOf(c) + 1;
                    totalPresses = totalPresses + presses;
                }
            }
        }

        return totalPresses;
    }

    private static int getSpaces(String phrase) {
        return phrase.split(" ").length - 1;
    }

}
