/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.ViewArithmetic;
import models.ModelArithmetic;
import javax.swing.JOptionPane;
/**
 *
 * @author panda
 */
public class ControlArithmetic implements ActionListener {
    private ModelArithmetic model;
    private ViewArithmetic view;
    
    private MouseListener mouseListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
           
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            if(me.getSource() == view.JBtn_Plus){
                call();
                view.JTF_Resultado.setText(""+model.plus());
            }
        }

        @Override
        public void mouseExited(MouseEvent me) {
            if(me.getSource() == view.JBtn_Modulo){
                call();
                view.JTF_Resultado.setText(""+model.modulo());
            }
        }
    };
    
    private KeyListener kListen = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
            if(ke.getKeyChar()  == KeyEvent.VK_MINUS){
                call();
                view.JTF_Resultado.setText(""+model.minus());
            }else if(ke.getKeyChar() == KeyEvent.VK_SLASH){
                call();
                view.JTF_Resultado.setText(""+model.into());
            }else if(ke.getKeyChar() == KeyEvent.VK_ENTER){
                call();
                view.JTF_Resultado.setText(""+model.times());
            }
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    
    public ControlArithmetic(ModelArithmetic model, ViewArithmetic view){
        this.view = view;
        this.model = model;
        this.view.JBtn_Into.addActionListener(this);
        this.view.JBtn_Minus.addActionListener(this);
        this.view.JTF_Resultado.addKeyListener(kListen);
        this.view.JBtn_Plus.addMouseListener(mouseListener);
        this.view.JBtn_Modulo.addMouseListener(mouseListener);
        this.view.JBtn_Modulo.addActionListener(this);
        this.view.JBtn_Plus.addActionListener(this);
        this.view.JBtn_Times.addActionListener(this);
    }

    public ControlArithmetic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inView(){
        this.view.setVisible(true);
    }
    
    public void call(){
        try{
            this.model.setNum1(Double.parseDouble(this.view.JTF_Numero1.getText()));
            this.model.setNum2(Double.parseDouble(this.view.JTF_Numero2.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(view, "Por favor solo ingresa números, no letras");
        }
    }
    
    public void plus(){
        call();
        this.view.JTF_Resultado.setText(""+this.model.plus());
    }
    
    public void minus(){
        call();
        this.view.JTF_Resultado.setText(""+this.model.minus());
    }
    
    public void times(){
        call();
        this.view.JTF_Resultado.setText(""+this.model.times());
    }
    
    public void into(){
        call();
        this.view.JTF_Resultado.setText(""+this.model.into());
    }
    
    public void modulo(){
        call();
        this.view.JTF_Resultado.setText(""+this.model.modulo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.view.JBtn_Plus){
            plus();
        }else if(e.getSource() == this.view.JBtn_Minus){
            minus();
        }else if(e.getSource() == this.view.JBtn_Times){
            times();
        }else if(e.getSource() == this.view.JBtn_Into){
            into();
        }else{
            modulo();
        }
    }
}
