/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogocampominado;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author isaon
 */
public class Casas extends JButton {
    int posX, posY, vizinhos = 0;
    Boolean bombas, revelado =false;

    public Casas(int posX, int posY, Boolean bombas) {
        this.posX = posX;
        this.posY = posY;
        this.bombas = bombas;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(int vizinhos) {
        this.vizinhos = vizinhos;
    }

    public Boolean getBombas() {
        return bombas;
    }

    public void setBombas(Boolean bombas) {
        this.bombas = bombas;
    }
    
    public void revelaCasa(){
            if(this.vizinhos > 0){
               this.setText(Integer.toString(this.vizinhos));
            }
            switch(this.vizinhos){
                    case 1:this.setForeground(Color.cyan);break;
                    case 2:this.setForeground(Color.YELLOW);break;
                    case 3:this.setForeground(Color.GREEN);break;
                    case 4:this.setForeground(Color.red);break;
                    case 5:this.setForeground(Color.BLUE);break;
                    case 6:this.setForeground(Color.MAGENTA);break;
                    case 7:this.setForeground(Color.white);break;
                    case 8:this.setForeground(Color.ORANGE);break;
                    case 9:this.setForeground(Color.gray);break;
            }
            if(!this.bombas){
            this.setBackground(Color.black);
            }else {
            this.setBackground(Color.red);
            }
            revelado = true;
    }
    
}
