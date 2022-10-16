package edu.aprendendoSintaxe.metodos;



public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);
        
        smartTv.ligar();

        System.out.println("Novo status.TV ligada? "+smartTv.ligada);

        System.out.println("Mudar para outro canal");
        smartTv.mudarCanal(7);
        System.out.println("Tv ligada no canal: "+ smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status.TV ligada? "+smartTv.ligada);

        


        

    }
}
