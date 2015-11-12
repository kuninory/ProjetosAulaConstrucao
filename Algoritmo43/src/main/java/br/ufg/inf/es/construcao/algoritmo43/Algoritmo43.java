package br.ufg.inf.es.construcao.algoritmo43;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class Algoritmo43 {

    /**
     * Executa a permutação dos caracteres de uma String.
     *
     * @param prefixo Primeiro caractere de cada permutação.
     * @param conjunto String que terá seus caracteres permutados.
     * @param resultadoParcial Auxilia a guardar a lista de resultados 
     * da permutação.
     *
     * @return Retorna uma lista com as permutações.
     *
     * @throws IllegalArgumentException Caso o 'conjunto' seja uma string vazia.
     */
    public static List<String> permutacao(String prefixo, String conjunto,
            List<String> resultadoParcial) {
        if (conjunto.length() <= 0) {
            throw new IllegalArgumentException("Tamanho vetor não válido!");
        }

        if (conjunto.length() == 1) {
            resultadoParcial.add(prefixo + conjunto);
            return resultadoParcial;
        } else {
            for (int i = 0; i < conjunto.length(); i++) {
                StringBuilder conjuntoLinha = new StringBuilder(conjunto);
                char cI = conjunto.charAt(i);
                conjuntoLinha.deleteCharAt(i);
                String prefixoLinha = prefixo + cI;
                
                permutacao(prefixoLinha, conjuntoLinha.toString(), resultadoParcial);
            }

            return resultadoParcial;
        }

    }

}
