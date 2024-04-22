/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import java.time.LocalDate;

/**
 *
 * @author isaon
 */
public class PessoaFisica extends Pessoas{
    String CPF;
    LocalDate dataNascimento;

    public PessoaFisica(String CPF, LocalDate dataNascimento, String nome, LocalDate dataCadastro) {
        super(nome, dataCadastro);
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }
    
    
}
