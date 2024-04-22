/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bingoprova;

import java.util.Random;

/**
 *
 * @author isaon
 */
class Cartela {
    int id;
    Narrador narra;
    Integer[][] valores;
    static final int LINHAS = 8;
    Integer preenchimento;
    public Cartela(int id) {
        this.id = id;
        criarCartela();
        this.preenchimento = 0;
    }
    
    Integer[][] criarVetor(){
        Integer[][] vetor = new Integer[LINHAS][LINHAS];
          for(int i=0; i<LINHAS;i++){
            for(int j=0; j<LINHAS;j++){
                vetor[i][j] = i+i*j;
            }
        }
          return vetor;
    }
    
    void criarCartela(){
        Integer[][] vetor = criarVetor();
         Random rnd = new Random();
          valores = new Integer[LINHAS][LINHAS];
         for(int i=0; i<LINHAS;i++){
            for(int j=0; j<LINHAS;j++){
                int col = rnd.nextInt(LINHAS);
                int linha = rnd.nextInt(LINHAS);
               valores[i][j] = vetor[col][linha];
            }
        }
    }
 
    
    void receberSorteio(int numSorteado) {
        for(Integer[] valor_i : valores){
             for(Integer valor_i_j : valor_i){
                 if(valor_i_j.equals(numSorteado)){
                     preenchimento++;
                     break;
                 }
             }
        }
        verificaVence();
    }

    void setNarrador(Narrador aThis) {
        this.narra = aThis;
    }

    private void verificaVence() {
        if(preenchimento == (LINHAS*LINHAS)){
            narra.bingo(this);
        }
    }
    
}
