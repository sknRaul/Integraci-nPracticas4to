/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author panda
 */
public class ModelArithmetic {
    private double num1;
    private double num2;
    private double res;

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @return the res
     */
    public double getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(double res) {
        this.res = res;
    }
    
    public double plus(){
        res = num1+num2;
        return res;
    }
    
    public double minus(){
        res = num1-num2;
        return res;
    }
    
    public double times(){
        res = num1*num2;
        return res;
    }
    
    public double into(){
        res = num1/num2;
        return res;
    }
    
    public double modulo(){
        res = num1%num2;
        return res;
    }
    
}
