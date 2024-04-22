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
public class DVD extends Midia {
    int nFaixas;
    
    DVD(){

    }
    
    DVD(int c, double p, String s, int f){
        super(c,p,s);
        this.setnFaixas(f);
    }
    
    String getTipo(){
    return super.getTipo() + "DVD";
    }
    
    String getDetalhes(){
         return String.format("%s\nNumFaixas:%d\n",super.getDetalhes(), this.getnFaixas());
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
    
    void inserirDados(){
        super.inserirDados();
    Scanner scn = new Scanner(System.in);
        System.out.println("NumFaixas:");
        this.setnFaixas(scn.nextInt());


    };
    
    public int compareTo(DVD dvd){
        int comparacao = super.compareTo(dvd);
        comparacao += this.nFaixas - dvd.nFaixas;
        return comparacao;
    }
    
}
