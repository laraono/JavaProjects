/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CampoMinado;

import javax.swing.JButton;

/**
 *
 * @author isaon
 */
public class casas extends JButton{
    int x;
    int y;
    Boolean bomba;
    int vizinhos;

    public casas(int x, int y, Boolean bomba) {
        this.x = x;
        this.y = y;
        this.bomba = bomba;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Boolean getBomba() {
        return bomba;
    }

    public void setBomba(Boolean bomba) {
        this.bomba = bomba;
    }

    public int getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(int vizinhos) {
        this.vizinhos = vizinhos;
    }
    
}
