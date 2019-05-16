// Greed is a dice game played with five six-sided dice.
// Your mission, should you choose to accept it, is to score a throw according to these rules.
// You will always be given an array with five six-sided dice values.
//
// Three 1's => 1000 points
// Three 6's =>  600 points
// Three 5's =>  500 points
// Three 4's =>  400 points
// Three 3's =>  300 points
// Three 2's =>  200 points
// One   1   =>  100 points
// One   5   =>   50 point
// A single die can only be counted once in each roll.
// For example, a "5" can only count as part of a triplet (contributing to the 500 points)
// or as a single 50 points, but not both in the same roll.
//
// Example scoring
//
// Throw       Score
// ---------   ------------------
// 5 1 3 4 1   50 + 2 * 100 = 250
// 1 1 1 3 1   1000 + 100 = 1100
// 2 4 4 5 4   400 + 50 = 450

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Kata {

    static int greedy(int[] dice) {
        Map<Integer, Long> scoreboard = Arrays
                .stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return scoreboard.entrySet()
                .stream()
                .mapToInt(value -> getScore(value.getKey(), value.getValue()))
                .sum();
    }

    private static int getScore(int number, Long occurrences) {
        int total = 0;
        while (occurrences > 0) {
            if ((occurrences - 3) >= 0) {
                occurrences = occurrences - 3;
                switch (number) {
                    case 1:
                        total = total + 1000;
                        break;
                    case 2:
                        total = total + 200;
                        break;
                    case 3:
                        total = total + 300;
                        break;
                    case 4:
                        total = total + 400;
                        break;
                    case 5:
                        total = total + 500;
                        break;
                    case 6:
                        total = total + 600;
                        break;
                }
            }
            else {
                occurrences = occurrences - 1;
                switch (number) {
                    case 1:
                        total = total + 100;
                        break;
                    case 5:
                        total = total + 50;
                        break;
                }
            }
        }
        return total;
    }
}
