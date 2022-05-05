package Xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

import java.awt.*;

public class PecaDeXadrez extends Peca {

    private Color color;

    public PecaDeXadrez(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }



}

