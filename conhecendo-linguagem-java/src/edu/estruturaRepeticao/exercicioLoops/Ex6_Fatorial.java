package edu.estruturaRepeticao.exercicioLoops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um 
 * número inteiro fornecido pelo usuário.
 */

public class Ex6_Fatorial {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Calculo do fatorial de : ");

        int fatorial = leitor.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;
        
        }

        System.out.println(" O Fatorial de "+fatorial+"! é "+ multiplicacao);

    }
}
