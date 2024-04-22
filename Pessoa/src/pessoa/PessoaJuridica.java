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
public class PessoaJuridica extends Pessoas{
    String CNPJ;
    LocalDate dataFundacao;

    public PessoaJuridica(String CNPJ, LocalDate dataFundacao, String nome, LocalDate dataCadastro) {
        super(nome, dataCadastro);
        this.CNPJ = CNPJ;
        this.dataFundacao = dataFundacao;
    }
    
}
