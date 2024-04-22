/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class ClienteTeste {
       public static void main(String args[]) {
        Cliente c = new Cliente();
        Produtos manga = new Produtos(100,"manga");
        Compra compra1 = new Compra();
         Compra compra2 = new Compra();
        compra1.adicionarItem(new Item(1,manga));
        compra2.adicionarItem(new Item(1,manga));
        c.adicionarCompra(compra1);
        c.adicionarCompra(compra2);
        System.out.printf("%d",c.obterValorTotal());
        int a = 10>5 ? 100 : 200;
        System.out.println(a);
            System.out.println(a);
                System.out.println(a);
    }
    
}
