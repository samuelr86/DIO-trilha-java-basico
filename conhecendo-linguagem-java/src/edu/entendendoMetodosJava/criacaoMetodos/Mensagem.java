public class Mensagem {
    public static void obterMsg(int hora) {
        switch (hora) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                msgBomdia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                msgBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                msgBoaNoite();
                break;
            default:
                break;
        }
    }

    private static void msgBoaNoite() {
        System.out.println("Boa Noite");
    }

    private static void msgBoaTarde() {
        System.out.println("Boa Tarde");
    }

    private static void msgBomdia() {
        System.out.println("Bom dia");
    }
}
