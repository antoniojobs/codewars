/**
 * Implemente uma função que converta o valor booleano fornecido em sua representação de string.
 * Nota: Somente entradas válidas serão fornecidas.
 * @author <a href="https://antoniojobs.github.io/">...</a>
 * Resolução de desafios da plataforma codewars
 * Link do desafio: <a href="https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java">...</a>
 * <p>
 * Complete a solução para que ela retorne true se o primeiro argument(string) passado terminar com o 2º argumento (também uma string).
 * <p>
 */
package io.github.antoniojobs;
public class BooleantoString {

    public static String convert(Boolean b) {
            return b instanceof Boolean ? Boolean.toString(b) : null;
    }
    public static void main(String[] args) {
        BooleantoString ob = new BooleantoString();
        System.out.println(ob.convert(false));
    }
}
