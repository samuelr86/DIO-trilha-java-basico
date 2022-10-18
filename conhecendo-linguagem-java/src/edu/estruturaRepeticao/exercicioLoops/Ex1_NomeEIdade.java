package edu.estruturaRepeticao.exercicioLoops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, 
 * o primeiro representado o nome do aluno e o segundo representando a sua idade
 * (Pare o programa inserindo o valor 0 no campo nome)
 */
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;
        
        while(true) {  
            System.out.println("Digite um nome:");
            nome = leitor.nextLine();
            if(nome.equals("0")) break;

            System.out.println("Digite a idade: ");
            idade = leitor.nextInt();
            leitor.nextLine();
        }
    }
}
