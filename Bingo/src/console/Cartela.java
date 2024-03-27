package console;

import java.util.ArrayList;
import java.util.Collections;

class Cartela {

    private Narrador narra;
    public int id;
    public int pontos;
    public int[] cartela;
    public Cartela(int id, int max) {
        this.id = id;
        this.pontos = 0;
        this.cartela = new int[25];
        criarCartela(max);
    }
    
    void criarCartela(int numMax) {
        ArrayList<Integer> valores = new ArrayList<>();
        for(int i=0; i<numMax;i++) valores.add(i);
        Collections.shuffle(valores);
        for(int i=0;i<25;i++){
            this.cartela[i] = valores.get(i);
        }
        
    }
    void setNarra(Narrador narrador) {
        narra = narrador;
    }
     void recebeSorteio(int sorteado) {
       for(int i=0; i<25;i++){
           if(cartela[i] == sorteado){
               this.pontos++;
               break;
           }
       }
    }
     
     void verificaBingo(){
          if (this.pontos == 25) {
                    narra.bingo = 1;
                    narra.bingo(this.id);
                }
     }
    
}
