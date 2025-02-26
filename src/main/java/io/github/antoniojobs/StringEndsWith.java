/**
 * Classe que implementa métodos para verificar se uma string termina com outro string específico.
 * Esta implementação oferece duas soluções diferentes para o mesmo problema, permitindo
 * escolher entre uma abordagem simples e direta ou uma mais complexa com tratamento
 * especial para casos específicos.
 * @author <a href="https://antoniojobs.github.io/">...</a>
 * Resolução de desafios da plataforma codewars
 * Link do desafio: <a href="https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java">...</a>
 * <p>
 * Complete a solução para que ela retorne true se o primeiro argument(string) passado terminar com o 2º argumento (também uma string).
 * <p>
 * Exemplos:
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 * solution('abc', 'abc') // returns false
 */
package io.github.antoniojobs;

import java.util.Arrays;

public class StringEndsWith {
    /**
     * Constante que representa a mensagem de erro quando o sufixo é igual à string completa.
     */
    public static final String ERRO_PALAVRA_COMPLETA = "não coloque a palavra inteira";

    /**
     * Construtor padrão da classe.
     */
    public StringEndsWith() {
    }

/**
     * Verifica se uma string termina com outro string específico.
     *
     * Esta implementação usa o método nativo endsWith() da classe String para uma
     * verificação eficiente e direta.
     *
     * @param str    A string que será verificada
     * @param ending O sufixo que será procurado no final da string
     * @return true se a string terminar com o sufixo especificado, false caso contrário
     * @see String#endsWith(String)
     */
    public static boolean solution(String str, String ending) {
        Boolean terminaCom = false;
        if (ending.equals(str)) {
            terminaCom = false;
            return terminaCom;
        } else {
            terminaCom = str.endsWith(ending);
            return terminaCom;
        }
    }

    /**
     * Verifica se uma string termina com outro string específico, com tratamento especial
     * para casos onde o sufixo é igual à string completa.
     *
     * Esta implementação usa o método split() para dividir a string e analisar os resultados.
     *
     * @param str    A string que será verificada
     * @param ending O sufixo que será procurado no final da string
     * @return true se a string terminar com o sufixo especificado, false caso contrário
     * @note Se o sufixo for igual à string completa, imprime uma mensagem de erro
     *       definida pela constante ERRO_PALAVRA_COMPLETA
     */
    public static boolean solution2(String str, String ending) {
        Boolean terminaCom = false;
        String strs;
        int tamanhoDaString = str.length();
        int tamanhoConsulta = ending.length();

        if (!ending.equals(str)) {
            strs = str.split(ending).length == 1 ? str.split(ending)[0] : null;
            String[] arr = str.split(ending);
            if (arr.length == 1) {
                terminaCom = str.length() > arr[0].length();
                return terminaCom;
            } else return terminaCom;
        } else {
            System.out.println(ERRO_PALAVRA_COMPLETA);
        }
        return false;
    }

    /**
     * Verifica se uma string termina com outro string específico, com tratamento especial
     * para casos onde o sufixo é igual à string completa.
     *
     * Esta implementação oferece uma versão otimizada que usa lastIndexOf() em vez de split()
     * para melhor performance.
     *
     * @param str    A string que será verificada
     * @param ending O sufixo que será procurado no final da string
     * @return true se a string terminar com o sufixo especificado, false caso contrário
     * @note Se o sufixo for igual à string completa, imprime uma mensagem de erro
     *       definida pela constante ERRO_PALAVRA_COMPLETA
     * @since 1.0
     */
    public static boolean solution2Melhorada(String str, String ending) {
        // Verifica se os parâmetros são nulos
        if (str == null || ending == null) {
            return false;
        }

        // Verifica se o sufixo é igual à string completa
        if (ending.equals(str)) {
            System.out.println("(string = "+str +") e (pesquisada = "+ending +") "+ERRO_PALAVRA_COMPLETA);
            return false;
        }

        //verifica se a substriga pesquisada é maior que a string
        if (str.length() > ending.length()) {
            // Usa lastIndexOf para verificar se a string termina com o sufixo
            return str.lastIndexOf(ending) == str.length() - ending.length();
        }else return false;
    }

    /**
     * Método principal para demonstração das funcionalidades da classe.
     *
     * @param args Argumentos do programa (não utilizados)
     */
    public static void main(String[] args) {
        StringEndsWith s = new StringEndsWith();
        System.out.println(s.solution2Melhorada("abc","abcd"));
    }
}
