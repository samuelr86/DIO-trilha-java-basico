

import java.util.Date;

public class Operadores{
    public static void main(String[] args) {
        

        // USO DO OPERADOR DE ATRIBUIÇÃO

        String nome = "Samuel";
        nome = "Samuel Razz";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();

        // OPERADORES ARITMÉTICOS

        double soma = 10.5 + 15.7;
        int subtracao = 113-25;
        int multiplicacao = 20*7;
        double divisao = 15/2;
        int modulo = 18%3;

        // concatenação
        String name = "John" + "Wick";

        // UNÁRIO

        int numero = 5; // positivo
        numero = -numero; // ele mesmo negativo

        numero = numero * -1; //volta ser positivo

        //incremento
        numero++; //5+1= 6

        //decremento
        numero--; //6-1= 5

        doadorOrgao = !doadorOrgao; // contrário true, ou false.

        // TERNÁRIO

        int a = 5;
        int b = 6;

        if (a == b){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        /*Pode ser escrito assim: */

        boolean resultado = (a == b)?true:false;

        // RELACIONAIS

        int numero1 = 2;
        int numero2 = 5;

        boolean simNao = numero1 == numero2; //igual
        simNao = numero1 != numero2; //diferente
        simNao = numero1 >= numero2; // maior ou igual a
        simNao = numero1 <= numero2; // menor ou igual a
        simNao = numero1 > numero2; // maior
        simNao = numero1 < numero2; // menor

        // LÓGICOS

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas sao verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma das duas é verdadeira");
        }

        condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Uma delas é falsa, estão essa relação é falsa.");
        }

        if (condicao1 || condicao2) {
            System.out.println(" Uma das condiçoes é falsa");
        }






    }
}