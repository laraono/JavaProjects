/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mídia;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author isaon
 */
public class Midia implements Comparable<Midia> {
    int codigo;
    double preco;
    String nome;
    
    Midia(){
        this.inserirDados();
    }
    
    Midia(int c, double p, String n){
        this.setCodigo(c);
        this.setPreco(p);
        this.setNome(n);
    }
    
    String getTipo(){
        return "Midia:";
    }
    
    String getDetalhes(){
        return String.format("Cod:%d\nPreco:%f\nNome:%s",this.getCodigo(), this.getPreco(),this.getNome());
    }
    void printDados(){
        System.out.printf("%s\n%s\n",this.getTipo(),this.getDetalhes());
    }
    
    void inserirDados(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nome:\n");
        this.setNome(scn.nextLine());
        System.out.println("Cod:\n");
        this.setCodigo(scn.nextInt());
        System.out.println("Preco:\n");
        this.setPreco(scn.nextDouble());

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   @Override
    public int compareTo(Midia midia) {
        if(midia == null) {return 1;}
        int comparacao = this.nome.compareTo(midia.nome);
        double diferenca = this.preco - midia.preco;
        if(diferenca < 0) {
        
        comparacao += Math.floor(diferenca);}
        else if(diferenca > 0){
        comparacao += Math.ceil(diferenca);
        }
        comparacao += this.codigo - midia.codigo;
        
        return comparacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Midia)) {
            return false;
        }
        final Midia other = (Midia) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

  
    
 
    
}
