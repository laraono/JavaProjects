/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author isaon
 */
public class Conta {
    Double saldo;
    
    Double sacar(Double saque){
     this.saldo = obterSaldo() - saque;
     return this.saldo;
    }
    
    Double depositar(Double depos){
    this.saldo = obterSaldo() + depos;
        return this.saldo;
    }
    
    Double obterSaldo(){
    return this.saldo;
    }
}
