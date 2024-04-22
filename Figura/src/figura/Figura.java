package figura;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public abstract class Figura {
    String cor;
    
    void setCor(String cor){
        this.cor = cor;
    }
    
    String getCor()
    {
        return this.cor;
    }
}
