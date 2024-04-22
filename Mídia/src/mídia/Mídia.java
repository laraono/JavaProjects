/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mídia;

/**
 *
 * @author isaon
 */
public class Mídia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CD cd1 = new CD();
        CD cd2 = new CD(1,1.0,"CD2",5);
       DVD dvd1 = new DVD(); 
        DVD dvd2 = new DVD(5,5.0,"DVD2",6);
         cd1.printDados();  
        cd2.printDados();
        dvd1.printDados(); 
        dvd2.printDados();
        System.out.printf("CD1 e CD2 %d", cd1.compareTo(cd2));
        System.out.printf("CD2 e CD1 %d", cd2.compareTo(cd1));
        System.out.printf("DVD1 e DVD1 %d", dvd1.compareTo(dvd1));
        System.out.printf("DVD1 e DVD2 %d", dvd1.compareTo(dvd2));
    
    }
    
}
