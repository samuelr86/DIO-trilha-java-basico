package edu.estruturaRepeticao.exercicioLoops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, 
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10
 * O usuário deve informar qual número ele deseja ver a tabuada.
 * 
 */

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma tabuada:");
        int numero = leitor.nextInt();

        System.out.println("Tabuada de " + numero);

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + numero * i);

        }

    }
}
