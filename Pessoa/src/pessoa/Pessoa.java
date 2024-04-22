/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaon
 */
public class Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PessoaFisica p1 = new PessoaFisica("1",LocalDate.of(2004,9,20),"Lara",LocalDate.of(2024,4,16));
       PessoaJuridica pj = new PessoaJuridica("1",LocalDate.of(2004,9,20),"Rafa",LocalDate.of(2024,4,16));
       PessoaFisica p2 = new PessoaFisica("1",LocalDate.of(2020,9,20),"Gabi",LocalDate.of(2024,4,16));
       PessoaFisica p3 = new PessoaFisica("1",LocalDate.of(2004,9,20),"Henry",LocalDate.of(2024,4,16));
       List<Pessoas> listapessoas = new ArrayList<>();
       listapessoas.add(p1);
        listapessoas.add(p2);
        listapessoas.add(p3);
         listapessoas.add(pj);
       List<PessoaFisica> maiores = new ArrayList<>();
       maiores =  ClasseUtilitaria.filtrarMaioresIdade(listapessoas);
       for(PessoaFisica maior : maiores){
           System.out.printf("%s",maior.nome);
       }
    }
    
}
