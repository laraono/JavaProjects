/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaon
 */
class Editora {
    String nome;
    String cidade;
    String país;
    List<Livro> livros;
    public Editora(String nome, String cidade, String país) {
        this.nome = nome;
        this.cidade = cidade;
        this.país = país;
        this.livros = new ArrayList<>(); 
    }
    public void addLivro(Livro livro){
        this.livros.add(livro); // 1:M composição, o livro precisa de ao menos 1 editora
    }
    
}
