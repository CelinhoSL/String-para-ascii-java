package com.mycompany.simplehash;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celinho
 */
public class HashText {
    
    public static char[] splitWord(String word){
        if (word == null || word.isEmpty()){
            return new char[0];
        }
        return word.toCharArray();
    }
    
     
    public static void showLetters(char[] caracters){
        for (char c: caracters){
            System.out.println(c);
        }
    }
    
    public static void showASCII (char[] caracters){
       for (char c : caracters){
           int ascii = (int)c;
           
           
           System.out.println(ascii);
                   
       }
    }
    
    public static void showASCIIEncrypted (char[] caracters){
       for (char c : caracters){
           int ascii = (int)c;
           
           ascii += 10;
           
           System.out.println(ascii);
                   
       }
    }
    
    public static String getEncryptedString(char[] caracters) {
    StringBuilder sb = new StringBuilder();
    for (char c : caracters) {
        int ascii = (int) c;
        ascii += 10;
        sb.append((char) ascii); 
    }
    return sb.toString();
}

    
}
