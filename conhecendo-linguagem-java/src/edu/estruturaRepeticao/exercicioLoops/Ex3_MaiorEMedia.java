package edu.estruturaRepeticao.exercicioLoops;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * Faça um programa que leia 5 números
 *  e informe o maior número e a 
 * média desses números
 */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int nota;
        int contador = 0;
        int maior = 0;
        int media;
        int soma = 0;

        do{
            System.out.println("Digite um número");

            nota = leitor.nextInt();
            
            soma += nota;

            if(nota > maior) maior = nota;
            
            contador++;   

        }while(contador < 5);

        media = soma / 5;

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);
        


    }
}
