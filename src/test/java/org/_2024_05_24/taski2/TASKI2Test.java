package org._2024_05_24.taski2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TASKI2Test {

    @Test
    void sumOfSquaresOfOddNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int expected = 10;
        Assertions.assertEquals(expected, TASKI2.sumOfSquaresOfOddNumbers(numbers));
    }

    @Test
    void sumOfSquaresOfOddNumbersWithEvenNumbers() {
        List<Integer> numbers = List.of(2, 4);
        int expected = 0;
        Assertions.assertEquals(expected, TASKI2.sumOfSquaresOfOddNumbers(numbers));
    }

    @Test
    void sumOfSquaresOfOddNumbersWithNegNumbers() {
        List<Integer> numbers = List.of(-1, -4, 2, 3);
        int expected = 10;
        Assertions.assertEquals(expected, TASKI2.sumOfSquaresOfOddNumbers(numbers));
    }

    @DisplayName("test sum")
    @ParameterizedTest
    @MethodSource("getValuesFromList")
    void sumOfSquaresOfOddNumbersSourceTest(List<Integer> numbers, int expected) {
        Assertions.assertEquals(expected,TASKI2.sumOfSquaresOfOddNumbers(numbers));
    }

    static Stream<Arguments> getValuesFromList() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4), 10),
                Arguments.of(List.of(2, 4), 0),
                Arguments.of(List.of(-1, -4, 2, 3), 10)
        );
    }

    @Test
    void uniqueSortedWords() {
    }

    @Test
    void filterByField() {
    }

    @Test
    void uniqueChars() {
    }

    @Test
    void longestString() {
    }
}