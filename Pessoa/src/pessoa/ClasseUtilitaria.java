/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaon
 */
public class ClasseUtilitaria {
        static public List<PessoaFisica> filtrarMaioresIdade(List<Pessoas> pessoas) {
        List<PessoaFisica> MaioresIdade = new ArrayList<>();
        for(Pessoas pessoa : pessoas){
            if(pessoa instanceof PessoaFisica ){
                PessoaFisica pessoafis = (PessoaFisica) pessoa;
                if(pessoafis != null){
                    int idade = Period.between(pessoafis.dataNascimento, LocalDate.now()).getYears();
                    if(idade >= 18){
                    MaioresIdade.add(pessoafis);
                }
                }
            }
        }
        return MaioresIdade;
    }
}
