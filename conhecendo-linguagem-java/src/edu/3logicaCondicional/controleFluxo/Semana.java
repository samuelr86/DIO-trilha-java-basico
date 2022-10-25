import java.util.Scanner;



public class Semana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número da semana: ");
        int dia = sc.nextInt();

        diaSemana(dia);
  
        sc.close();
    }

    private static void diaSemana(int dia){
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

        }
        if (dia == 1 || dia == 2 || dia == 3) {
            System.out.println("Certo");
        } else if (dia == 4) {
            System.out.println("Errado");
        } else if (dia == 5) {
            System.out.println("Talvez");
        } else {
            System.out.println("Valor indefinido");
        }
    }
}
