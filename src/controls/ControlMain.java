/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMain;
import views.ViewMain;
import javax.swing.JPanel;
/**
 *
 * @author panda
 */
public class ControlMain implements ActionListener{
    ViewMain viewMain;
    ModelMain modelMain;
    JPanel views[];
    
    public ControlMain(ViewMain viewMain, ModelMain modelMain, JPanel views[]){
        this.viewMain = viewMain;
        this.modelMain = modelMain;
        this.views = views;
        
        this.viewMain.JRBtn_About.addActionListener(this);
        this.viewMain.JRBtn_Arithmetic.addActionListener(this);
        this.viewMain.JRBtn_Converter.addActionListener(this);
        this.viewMain.JRBtn_Encrypt.addActionListener(this);
        this.viewMain.JRBtn_IMC.addActionListener(this);
                
        inView();
    }
    
    public void inView(){
        this.viewMain.setTitle("Practica integradora");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
        
        this.viewMain.JRBtn_About.setSelected(true);
        showAbout();
    }
    
    public void showAbout(){
        this.viewMain.setContentPane(this.views[0]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        this.viewMain.pack();
    }
    
    public void showArithmetic(){
        this.viewMain.setContentPane(this.views[1]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void showConvertert(){
        this.viewMain.setContentPane(this.views[2]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        this.viewMain.pack();
    }
    
    public void showEncrypt(){
        this.viewMain.setContentPane(this.views[3]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        this.viewMain.pack();
    }
    
    public void showIMC(){
        this.viewMain.setContentPane(this.views[4]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        this.viewMain.pack();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.viewMain.JRBtn_About)
            showAbout();
        else if(ae.getSource() == this.viewMain.JRBtn_Arithmetic)
            showArithmetic();
        else if(ae.getSource() == this.viewMain.JRBtn_Converter)
            showConvertert();
        else if(ae.getSource() == this.viewMain.JRBtn_Encrypt)
            showEncrypt();
        else if(ae.getSource() == this.viewMain.JRBtn_IMC)
            showIMC();
    }
}
