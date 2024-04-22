/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package messenger;

/**
 *
 * @author isaon
 */
public class Email extends Message{
    String sender;
    String receiver;
    String subject;

    public Email(String sender, String receiver, String subject, String text) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        
    }

    @Override
    public String toString() {
        return "Email{" + "sender=" + sender + ", receiver=" + receiver + ", subject=" + subject + '}'+super.toString();
    }
    
    
}
