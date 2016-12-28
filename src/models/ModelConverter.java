/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author utt
 */
public class ModelConverter {
    private int number;
    private String resultado = "";

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void binary(){
        resultado = "";
        int residuo = 0;
        int cociente = 0;
        do{
            cociente = number/2;
            residuo = number%2;
            setResultado(""+residuo + getResultado());
            number = cociente;
        }while(cociente > 0);
    }
    
    public void hex(){
        resultado = "";
        resultado = Integer.toHexString(number);
    }
    
    public void octal(){
        resultado = "";
        resultado = Integer.toOctalString(number);
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
