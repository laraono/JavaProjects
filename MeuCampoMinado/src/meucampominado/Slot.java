/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meucampominado;

/**
 *
 * @author isaon
 */
public class Slot {
    Boolean reveal;
    Character valor;
    Integer vizinho;
    Tabuleiro tab;
    static Integer revelados = 0;
    Slot(Tabuleiro aThis){
    tab = aThis;
    this.reveal = false;
    this.valor = ' ';
    this.vizinho = 0;
    
    }
    
}
