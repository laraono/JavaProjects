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
public class Company {
    String name;
    List<Store> arrayStore;
    int nbStore;

    public Company(String name) {
        this.name = name;
        this.nbStore = 0;
        this.arrayStore = new ArrayList<>();
    }
    
    void addStore(Store store){
        this.arrayStore.add(store);
        this.nbStore++;
    }
    
    int searchNbofStore(String productName){
        int sum = 0;
    for(Store st : arrayStore){    
            if(st.searchProduct(productName)){
                System.out.printf("%s have\n", st.getName());
                sum++;
            }
        }
    return sum;
    }
    
    void displayAll(){
        for(Store st : arrayStore){
       System.out.printf("Name:%s\n", st.getName());
               }
    }
}
