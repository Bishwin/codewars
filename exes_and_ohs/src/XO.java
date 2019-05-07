public class XO {

    public static boolean getXO(String str) {

        str = str.toLowerCase();
        int count = 0;

        if (str.contains("x") || str.contains("o")) {

            char[] array = str.toCharArray();

            for (char letter : array) {
                System.out.println(letter);
                if (letter == 'x') {
                    count++;
                    System.out.println("increase");
                } else if (letter == 'o') {
                    count--;
                    System.out.println("decrease");
                }
            }

        }
        return count==0;
    }
}
