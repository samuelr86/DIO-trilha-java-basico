package edu.entendendoMetodosJava.retornos;

import java.util.Scanner;

public class Retornos {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a area de um quadrado?");
        System.out.println("Informe o lado:");
        double lado = leitor.nextDouble();

        area(lado);

        
        System.out.println("Qual a area de um retangulo?");
        System.out.println("Informe a base:");
        double base = leitor.nextDouble();
        System.out.println("Informe a altura:");
        double altura = leitor.nextDouble();


        area(base, altura);




    }

    public static double area(double lado){
        return lado * lado;
        
    }
    
    public static double area(double base, double altura){
        return base * altura;
        
    }


    public static double area(double base, double baseMenor, double altura){
        return ((base+baseMenor) * altura)/2;
        
    }
}
