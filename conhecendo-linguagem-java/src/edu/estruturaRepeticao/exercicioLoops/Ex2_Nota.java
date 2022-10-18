package edu.estruturaRepeticao.exercicioLoops;

import java.util.Scanner;

/*
 * Fala um programa que peça uma nota, entre 0 e 10
 * Mostre uma mensagem caso o valor seja inválido e 
 * continue pedindo até o usuário pedir um valor válido
 * 
 */


public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Digite um número entre 0 e 10: ");
            nota = leitor.nextInt();
           
            if(nota >= 0 && nota <= 10) break;
            System.out.println("Nota inválido.");
        }

    }
}
