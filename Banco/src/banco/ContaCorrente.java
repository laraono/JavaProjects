/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author isaon
 */
public class ContaCorrente extends Conta implements Tributavel{
    ContaCorrente(Double saldo){
        super.saldo = saldo;
    }
    @Override
    public Double calculaTributos() {
        return super.obterSaldo()*0.01;
    }
    
}
