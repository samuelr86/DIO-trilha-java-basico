package edu.estruturaRepeticao.exercicioArray;

/*
 * Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0 e 9
 */


import java.util.Arrays;
import java.util.Random;

public class Ex4_ArrayMultidimensional {
    
    public static void main(String[] args) {
        
        Random random = new Random();


        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
               matriz[linha][coluna] = random.nextInt(9);
               
            }
           
        }

        System.out.println("Matriz:");

        for (int[] elementoLinha : matriz) {
            for (int elementoColuna : elementoLinha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println(" ");
        }
    }
}
