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
public class Livro {
    String titulo;
    String autor;
    Editora editora;
   LocalDate anoPub;
   int ISBN;
    Emprestimo emprestador;

    public Livro(String titulo, String autor, Editora editora, LocalDate anoPub, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora; //1:M composição Editora-Livro
        editora.addLivro(this);
        this.anoPub = anoPub;
        this.ISBN = ISBN;
    }
   
    public void setEmprestimo(Emprestimo emp){
        this.emprestador = emp; // 1:1..M composição Livro-Editora
    }
}
