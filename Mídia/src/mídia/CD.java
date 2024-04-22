/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mídia;

import java.util.Scanner;

/**
 *
 * @author isaon
 */
public class CD extends Midia{
    int nMusicas;
    
    CD(){
        
    }
    
    CD(int c, double p, String s, int m){
     super(c,p,s);
     this.setnMusicas(m);
    }
    
    String getTipo(){
    return super.getTipo() + "CD";
    }
    
    String getDetalhes(){
           return String.format("%s\nNumMusica:%d\n",super.getDetalhes(), this.getnMusicas());

    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
    
    void inserirDados(){
        super.inserirDados();
     Scanner scn = new Scanner(System.in);
        System.out.println("NumMusicas:");
        this.setnMusicas(scn.nextInt());

        
    }
    
     public int compareTo(CD cd){
        int comparacao = super.compareTo(cd);
        comparacao += this.nMusicas - cd.nMusicas;
        return comparacao;
    }
    
}
