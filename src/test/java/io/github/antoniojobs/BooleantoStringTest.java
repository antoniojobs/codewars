package io.github.antoniojobs;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleantoStringTest {

    @Test
    public void testTrue() {
        assertEquals("true",BooleantoString.convert(true));
    }
    @Test
    public void testFalse() {
        assertEquals("false",BooleantoString.convert(false));
    }

}