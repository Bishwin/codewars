//Write a function that accepts an array of 10 integers (between 0 and 9),
// that returns a string of those numbers in the form of a phone number.
//Example:
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
//The returned format must be correct in order to complete this challenge.
//Don't forget the space after the closing parentheses!

import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) {
            return "input wrong size";
        }

        String[] s = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        String phone = String.join("", s);

        return "(" + phone.substring(0, 3)
                + ") " + phone.substring(3, 6)
                + "-" + phone.substring(6, s.length);
    }
}