/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meucampominado;

import java.util.Scanner;

/**
 *
 * @author isaon
 */
class Campo {
    boolean jogo;
     Tabuleiro tab;
    Campo(){
       tab = new Tabuleiro(this);
        jogo = true;
        this.leRespostas();
    }
    
    void leRespostas(){
        int col, linha;
        while(jogo){
        Scanner scn = new Scanner(System.in);
        System.out.printf("Coluna:");
        col = scn.nextInt();
        System.out.printf("Linha:");
        linha = scn.nextInt();
        this.verificaRespostas(col-1,linha-1);
        if(jogo){
        tab.imprimeTabuleiro();}
                }
    }

    private void verificaRespostas(int col, int linha) {
        if(col > Tabuleiro.WIDTH-1 || col < 0 || linha > Tabuleiro.HEIGHT-1 || linha < 0  ){
        System.out.printf("Inválido\n");
        } else {
        tab.insereSlot(col, linha);
        }
    }
}
