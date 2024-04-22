/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  /**
 *
 * @author isaon
 */
public class Agenda {
    List<Contato> contatos;

    public Agenda(){
     this.contatos = new ArrayList<>();
   
    }
    /**
     * @param args the command line arguments
     */
    
    
    void armazenaPessoa(){
        if(this.contatos.size() < 10){
     Scanner leitor = new Scanner(System.in);
         System.out.printf("Nome:");
        String nome = leitor.nextLine();
        System.out.printf("Idade:");
        int idade = leitor.nextInt();
        System.out.printf("Altura:");
         float altura = leitor.nextFloat();
         contatos.add(new Contato(nome,idade,altura));
         System.out.printf("FIM");

        }
       
    }
    void imprimeContato(Contato pessoa){
           System.out.printf("""
                           Nome: %s\n
                           Idade: %d\n
                           Altura: %f\n
                           """,pessoa.getNome(),pessoa.getIdade(),pessoa.getAltura());
    }
    
    void removePessoa(){
        Scanner leitor = new Scanner(System.in);
         System.out.printf("Nome:");
         String nome = leitor.nextLine();
         this.contatos.removeIf(obj -> obj.getNome().equals(nome));
    }
    
    void buscaPessoa(){
        Scanner leitor = new Scanner(System.in);
        int index = 0;
         System.out.printf("Nome:");
         String nome = leitor.nextLine();
         for(Contato pessoa : this.contatos){
             if(pessoa.getNome().equals(nome)){
              this.imprimeContato(pessoa);
             index++;
        }
    
    }
    }
    
    void imprimeAgenda(){
        for(Contato pessoa : this.contatos){
               this.imprimeContato(pessoa);
        }
    }
    
    void imprimePessoa(){
         Scanner leitor = new Scanner(System.in);
         System.out.printf("Indice:");
         int index = leitor.nextInt();
         Contato pessoa = this.contatos.get(index);
        this.imprimeContato(pessoa);
    }

    
}
