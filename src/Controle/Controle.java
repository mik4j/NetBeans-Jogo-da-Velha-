/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Model.Tabuleiro;
/**
 *
 * @author Micheli Fernandes dos Santos
 */
public class Controle {
    public static int VAZIO =0;
    public static int XIS =1;
    public static int BOLA =2;
    private Tabuleiro T;
    private static int J;
    
    public Controle() {
        J = XIS;
        T = new Tabuleiro();
    }
    
    public int jogar(int x, int y) {
        int JAnt = VAZIO;
        if (T.Joga(x, y, J)==true) {
            JAnt = J;
            if (J == XIS) {
                J = BOLA;
            } else if (J == BOLA) {
                J = XIS;
            }
        }
        return JAnt;
    }
    
    public int quemGanhou() {
        int cont;
        for (cont = 0; cont <= 2; cont++) {
            if (T.getPosicaoTabuleiro(cont, 0) == T.getPosicaoTabuleiro(cont, 1) && T.getPosicaoTabuleiro(cont, 0) == T.getPosicaoTabuleiro(cont, 2)) {

                return T.getPosicaoTabuleiro(cont, 0);
            }

            if (T.getPosicaoTabuleiro(0, cont) == T.getPosicaoTabuleiro(1, cont) && T.getPosicaoTabuleiro(0, cont) == T.getPosicaoTabuleiro(2, cont)) {

                return T.getPosicaoTabuleiro(0, cont);
            }
        }
        if (T.getPosicaoTabuleiro(0, 0) == T.getPosicaoTabuleiro(1, 1) && T.getPosicaoTabuleiro(0, 0) == T.getPosicaoTabuleiro(2, 2)) {

            return T.getPosicaoTabuleiro(0, 0);
        }

        if (T.getPosicaoTabuleiro(2, 0) == T.getPosicaoTabuleiro(1, 1) && T.getPosicaoTabuleiro(2, 0) == T.getPosicaoTabuleiro(0, 2)) {

            return T.getPosicaoTabuleiro(2, 0);
        }
        return VAZIO;
    }
    
    public boolean acabouOjogo(){
        int cont1;
        int cont2;
        int cont3=0;
        for (cont1=0; cont1<=2; cont1++){
            for (cont2=0; cont2<=2; cont2++){
               cont3=cont3+ T.getPosicaoTabuleiro(cont1, cont2);
            }
                }
        return (cont3==13);
}

    public void zerar(){
        T.zerar();
        J=XIS;
    }    
};