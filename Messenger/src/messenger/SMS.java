/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package messenger;

/**
 *
 * @author isaon
 */
public class SMS extends Message {
    int recipientContactNo;

    public SMS(int recipientContactNo, String text) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public int getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(int recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString() {
        return "SMS{" + "recipientContactNo=" + recipientContactNo + '}' + super.toString();
    }
    
    
}
