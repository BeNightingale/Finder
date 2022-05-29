package exam;

import java.util.Arrays;

public class Validator {

    public static boolean isInRange(int[] numbers) {
        return Arrays.stream(numbers).noneMatch(x -> x > numbers.length || x < 0);
    }

    public static boolean isDistinct(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() == numbers.length;
    }

    public static boolean isValid(int[] numbers) {
        return isInRange(numbers) && isDistinct(numbers);
    }
}
