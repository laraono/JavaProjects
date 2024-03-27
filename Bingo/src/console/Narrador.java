package console;

import java.util.ArrayList;
import java.util.Random;

class Narrador {

    int bingo;
    int bolas;
    Cartela[] cartelas;
    public Narrador(Cartela[] jog) {
        this.cartelas = new Cartela[jog.length];
        setCartelas(jog);
        this.bingo = 0;
        this.bolas = 0;
    }

    void setCartelas(Cartela[] jog){
         this.cartelas = jog;
           for (Cartela cartela : cartelas) {
            cartela.setNarra(this);
        }
    }
    void jogar(int numMax) {
        setBolas(numMax);
        
    }
    
    void bingo(int vence){
        System.out.printf("O jogador %d fez BINGO após %d bolas!",vence,this.bolas);
    }
  void setBolas(int numMax) {
        ArrayList<Integer> valores = new ArrayList<>();
        for (int i = 0; i < numMax; i++) {
            valores.add(i);
        }
        while (!valores.isEmpty() && bingo == 0) {
            sortear(valores);
            this.bolas++;
            for (Cartela cartela : cartelas) {
               cartela.verificaBingo(); 
             }
   
        }
    }

    void sortear(ArrayList<Integer> valores) {
        Random sorteio = new Random();
        int sorteado;
        
            sorteado = valores.get(sorteio.nextInt(valores.size()));
       
        for (Cartela cartela : cartelas) {
            cartela.recebeSorteio(sorteado);
        }
        valores.remove(Integer.valueOf(sorteado));
    }
}

    

