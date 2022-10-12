package edu.samuel.aprendendoSintaxeJava;

public class BoletimEstudantil {
    public static void main(String[] args) {

        // ANATOMIA DE CLASSES - 4 

        // SEM IDENTAÇÃO

        /* 
        int mediaFinal=6;
        if(mediaFinal<6)
        System.out.println("Reprovado");
        else if(mediaFinal==6)
        System.out.println("Prova m,Minerva");
        else 
        System.out.println("Aprovado");
         */

        // COM IDENTAÇÃO
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova m,Minerva");
        else
            System.out.println("Aprovado");
    }
}
