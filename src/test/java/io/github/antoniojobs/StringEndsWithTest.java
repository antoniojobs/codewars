package io.github.antoniojobs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringEndsWithTest {
    @Test
    public void staticTests() {
        check3("samurai", "ai", true);
        check3("sumo", "omo", false);
        check3("ninja", "ja", true);
        check3("sensei", "i", true);
        check3("samurai", "ra", false);
        check3("abc", "abcd", false);
        check3("abc", "abc", false);
        check3("abcabc", "bc", true);
        check3("ails", "fails", false);
        check3("fails", "ails", true);
        check3("this", "fails", false);
        check3("this", "", true);
        check3(":-)", ":-(", false);
        check3("!@#$%^&*() :-)", ":-)", true);
        check3("abc\n", "abc", false);
    }

//    private void check(String str, String ending, boolean expected) {
//        boolean result = StringEndsWith.solution(str, ending);
//        System.out.println(str + " : result " + result + " : expected " + expected);
//        assertEquals(expected, result, "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
//    }

//    private static void check2(String str, String ending, boolean expected) {
//        boolean result = StringEndsWith.solution2(str, ending);
//        assertEquals(expected, result, " Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
//    }

    private static void check3(String str, String ending, boolean expected) {
        boolean result = StringEndsWith.solution2Melhorada(str, ending);
        assertEquals(expected, result, " Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
    }
}