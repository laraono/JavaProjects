/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaon
 */
public class Cliente {
    List<Conta> contas;
    SeguroDeVida seguro;
    
    Cliente(Conta conta, SeguroDeVida seg){
        this.contas = new ArrayList<>();
        this.contas.add(conta);
        this.seguro = seg;
    }
     Cliente(Conta conta){
        this.contas = new ArrayList<>();
        this.contas.add(conta);
    }
     
      Cliente(SeguroDeVida seg){
        this.seguro = seg;
    }
}
