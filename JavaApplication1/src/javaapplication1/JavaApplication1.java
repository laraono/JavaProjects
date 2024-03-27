/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author isaon
 */
public class JavaApplication1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.printf("Número \n");
        int num = myObj.nextInt();
      System.out.printf("Este número é %s\n", num % 2 == 0 ? "par" : "impar");
    }
    

