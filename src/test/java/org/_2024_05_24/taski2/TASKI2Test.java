package org._2024_05_24.taski2;

import Old.org._2024_05_24.taski2.TASKI2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

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
        Assertions.assertEquals(expected, TASKI2.sumOfSquaresOfOddNumbers(numbers));
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
        List<String> words = List.of("Sergey is cat", "Sergey is dog", "Elena", "Anna");
        List<String> expectedSortedWords = List.of("anna", "cat", "dog", "elena", "is", "sergey");
        Assertions.assertEquals(expectedSortedWords, TASKI2.uniqueSortedWords(words));
    }

    @Test
    void uniqueSortedWithEmptyWords() {
        List<String> words = List.of("", "s");
        List<String> expectedSortedWords = List.of("", "s");
        Assertions.assertEquals(expectedSortedWords, TASKI2.uniqueSortedWords(words));
    }

    @DisplayName("Возвращает список уникальных слов")
    @ParameterizedTest
    @MethodSource("getValuesFromStringsList")
    void uniqueSortedWordsMethodSource(List<String> words, List<String> expectedUniqueWords) {
        Assertions.assertEquals(expectedUniqueWords, TASKI2.uniqueSortedWords(words));
    }

    static Stream<Arguments> getValuesFromStringsList() {
        return Stream.of(Arguments.of(List.of("Sergey is cat", "Sergey is dog", "Elena", "Anna"),
                        List.of("anna", "cat", "dog", "elena", "is", "sergey")),
                Arguments.of(List.of("", "s"), List.of("", "s")));
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