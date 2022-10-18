package edu.estruturaRepeticao.exercicioArray;

import java.util.Arrays;

/*
 * Faça um programa que leia 20 números inteiro aleatórios (entre 0 e 100)
 * armazene-os em um vetor.
 * Ao final mostre os números e seus sucessores.
 */


public class Ex3_NumerosAleatorios {
    
    public static void main(String[] args) {
        
        int aleatorios; 

        int[] numerosAleatorios = new int[20];

        for (int contador = 0; contador < numerosAleatorios.length; contador++) {
            aleatorios = 1+(int)(Math.random()*100);
            numerosAleatorios[contador] = aleatorios;
        }

        System.out.println("Números Aleatórios:");
        System.out.println(Arrays.toString(numerosAleatorios));
        

        System.out.println("Sucessores:");
        System.out.print("[");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1)+ "  ");
        }
       
        System.out.println("]");

    }
}
