/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storeconsole;

/**
 *
 * @author isaon
 */
public class Product {
    String name;
    int quantity;
    double price;
    
    Product(String n, int q, double p){
        this.name = n;
        this.quantity = q;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    
    
}
