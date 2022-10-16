package edu.aprendendoSintaxe.metodos;



public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    // criar os métodos que mudam esses estados

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public int aumentarVolume(){
        return this.volume++;
    }

    public int diminuirVolume(){
        return this.volume--;
    }

    public int aumentarCanal(){
        return this.canal++;
    }

    public int diminuirCanal(){
        return this.canal--;
    }

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }

}
