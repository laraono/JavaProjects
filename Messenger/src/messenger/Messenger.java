/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package messenger;

/**
 *
 * @author isaon
 */
public class Messenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Email e = new Email("Lara","Luiz","Oi","Oi tudo bem?");
        SMS s = new SMS(9887526,"Oii");
       // System.out.print(Messenger.ContainsKeyword(s, "Oi"));
       // System.out.print(Messenger.ContainsKeyword(e, "Oi"));
        System.out.print(Message.encrypt(s.text,1));
        System.out.print(Message.decrypt(Message.encrypt(s.text,1),1));
        System.out.print(Message.encrypt(e.text,1));
        System.out.print(Message.decrypt(Message.encrypt(e.text,1),1));
    }
    
    public static boolean ContainsKeyword(Message messageObject, String keyword){
        if(messageObject.toString().indexOf(keyword,0) >= 0){
        return true;
        }
        return false;
    }
    
}
