/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import models.ModelIMC;
import views.ViewIMC;

/**
 *
 * @author DRAGKOZ modeificado por Raúl Prior
 */
public class ControlIMC implements ActionListener, FocusListener{
    private ModelIMC model;
    private ViewIMC view;
    DecimalFormat d = new DecimalFormat("##.##");
    
    public ControlIMC (ModelIMC model, ViewIMC view){
        this.model = model;
        this.view = view;
        
        this.view.JBtn_IMC.addActionListener(this);
        this.view.JTF_Height.addFocusListener(this);
        this.view.JL_Weight.addFocusListener(this);
    }
    
    public void init_view(){        
        this.view.JTF_Weight.transferFocus();
        this.view.JTF_Weight.selectAll();
        this.view.setVisible(true);
        
    }
    public void calculate(){
        boolean control1 = true;
        boolean control2 = true; 
        try{
            this.model.setHeight(Double.parseDouble(this.view.JTF_Height.getText()));
            this.model.setWeight(Double.parseDouble(this.view.JTF_Weight.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(view, "Introduce solo número por favor");
        }
        if(this.model.getHeight() > 2 || this.model.getHeight() < 1){
            JOptionPane.showMessageDialog(view, "Este programa esta dirigido a personas entre 10 y 19 años \nNo puedes introducir valores menores a 1 metro o mayores a 2 metros");
            control1 = false;
        }
        if(this.model.getWeight() > 150 || this.model.getWeight() < 20){
            JOptionPane.showMessageDialog(view, "Este programa esta dirigido a personas entre 10 y 19 años \nNo puedes introducir valores menores a 20 kg o mayores a 150 kg");
            control2 = false;
        }
        if(control1 && control2){
            view.JTF_IMC.setText(""+d.format(this.model.IMC()));
        }
    }
    
    public void female(){
        double imc = this.model.getImc();
        if(imc <= 17.4){
            this.view.JTF_Shape.setText("Bajo peso");
        }else if(imc > 17.4 && imc <= 21.6){
            this.view.JTF_Shape.setText("Peso normal");
        }else if(imc > 21.7 && imc <= 25){
            this.view.JTF_Shape.setText("Sobrepeso");
        }else if (imc > 25){
            this.view.JTF_Shape.setText("Obesidad");
        }
    }
    
    public void male(){
        double imc = this.model.getImc();
        if(imc <= 18.3){
            this.view.JTF_Shape.setText("Bajo peso");
        }else if(imc > 18.3 && imc <= 22.5){
            this.view.JTF_Shape.setText("Peso normal");
        }else if(imc > 22.5 && imc <= 25){
            this.view.JTF_Shape.setText("Sobrepeso");
        }else if(imc > 25){
            this.view.JTF_Shape.setText("Obesidad");
        }
    }
    
    public void shape(){
        if(this.view.JRBtn_Female.isSelected()){
            female();
        }else if(this.view.JRBtn_Male.isSelected()){
            male();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.view.JBtn_IMC){
            calculate();
            shape();
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == this.view.JTF_Height){
            this.view.JTF_Height.selectAll();
        }else if(e.getSource() == this.view.JL_Weight){
            this.view.JTF_Weight.selectAll();
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        
    }
    
}
