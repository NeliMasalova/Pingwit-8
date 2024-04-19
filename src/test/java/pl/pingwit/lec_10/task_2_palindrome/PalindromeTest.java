package pl.pingwit.lec_10.task_2_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PalindromeTest {
    private Palindrome target = new Palindrome();

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void shouldCheckPalindromeOrNot(String sourced) {
        //given
        //when
        boolean actual = target.isPalindrome(sourced);
        //then
        assertThat(actual).isTrue();
    }
    static Stream<String> stringIntAndListProvider() {
        return Stream.of("apple", "lemon");
    }
    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("1221"),
                Arguments.of("amma"),
                Arguments.of("    "),
                Arguments.of("!@@!"),
                Arguments.of("потоп")
        );
    }
}