import java.util.Scanner;


/*
 * Crie uma aplicação que resolva as seguintes situações:
 *  - Calcule as 4 operações básicas. Sempre dois valores devem ser passados. [ok]
 *  - A partir da hora do dia, informe a mensagem adequada. [ok]
 *  - Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. [ ]
 * Defina arbitrariamente as faixas qeu influenciam nos valores.
 */

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a hora");

        int hora = leitor.nextInt();
        Mensagem.obterMsg(hora);


        Calculadora.fazerContas();
    }
}
