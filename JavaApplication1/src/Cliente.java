
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class Cliente {
    private List<Compra> compras = new ArrayList<>();
    
    int obterValorTotal(){
        int valor = 0;
        for(Compra compra : this.compras){
            valor += compra.obterValorTotal();
        }
        return valor;
    }
    
    void adicionarCompra(Compra compra){
        compras.add(compra);
    }
}
