package com.ciphers.cipher.ceasar;

public class Ceasar {

    public static String cipherCeasar(int key, String text){
        if(text == null || text.isEmpty()){
            throw new IllegalArgumentException("O texto não pode esta vazio");
        }

        StringBuilder textEncrypted = new StringBuilder();
        int textSize = text.length();

        if (key <= 26){
            
            for (int i = 0; i < textSize; i++){
                int charEncrypted = ( text.charAt(i)) + key;
                if (text.charAt(i) >= 97 && text.charAt(i) <=122){
                    charEncrypted =(char) ((text.charAt(i) - 97 + key) % 26 + 97);
                }
                
                
                textEncrypted.append((char) charEncrypted);
            }
            
        }
        
        return textEncrypted.toString();
    }
}
