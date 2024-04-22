/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author isaon
 */
public class GerenciadorDeImpostoDeRenda {
    
    static Double calculaTributaveis(Cliente cliente){
        Double soma = 0.0;
        for(Conta conta : cliente.contas){
            if(conta instanceof ContaCorrente){
            soma += ((ContaCorrente) conta).calculaTributos();
            }
        }
        if(cliente.seguro != null){
            soma += cliente.seguro.calculaTributos();
        }
        return soma;
    }
     
}
