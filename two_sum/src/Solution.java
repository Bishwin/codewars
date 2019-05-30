//Write a function that takes an array of numbers (integers for the tests) and a target number.
//It should find two different items in the array that, when added together, give the target value.
//The indices of these items should then be returned in an array like so: [index1, index2].
//
//For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
//
//The input will always be valid
//(numbers will be an array of length 2 or greater, and all of the items will be numbers;
//target will always be the sum of two different items from that array).

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Arrays.stream(numbers).forEach(System.out::println);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; i < numbers.length; i++) {
                int sum = numbers[i]+numbers[j];

                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}