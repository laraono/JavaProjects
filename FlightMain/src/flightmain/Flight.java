/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightmain;

import java.util.Vector;

/**
 *
 * @author isaon
 */
public class Flight {
    String id;
    String destination;
    Time depart;
    Time arrival;
    Vector<Passenger> passengerList;
    
    Flight(String id, String dest, Time dep, Time arr){
        this.id = id;
        this.destination = dest;
        this.depart = dep;
        this.arrival = arr;
        passengerList = new Vector<>();
    }
    
    void printInfo(){
        System.out.printf("Id:%s\nDest:%s\nDepart:%d:%d\nArrival:%d:%d\nNumPassengers:%d", this.id, this.destination, this.depart.getHour(), this.depart.getMinute(), this.arrival.getHour(), this.arrival.getMinute(),this.passengerList.size());
    
    }
    void addPassenger(Passenger p){
        passengerList.add(p);
    }
}
