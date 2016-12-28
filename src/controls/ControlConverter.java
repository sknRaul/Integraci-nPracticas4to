/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;
import views.ViewConverter;
import models.ModelConverter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utt
 */
public class ControlConverter implements ActionListener {

    private ViewConverter viewConverter;
    private ModelConverter modelConverter;
    
    public ControlConverter(ModelConverter modelConverter, ViewConverter viewConverter){
        this.modelConverter  = modelConverter; 
        this.viewConverter = viewConverter;
        
        this.viewConverter.JBtn_Converter.addActionListener(this);
        inView();
    }
    
    public void inView(){
        this.viewConverter.setVisible(true);
        this.viewConverter.JL_ErrorDecimal.setVisible(false);
    }
    
    private void binary(){
        this.viewConverter.JL_ErrorDecimal.setVisible(false);
        try {
            this.modelConverter.setNumber(Integer.parseInt(this.viewConverter.JTF_Decimal.getText()));
        } catch (Exception e) {
            this.viewConverter.JL_ErrorDecimal.setVisible(true);
        }
        this.modelConverter.binary();
        this.viewConverter.JTF_Result.setText(this.modelConverter.getResultado());  
    }
    
    private void octal(){
        this.viewConverter.JL_ErrorDecimal.setVisible(false);
        try {
            this.modelConverter.setNumber(Integer.parseInt(this.viewConverter.JTF_Decimal.getText()));
        } catch (Exception e) {
            this.viewConverter.JL_ErrorDecimal.setVisible(true);
        }
        this.modelConverter.octal();
        this.viewConverter.JTF_Result.setText(this.modelConverter.getResultado());  
    }
    
    private void hex(){
        this.viewConverter.JL_ErrorDecimal.setVisible(false);
        try {
            this.modelConverter.setNumber(Integer.parseInt(this.viewConverter.JTF_Decimal.getText()));
        } catch (Exception e) {
            this.viewConverter.JL_ErrorDecimal.setVisible(true);
        }
        this.modelConverter.hex();
        this.viewConverter.JTF_Result.setText(this.modelConverter.getResultado());  
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Binario".equals(this.viewConverter.JCBox_System.getSelectedItem().toString()))
            binary();
        else if("Octal".equals(this.viewConverter.JCBox_System.getSelectedItem().toString()))
            octal();
        else if("Hexadecimal".equals(this.viewConverter.JCBox_System.getSelectedItem().toString()))
            hex();
    }
}
