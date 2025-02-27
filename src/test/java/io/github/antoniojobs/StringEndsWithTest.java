package io.github.antoniojobs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StringEndsWithTest {

    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testSolution2Melhorada_CasoBasico_RetornaTrue() {
        assertTrue(StringEndsWith.solution2Melhorada("abc", "bc"));
    }

    @Test
    public void testSolution2Melhorada_CasoBasico_RetornaFalse() {
        assertFalse(StringEndsWith.solution2Melhorada("abc", "d"));
    }

    @Test
    public void testSolution2Melhorada_StringCompleta_MostraErro() {
        StringEndsWith.solution2Melhorada("abc", "abc");
        assertEquals("(string = abc) e (pesquisada = abc) não coloque a palavra inteira",
                outContent.toString());
    }

    @Test
    public void testSolution2Melhorada_Nulos_RetornaFalse() {
        assertFalse(StringEndsWith.solution2Melhorada(null, "abc"));
        assertFalse(StringEndsWith.solution2Melhorada("abc", null));
    }

    @Test
    public void testSolution2Melhorada_SufixoMaior_RetornaFalse() {
        assertFalse(StringEndsWith.solution2Melhorada("abc", "abcd"));
    }
}
