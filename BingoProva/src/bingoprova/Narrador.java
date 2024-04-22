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
class Narrador {
    Cartela[] cartelas;
    Boolean bingo = false;
    static final int NUMMAX = 81;
     Integer[] embaralhado;
    void iniciarJogo(){
        embaralhar();
        while(bingo == false){
        sortear();
        }
    }
    
    public void setCartelas(Cartela[] cartelas) {
        this.cartelas = cartelas;
        for(Cartela cartela : cartelas){
            cartela.setNarrador(this);
        }
    }
    public void sortear(){
        for(int i=0; i<NUMMAX && bingo == false;i++){
          for(Cartela cartela : cartelas){
            cartela.receberSorteio(embaralhado[i]);
            }
            }
        }
        
    

    Integer[] criarVetor(){
        Integer[] vetor = new Integer[NUMMAX];
          for(int i=0; i<NUMMAX;i++){
                vetor[i] = i;
        }
          return vetor;
    }
    
    void embaralhar(){
        Integer[] vetor = criarVetor();
         Random rnd = new Random();
         embaralhado = new Integer[NUMMAX];
         for(int i=0; i<NUMMAX;i++){
                int linha = rnd.nextInt(NUMMAX);
                embaralhado[i] = vetor[linha];
            }
        }
    
    
    void bingo(Cartela aThis) {
        System.out.printf("A cartela %d fez BINGO!",aThis.id);
        bingo = true;
    }
}
