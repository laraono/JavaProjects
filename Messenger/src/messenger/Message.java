/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package messenger;

/**
 *
 * @author isaon
 */
public class Message {
    String text;

    @Override
    public String toString() {
        return "Message{" + "text=" + text + '}';
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message(String text) {
        this.text = text;
    }
    
  
 

    public static String encrypt(String plainText, int shiftKey) {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String cipherText = "";
    for (int i = 0; i < plainText.length(); i++) {
        char ch = plainText.charAt(i);
        if (Character.isLetter(ch)) {
            int charPosition = ALPHABET.indexOf(ch);
            int keyVal = (shiftKey + charPosition) % 26;

            // Maintain case sensitivity
            char replaceVal;
            if (Character.isUpperCase(ch)) {
                replaceVal = ALPHABET.charAt(keyVal + 26);  // Use uppercase alphabet for replacement
            } else {
                replaceVal = ALPHABET.charAt(keyVal);
            }
            cipherText += replaceVal;
        } else {
            cipherText += ch;  // Keep non-letters as is
        }
    }
    return cipherText;
}


public static String decrypt(String cipherText, int shiftKey) {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String plainText = "";
    for (int i = 0; i < cipherText.length(); i++) {
        char ch = cipherText.charAt(i);
        if (Character.isLetter(ch)) {
            int charPosition = ALPHABET.indexOf(ch);
            int keyVal = (charPosition - shiftKey) % 26;  // Adjust for decryption

            // Maintain case sensitivity
            char replaceVal;
            if (Character.isUpperCase(ch)) {
                replaceVal = ALPHABET.charAt(keyVal + 26);
            } else {
                replaceVal = ALPHABET.charAt(keyVal);
            }
            plainText += replaceVal;
        } else {
            plainText += ch;  // Keep non-letters as is
        }
    }
    return plainText;
}

   
}
