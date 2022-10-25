import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a hora");

        int hora = leitor.nextInt();
        Mensagem.obterMsg(hora);


        Calculadora.fazerContas();
    }
}
