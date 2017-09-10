/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author Micheli Fernandes dos Santos
 */
public class Tabuleiro {
    private int [][] tabuleiro = new int [3][3];
    int posicao;
    public Tabuleiro(){
};

    public boolean Joga(int x,int y, int J){
        if (tabuleiro [x][y] == 0){
            tabuleiro [x][y] = J;
            return true;
                    }
        return false;            
        }
    
    public int getPosicaoTabuleiro(int x, int y){
        return tabuleiro[x][y];              
    }
    
    public int zerar(){
        int cont1;
        int cont2;
        for (cont1=0; cont1<=2; cont1++){
            for (cont2=0; cont2<=2; cont2++){
               tabuleiro[cont1][cont2]=0;
            }
                }
       return 0;
            }    
    }