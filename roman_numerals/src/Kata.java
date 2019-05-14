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

            if (num != 0) {
                System.out.println("i " + num);
                while (num > 0) {
                    if (num < 100) {
                        System.out.println("num " + num);
                    }

                    if (num >= 1000) {
                        sb.append("M");
                        num = num - 1000;
                    } else if (num < 10) {
                        if (num - 9 >= 0) {
                            sb.append("IX");
                            num = num - 9;
                        } else if (num - 5 >= 0) {
                            sb.append("V");
                            num = num - 5;
                        } else if (num - 4 >= 0) {
                            sb.append("IV");
                            num = num - 4;
                        } else {
                            sb.append("I");
                            num = num - 1;
                        }
                    } else if (num < 100) {
                        if (num - 90 >= 0) {
                            sb.append("XC");
                            num = num - 90;
                        } else if (num - 50 >= 0) {
                            sb.append("L");
                            num = num - 50;
                        } else if (num - 40 >= 0) {
                            sb.append("XL");
                            num = num - 40;
                        } else if (num % 10 == 0) {
                            sb.append("X");
                            num = num - 10;
                        }
                    } else if (num < 500) {
                        if (num - 400 >= 0) {
                            sb.append("CD");
                            num = num - 400;
                        } else {
                            sb.append("C");
                            num = num - 100;
                        }
                    } else {
                        if (num - 900 >= 0) {
                            sb.append("CM");
                            num = num - 900;
                        } else {
                            sb.append("D");
                            num = num - 500;
                        }
                    }
                }
            }
        }
        return sb.toString();
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

