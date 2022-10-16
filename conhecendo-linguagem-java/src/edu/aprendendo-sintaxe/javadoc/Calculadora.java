package edu.samuel.javadoc;

// PRIMEIRO EXEMPLO DE TAGS 

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos
 * 
 * @author Samuel
 * @version 1.0
 * @since 16/10/2022
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números interios
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números
     */

    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    // TIPOS DE COMENTÁRIO

    // este tipo é o one line

    /*
     * quando a apenas um asterisco no início indica
     * um comentário 'mult line'
     *
     */

    /**
     * os dois asterisco iniciais indicam que esse tipo de
     * comentário é do tipo 'documentation'
     */
}
