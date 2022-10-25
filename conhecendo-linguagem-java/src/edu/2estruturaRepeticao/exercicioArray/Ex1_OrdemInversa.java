package edu.estruturaRepeticao.exercicioArray;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Crie um veotr de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor:");
        int tamanhoVetor = leitor.nextInt();
      
        int[] vetor = new int[tamanhoVetor];

        for (int i = tamanhoVetor -1; i >= 0; i--) {
        
            System.out.println("Armazene um elemento:");
            vetor[i]=leitor.nextInt();           
        }
        
        System.out.println(Arrays.toString(vetor));

        
    }

}
