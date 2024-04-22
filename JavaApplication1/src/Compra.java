
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
public class Compra {
  private List<Item> itens = new ArrayList<>();
    int obterValorTotal() {
        int valor = 0;
        for(Item item : this.itens) {
            valor += item.obterValorTotal();
        }
        return valor;
    }
    
    void adicionarItem(Item item){
        itens.add(item);
    }
}
