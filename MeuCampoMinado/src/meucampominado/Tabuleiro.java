/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meucampominado;

import java.util.Random;

/**
 *
 * @author isaon
 */
class Tabuleiro {
    
    Slot[][] slots;
    final static int WIDTH = 8;
    final static int HEIGHT = 8;
     final static int NUMBOMBAS = 10;
     Campo campo;
    Tabuleiro(Campo c){
        this.campo = c;
        this.slots = new Slot[WIDTH][HEIGHT];
        Slot.revelados = 0;
        this.iniciarTabuleiro();
        this.iniciarBombas();
        this.imprimeTabuleiro();
    }
   
    private void iniciarTabuleiro(){
    
    this.slots = new Slot[WIDTH][HEIGHT];
    for (int i = 0; i < WIDTH; i++) {
        for (int j = 0; j < HEIGHT; j++) {
            this.slots[i][j] = new Slot(this); // Initialize each Slot object
        }
                
    }

    }
    
   public final void imprimeTabuleiro(){
         System.out.printf("   ");
        for(int i = 0; i<WIDTH; i++){
            System.out.printf(" %d ", i+1);
        }
        System.out.printf("\n");
       
        for(int i = 0; i < WIDTH; i++){
            System.out.printf(" %d ", i+1);
            for(int j = 0; j < HEIGHT; j++){
                if(slots[i][j].reveal == true){
                    System.out.printf(" %c ",slots[i][j].valor);
                }
                else {
                System.out.printf(" _ ");
                }
            }
            System.out.printf("\n");
        }
    }
    void revelaTudo(){
         System.out.printf("   ");
        for(int i = 0; i<WIDTH; i++){
            System.out.printf(" %d ", i+1);
        }
        System.out.printf("\n");
       
        for(int i = 0; i < WIDTH; i++){
            System.out.printf(" %d ", i+1);
            for(int j = 0; j < HEIGHT; j++){
                System.out.printf(" %c ",slots[i][j].valor);
            }
            System.out.printf("\n");
        }
    }
    
    
    private void iniciarBombas(){
    Random rnd = new Random();
    for(int i = 0; i<NUMBOMBAS;i++){
        this.slots[rnd.nextInt(WIDTH)][rnd.nextInt(HEIGHT)].valor = '*';
    }
    iniciarVizinhos();
    }
    
     void iniciarVizinhos(){
         for(int i = 0; i < WIDTH; i++){
         for(int j = 0; j < HEIGHT; j++){
             
             if(this.slots[i][j].valor.equals('*')){
                 for(int m = i-1; (m <=i+1) && (m < HEIGHT); m++){
                     for(int n = j-1; (n <= j+1) && (n < WIDTH); n++){
                         if(m >= 0 && n >= 0 && !(this.slots[m][n].valor.equals('*'))) {
                        this.slots[m][n].vizinho++;
                        this.slots[m][n].valor =  Character.forDigit(this.slots[m][n].vizinho, 10);
                 }
             
             
              }
         }
         }
    }
         }
     }
    
    void insereSlot(int col, int linha){
        if(verificaBomba(col,linha) == true){
            System.out.print("Explodiu!\n");
            revelaTudo();
            campo.jogo = false;
        } else {
          this.revealChainedHints(col,linha);
          
           if(Slot.revelados == ((WIDTH*HEIGHT)-NUMBOMBAS)){
           campo.jogo = false;
           System.out.print("Você ganhou!\n");
           }
           }
        
    }
   void revealChainedHints(int col, int linha) {
    if (slots[col][linha].reveal) {
        return; // Base case: already revealed or bomb
    }
    slots[col][linha].reveal = true; // Reveal the current cell
    Slot.revelados++;
    if (slots[col][linha].vizinho == 0) {
        for (int m = col - 1; m <= col + 1 && m < WIDTH; m++) {
            for (int n = linha - 1; n <= linha + 1 && n < HEIGHT; n++) {
                if (m >= 0 && n >= 0  && !(slots[m][n].valor.equals('*'))) {
                    slots[m][n].reveal = true;
                     Slot.revelados++;
                }
            }
        }
    }
}

    boolean verificaBomba(int col, int linha){
        if(slots[col][linha].valor.equals('*')){
            return true;
        } else {
         return false;
        }
    }
    
    
    
}
