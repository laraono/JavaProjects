/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storeconsole;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaon
 */
public class Store {
    String name;
    String location;
    List<Product> productList;
    int nbProduct;
    
    Store(String n, String l){
        this.nbProduct = 0;
        this.name = n;
        this.location = l;
        productList = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }
    
    void addProduct(Product p){
     this.productList.add(p);
     this.nbProduct++;
    }
    
    boolean searchProduct(String productName){
        for(Product prod : this.productList){
            if(prod.name.equals(productName)){
                return true;
            }
        }
        return false;
    }
    
    Product deleteProduct(String productName){
        for(Product prod : this.productList){
            if(prod.name.equals(productName)){
                this.productList.remove(prod);
                this.nbProduct--;
                return prod;
            }
        }
        return null;
    }
    
    void displayAll(){
          for(Product prod : this.productList){
           System.out.printf("Name:%s\n", prod.getName());
        }
    }
}
