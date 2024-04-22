/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.util.Objects;

/**
 *
 * @author isaon
 */
class Contato {

    String nome;
    int idade;
    float altura;

    Contato(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + this.idade;
        hash = 59 * hash + Float.floatToIntBits(this.altura);
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
        if (!(obj instanceof Contato)) {
             return false;
        } else {
           final Contato other = (Contato) obj;
           if (this.idade != other.idade) {
            return false;
            }
            if (Float.floatToIntBits(this.altura) != Float.floatToIntBits(other.altura)) {
            return false;
            }
           return Objects.equals(this.nome, other.nome);
        }
       
   
    }
    
    
    
}
