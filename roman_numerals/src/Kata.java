import java.util.Stack;

public class Kata {

    static String toRomanNumeral(int number) {
        if (number < 1 || number > 3000) {
            return "enter value between 1-3000";
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = toDigits(number);

        while (stack.size() > 0) {
            int size = stack.size() - 1;
            int base = (int) Math.pow(10, size);
            int num = stack.pop() * base;

            switch (base) {
                case 1000:
                case 100:
                case 10:
                case 1:
                    sb.append(convert(num, base));
                    break;
            }
        }
        System.out.println(number+" = " +sb.toString());
        return sb.toString();
    }

    private static String convert(int num, int base) {
        StringBuilder sb1 = new StringBuilder();
        while (num > 0) {
            if (num - (9*base) >= 0) {
                sb1.append(getNines(num));
                num = num - (9*base);
            } else if (num - (5*base) >= 0) {
                sb1.append(getFives(num));
                num = num - (5*base);
            } else if (num - (4*base) >= 0) {
                sb1.append(getFours(num));
                num = num - (4*base);
            } else {
                sb1.append(getTens(num));
                num = num - base;
            }
        }
        return sb1.toString();
    }

    private static String getNines(int num) {
        if(num - 900 >= 0){
            return "CM";
        } else if(num - 90 >= 0){
            return "XC";
        } else {
            return "IX";
        }
    }

    private static String getFives(int num) {
        if(num - 500 >= 0){
            return "D";
        } else if(num - 50 >= 0){
            return "L";
        } else {
            return "V";
        }
    }

    private static String getFours(int num) {
        if(num - 400 >= 0){
            return "CD";
        } else if(num - 40 >= 0){
            return "XL";
        } else {
            return "IV";
        }
    }

    private static String getTens(int num) {
        if(num - 1000 >= 0){
            return "M";
        }else if(num - 100 >= 0){
            return "C";
        } else if(num - 10 >= 0){
            return "X";
        } else {
            return "I";
        }
    }

    private static Stack<Integer> toDigits(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int digit = number % 10;
            stack.push(digit);
            number = number / 10;
        }
        return stack;
    }
}

