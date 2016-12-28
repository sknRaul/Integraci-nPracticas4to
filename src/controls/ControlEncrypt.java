/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewEncrypt;
import models.ModelEncrypt;

/**
 *
 * @author panda
 */
public class ControlEncrypt implements ActionListener{
    private ModelEncrypt model;
    private ViewEncrypt view;
    
    public ControlEncrypt(ModelEncrypt model, ViewEncrypt view){
        this.view = view;
        this.model = model;
        
        this.view.JBtn_Execute.addActionListener(this);
    }

    public void inView(){
        this.view.setVisible(true);
        this.view.JRBtn_Encryption.setSelected(true);
    }
    
    public void encryption(){
        this.model.setMessage(this.view.JTA_Message.getText());
        this.model.encryption();
        this.view.JTA_Message.setText(this.model.getMessage());
    }
    
    public void decode(){
        this.model.setMessage(this.view.JTA_Message.getText());
        this.model.decode();
        this.view.JTA_Message.setText(this.model.getMessage());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.view.JBtn_Execute && this.view.JRBtn_Encryption.isSelected()){
            encryption();
        }else if(ae.getSource() == this.view.JBtn_Execute && this.view.JRBtn_Decode.isSelected()){
            decode();
        }
    }
    
}
