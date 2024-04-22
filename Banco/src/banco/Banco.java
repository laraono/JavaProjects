/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author isaon
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente c = new Cliente(new ContaCorrente(502.1),new SeguroDeVida());
       System.out.printf("%f",GerenciadorDeImpostoDeRenda.calculaTributaveis(c));
       
    }
    
}
