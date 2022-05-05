package Xadrez;

import tabuleiro.Tabuleiro;

public class Partida {

    private static Tabuleiro tabuleiro;

    public Partida(){
        tabuleiro = new Tabuleiro(8,8);
    }

    public static PecaDeXadrez[][]getPecas(){
        PecaDeXadrez[][]mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++){
            for (int j = 0; j < tabuleiro.getColunas(); j++){
                mat [i][j] = (PecaDeXadrez) tabuleiro.peca(i , j);
            }
        }
        return mat;
    }
}
