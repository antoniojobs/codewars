package io.github.antoniojobs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleantoStringTest {

    @Test
    public void testTrue() {
        assertEquals("true", BooleantoString.convert(true));
    }

    @Test
    public void testFalse() {
        assertEquals("false", BooleantoString.convert(false));
    }

}