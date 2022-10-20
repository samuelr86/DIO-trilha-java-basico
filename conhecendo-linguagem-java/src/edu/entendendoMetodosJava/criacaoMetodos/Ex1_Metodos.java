package edu.entendendoMetodosJava.criacaoMetodos;

import java.util.Scanner;

/*
 * Crie uma aplicação que resolva as seguintes situações:
 *  - Calcule as 4 operações básicas. Sempre dois valores devem ser passados. [ok]
 *  - A partir da hora do dia, informe a mensagem adequada. [ ]
 *  - Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. [ ]
 * Defina arbitrariamente as faixas qeu influenciam nos valores.
 */

public class Ex1_Metodos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {

            System.out.println("\nEscolha uma opção para calcular:");
            System.out.println("Opção");
            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("0 - [ sair ]");

            int opcao = leitor.nextInt();

            if (opcao > 0 | opcao < 5) {
                switch (opcao) {
                    case 1:
                        System.out.println("Escolha um número:");
                        int numero1 = leitor.nextInt();
                        System.out.println("Escolha outro número:");
                        int numero2 = leitor.nextInt();
                        System.out.println("");
                        System.out.println(somar(numero1, numero2));
                        break;
                    case 2:
                        System.out.println("Escolha um número:");
                        int numero3 = leitor.nextInt();
                        System.out.println("Escolha outro número:");
                        int numero4 = leitor.nextInt();
                        System.out.println("");
                        System.out.println(subtrair(numero3, numero4));
                        break;
                    case 3:
                        System.out.println("Escolha um número:");
                        int numero5 = leitor.nextInt();
                        System.out.println("Escolha outro número:");
                        int numero6 = leitor.nextInt();
                        System.out.println("");
                        System.out.println(multiplicar(numero5, numero6));
                        break;
                    case 4:
                        System.out.println("Escolha um número:");
                        double numero7 = leitor.nextInt();
                        System.out.println("Escolha outro número:");
                        double numero8 = leitor.nextInt();
                        System.out.println("");
                        System.out.println(dividir(numero7, numero8));
                        break;

                    case 0:
                        System.out.println("\nSaindo da calculadora...");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("\nOpção Inválida.");
                    System.out.println( "");
                        break;
                }
            }
            if (opcao == 0)
                break;

        }

    }

    public static String somar(int numero1, int numero2) {
        String calculo = " <<<< " +numero1 + " + " + numero2 + " = " + (numero1+numero2) + " >>>> ";
        return calculo;
    }

    public static String subtrair(int numero1, int numero2) {
        String calculo =" <<<< " + numero1 + " - " + numero2 + " = " + (numero1-numero2) + " >>>> ";
        return calculo;
    }

    public static String multiplicar(int numero1, int numero2) {
        String calculo = " <<<< " +numero1 + " x " + numero2 + " = " + (numero1*numero2) + " >>>> ";
        return calculo;
    }

    public static String dividir(double numero1, double numero2) {
        String calculo = " <<<< " +numero1 + " : " + numero2 + " = " + String.format("%.4f",(numero1/numero2)) + " >>>> ";
        return calculo;

    }

    public static String saudacao(int hora) {

        if (hora >= 0 && hora <= 11) {
            return "Bom dia!";
        } else if (hora >= 12 && hora < 18) {
            return "Boa tarde!";
        } else if (hora >= 18 && hora <= 23) {
            return "Boa noite!";
        } else {
            return "Hora inválida.";
        }

    }

}
