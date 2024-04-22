/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaon
 */
public class Emprestimo {
    LocalDate dataEmp;
    LocalDate dataDev;
    Usuario usuario;
    List<Livro> livros;

    public Emprestimo(LocalDate dataEmp, LocalDate dataDev, Usuario usuario, List<Livro> livros) {
         if(!livros.isEmpty()){
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
        this.usuario = usuario; // 1:M composição, precisa de 1 usuario
        for(Livro livro : livros){
              this.livros.add(livro); // 1:1..M composição, precisa de ao menos 1 livro
        }        
         }
    }
 
}
