/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livros;

import java.time.LocalDate;

/**
 *
 * @author isaon
 */
public class Usuario {
    String nome;
    Tipo tipo;
    LocalDate dataNascimento;

    public Usuario(String nome, Tipo tipo, LocalDate dataNascimento) {
        this.nome = nome;
        this.tipo = tipo; // 1:1 Associação Usuario - Tipo
        this.dataNascimento = dataNascimento;
    }
  public Usuario(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo; // 1:1 Associação Usuario - Tipo
    }
    
}
