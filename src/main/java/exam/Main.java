package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = readInput(scanner);
            System.out.println("Missing number: " + findMissingNumber(numbers));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMissingNumber(int[] numbers) {
        int numbersLength = numbers.length;
        int realsSum = Arrays.stream(numbers).sum();
        int expectedSum = (numbersLength) * (numbersLength + 1) / 2;
        return expectedSum - realsSum;
    }

    public static int[] readInput(Scanner scanner) throws InvalidInputException {
        System.out.println("Write the number of numbers");
        int numberOfNumbers = scanner.nextInt();
        int[] numbers = new int[numberOfNumbers];
        System.out.printf("Write %d integer numbers in range 0 - %d%n", numberOfNumbers, numberOfNumbers);
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }
        if (!Validator.isValid(numbers)) {
            throw new InvalidInputException();
        }
        return numbers;
    }
}
