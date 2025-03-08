package io.github.antoniojobs;

import java.util.Arrays;

public class ArrayGrow {
    public static Integer grow(int[] arr) {
        return arr.length > 0 ? Arrays.stream(arr)
                .reduce(1, (acumulador, numeroAtual) ->
                        acumulador * numeroAtual): 0;
    }
}
