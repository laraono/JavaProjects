/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package storeconsole;

/**
 *
 * @author isaon
 */
public class StoreConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Product p1 = new Product("TV",4,34000);
       Product p2 = new Product("Bike", 4, 5500);
       Product p3 = new Product("Oven",3,70000);
       
       Store s1 = new Store("Makro","Karachi");
       Store s2 = new Store("Hypermart","Karachi");
       s1.addProduct(p1);
       s1.addProduct(p2);
       s1.addProduct(p3);
       s1.displayAll();
       
       Product tempProduct = s1.deleteProduct("Bike");
       if(tempProduct == null){
       System.out.println("Nothing to delete");
      
       } else {System.out.println("Ok");}
        s1.displayAll();
       s2.addProduct(p1);
       s2.addProduct(p2);
       s2.addProduct(p3);
       s2.displayAll();
       Company c1 = new Company("Unilever");
       c1.addStore(s2);
        c1.addStore(s1);
        c1.displayAll();
        int n = c1.searchNbofStore("TV");
        System.out.println("Nb of stores with TV "+n);
    }
    
}
