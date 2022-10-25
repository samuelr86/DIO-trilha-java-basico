package edu.estruturaRepeticao.exercicioLoops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros, 
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos: ");
        int conjunto = leitor.nextInt();

        int impares=0;
        int pares=0;
        

        for (int i = 0; i < conjunto; i++) {

            System.out.println("Digite um número: ");
            int numero = leitor.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;

        }

        System.out.println("Quantidade de números pares: " +  pares);
        System.out.println("Quantidade de números ímpares: " +  impares);
        
    }
}
