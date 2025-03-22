package com.mycompany.simplehash;
import javax.swing.JOptionPane;
public class SimpleHash {
    public static void main(String[] args) {
        // 1. Solicita uma string ao usuário
        String entrada = JOptionPane.showInputDialog(
                null, 
                "Entre com uma String", 
                "Entrada", 
                JOptionPane.QUESTION_MESSAGE
        );
        
        if (entrada == null) {
            System.exit(0);
        }
        
        char[] caracteres = HashText.splitWord(entrada);
        StringBuilder sbCaractere = new StringBuilder();
        for (char c : caracteres) {
            sbCaractere.append(c).append(" ");
        }
        
        JOptionPane.showMessageDialog(
                null, 
                sbCaractere.toString(), 
                "Separação de caracteres da String", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        StringBuilder sbASCII = new StringBuilder();
        for (char c : caracteres) {
            sbASCII.append((int)c).append(" ");
        }
        
        JOptionPane.showMessageDialog(
                null, 
                sbASCII.toString(), 
                "Valores ASCII", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        StringBuilder sbASCIIEncrypted = new StringBuilder();
        for (char c : caracteres) {
            int ascii = (int)c;
            ascii += 10;
            sbASCIIEncrypted.append(ascii).append(" ");
        }
        
        JOptionPane.showMessageDialog(
                null, 
                sbASCIIEncrypted.toString(), 
                "Valores ASCII Criptografados (+10)", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        // Implementação para utilizar o novo método getEncryptedString
        String encryptedString = HashText.getEncryptedString(caracteres);
        
        JOptionPane.showMessageDialog(
                null, 
                encryptedString, 
                "String Criptografada", 
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}