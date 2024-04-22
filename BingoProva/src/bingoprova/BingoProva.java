/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingoprova;

import java.util.Scanner;

/**
 *
 * @author isaon
 */
public class BingoProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numJogadores;
        do {
       System.out.printf("Número de jogadores:\n");
       numJogadores = scn.nextInt();
        } while(numJogadores < 1 || numJogadores > 10);
        Cartela[] cartelas = new Cartela[numJogadores];
        for(int i=0;i < numJogadores;i++){
            cartelas[i] = new Cartela(i);
        }
        Narrador narra = new Narrador();
        narra.setCartelas(cartelas);
        narra.iniciarJogo();
    }
    
}
