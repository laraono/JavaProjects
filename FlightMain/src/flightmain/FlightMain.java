/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flightmain;

/**
 *
 * @author isaon
 */
public class FlightMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time t1 = new Time(20,00);
        Time t1_arr = new Time(23,00);
        Flight f1 = new Flight("1","Bali",t1,t1_arr);
        Passenger p1_1 = new Passenger("Lara",19);
        f1.addPassenger(p1_1);
         Passenger p1_2 = new Passenger("Ozzy",30);
        f1.addPassenger(p1_2);
        
        f1.printInfo();
    }
    
}
