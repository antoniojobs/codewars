package io.github.antoniojobs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayGrowTest {
    @Test
    public void testArrayGrow_ArrayNaoVazio() {
        assertEquals((Integer) 6, ArrayGrow.grow(new int[]{1, 2, 3}));
    }

    @Test
    public void testArrayGrow_ArrayVazio() {
        assertEquals((Integer) 0, ArrayGrow.grow(new int[]{}));
    }

}
