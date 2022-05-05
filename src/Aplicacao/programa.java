package Aplicacao;

import Xadrez.Partida;


public class programa {

    public static void main(String[] args){

        Partida partida = new Partida();
        UI.printTabuleiro(partida.getPecas());
    }
}
