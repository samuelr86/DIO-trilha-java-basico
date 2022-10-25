package edu.estruturaRepeticao.exercicioArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0;

        int contador = 0;
        do {
            System.out.println("Letra: ");
            String letra = leitor.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }else{
                consoantes[contador]=letra.toUpperCase()+" (é vogal) ";
            }

            contador++;

        } while (contador < consoantes.length);

        System.out.println("Vetor de consoantes:" + Arrays.toString(consoantes));

        
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

    }

}
