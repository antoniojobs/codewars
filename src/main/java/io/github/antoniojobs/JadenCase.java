package io.github.antoniojobs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

//    String substringStringInterval(String palavra, int inicio, int fim) {
//        inicio = inicio == 0 ? 0 : inicio;
//        fim = fim == 0 ? 1 : fim;
//        return palavra.substring(inicio, fim);
//    }

    public JadenCase() {
    }

    public String toJadenCase(String frase){

        if (frase !=null && frase.length() != 0){
        String StringPalavras = Arrays.stream(frase.split(" "))
                .map(palavra -> palavra.substring(0, 1)
                        .toUpperCase() +
                        palavra.substring(1))
                .collect(Collectors.joining(" "));

            return StringPalavras;
        }else
            return frase;
    }

    public static void main(String[] args) {
        String frase = "How can mirrors be real if our eyes aren't real";

        JadenCase jademCase = new JadenCase();
        System.out.println(jademCase.toJadenCase(frase));

    }
}
