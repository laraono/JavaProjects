package figura;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class Retangulo extends Figura implements Shape, Resizable {
    double lado1;
    double lado2;
    
    Retangulo(double lado1, double lado2, String cor){
        this.lado1 = lado1;
        this.lado2 = lado2;
        super.setCor(cor);
    }
    
    double area(){
        return this.lado1*this.lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double getArea(double lado1, double lado2) {
        setLado1(lado1);
        setLado2(lado2);
        return area();
    }

    @Override
    public void resizeWidth(double width) {
        setLado1(width);

    }

    @Override
    public void resizeHeight(double height) {
         setLado2(height);
    }
    
    
}
