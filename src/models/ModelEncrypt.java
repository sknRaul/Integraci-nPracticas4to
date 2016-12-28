/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import sun.security.util.Length;

/**
 *
 * @author panda
 */
public class ModelEncrypt {
    private String message;

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void encryption(){
        String word = getMessage();
        setMessage("");
        for (int i = 0; i < word.length(); i++) {
            int code = (int)word.charAt(i);
            code = (code*2)-22;
            setMessage(getMessage()+""+(char)code);
        }
    }
    
    public void decode(){
        String word = getMessage();
        setMessage("");
        for (int i = 0; i < word.length(); i++) {
            int code = (int)word.charAt(i);
            code = (code+22)/2;
            setMessage(getMessage()+""+(char)code);
        }
    }
}

