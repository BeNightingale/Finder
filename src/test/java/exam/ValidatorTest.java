package exam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    @DisplayName("{1, 2, 3, 5} should not be in range")
    void shouldReturnFalseIfNumberIsGreaterThenArraySize() {
        //given
        int[] numbers = new int[] {1, 2, 3, 5};
        //when
        boolean result = Validator.isInRange(numbers);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("{0, 1, 2, 3} should be in range")
    void shouldReturnTrueIfNumbersAreNotGreaterThenArraySize() {
        //given
        int[] numbers = new int[] {0, 1, 2, 3};
        //when
        boolean result = Validator.isInRange(numbers);
        //then
        assertTrue(result);
    }

    @Test
    @DisplayName("{1, 2, 3, 5} should be distinct ")
    void shouldReturnTrueIfNumbersAreDistinct() {
        //given
        int[] numbers = new int[] {1, 2, 3, 5};
        //when
        boolean result = Validator.isDistinct(numbers);
        //then
        assertTrue(result);
    }

    @Test
    @DisplayName("{1, 2, 2, 5} should not be distinct ")
    void shouldReturnFalseIfNumbersAreNotDistinct2() {
        //given
        int[] numbers = new int[] {1, 2, 2, 5};
        //when
        boolean result = Validator.isDistinct(numbers);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("{1, 0, 2, 5} should not be valid")
    void shouldReturnFalseIfInputIsNotValid1() {
        //given
        int[] numbers = new int[] {1, 0, 2, 5};
        //when
        boolean result = Validator.isValid(numbers);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("{1, 0, 2, 1} should not be valid")
    void shouldReturnFalseIfInputIsNotValid2() {
        //given
        int[] numbers = new int[] {1, 0, 2, 1};
        //when
        boolean result = Validator.isValid(numbers);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("{1, 0, 0, 5} should not be valid")
    void shouldReturnFalseIfInputIsNotValid3() {
        //given
        int[] numbers = new int[] {1, 0, 0, 5};
        //when
        boolean result = Validator.isValid(numbers);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("{1, 0, 2, 3} should be valid")
    void shouldReturnTrueIfInputIsValid() {
        //given
        int[] numbers = new int[] {1, 0, 2, 3};
        //when
        boolean result = Validator.isValid(numbers);
        //then
        assertTrue(result);
    }
}