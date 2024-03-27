package console;

import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int numMax = 75;
        int jogadores = 0;
        Scanner obj = new Scanner(System.in);
        do{
        System.out.printf("Quantas pessoas?");
        jogadores = obj.nextInt();
        }while(jogadores<1 || jogadores>10);
        
        Cartela[] jog = new Cartela[jogadores];
        
        for(int i=0; i<jogadores;i++){
           jog[i] = new Cartela(i,numMax);
        }
        Narrador narra = new Narrador(jog);
        narra.jogar(numMax);
    }

  
    
    
}
