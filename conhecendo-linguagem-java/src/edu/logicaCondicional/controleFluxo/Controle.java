import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um mês: ");
        int mes = sc.nextInt();

        mesAno(mes);

        sc.close();
    }

    private static void mesAno(int mes){
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;

            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Maio");
                break;

            case 6:
                System.out.println("Junho");
                break;

            case 7:
                System.out.println("Julho");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Setembro");
                break;

            case 10:
                System.out.println("Outubro");
                break;

            case 11:
                System.out.println("Novembro");
                break;

            case 12:
                System.out.println("Dezembro");
                break;
        }
        if(mes == 1 || mes==7 || mes ==12){
            System.out.println("Férias");
        }
    }
}
