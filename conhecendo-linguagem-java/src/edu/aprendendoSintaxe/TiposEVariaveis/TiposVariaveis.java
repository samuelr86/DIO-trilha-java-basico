package edu.aprendendoSintaxe.TiposEVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2022;
        int cep = 21070333;
        long cpf = 98765431209L;
        float PI = 3.14F;
        double salario = 1275.33;

        // Java é uma linguagem fortemente tipada

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal;
        
        /* ESSA LINHA NAO VAI COMPILAR PQ  O NÚMERO 1 MUDOU DE TIPO
        IMPORTANTE LEMBRAR QUE SEMPRE PODE CONVERTER PARA UM TIPO HIERARQUICAMENTE MAIOR, PORÉM O INVERSO NÃO OCORRE SEM PERDA DE PRECISÃO. 
        A ISSO DAMOS O NOME DE 'CASTING'
        */

        short numeroCurto2 = (short) numeroNormal;

        // VARIÁVEIS E CONSTANTES

        int numero = 5;
        numero = 10;

        final int CONST = 10;
        // CONST = 5; não compila pois constantes são imutáveis

        

    }
}
