/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;
import java.util.Scanner;

/**
 *
 * @author isaon
 */
public class Console {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        while(true) {
            Scanner leitor = new Scanner(System.in);
        System.out.printf("""
                          1.Nova Pessoa
                          2.Excluir pessoa
                          3.Buscar Pessoa
                          4.Imprimir Agenda
                          5.Imprimir Pessoa (\u00cdndice)
                          6.Sair""");
        System.out.printf("Sua opção:");
        int opcao = leitor.nextInt();
        switch(opcao){
            case 1 -> agenda.armazenaPessoa();
            case 2 -> agenda.removePessoa();
            case 3 -> agenda.buscaPessoa();
            case 4 -> agenda.imprimeAgenda();
            case 5 -> agenda.imprimePessoa();
            case 6 -> {
                }
            default -> System.out.printf("Opção inválida\n");
        }
         System.out.printf("FIM");
        }

    }
    
}
