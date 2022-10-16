package edu.aprendendoSintaxe.anatomia;
public class MinhaClasse{

    public static void main(String [] args){

        // ANATOMIA DAS CLASSES - 2

        System.out.print("Olá mundo Java.");

        // variável regular
        int ano = 2022;
        ano = 2023;

        // variável constante em Java
        final String BR = "Brasil"; 

        // nomeação inválida
        //int 1numero = 1;
        //int &numero = 1;
        int aodjfaoid = 1;
                
        // ANATOMIA DE CLASSES - 3

        // declaração de variáveis
        String meuNome = "Samuel";

        int anoFabricacao = 2022;

        boolean verdadeira = true;

        
        
    }

    // declaração de métodos
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(segundoNome);
    }
}
