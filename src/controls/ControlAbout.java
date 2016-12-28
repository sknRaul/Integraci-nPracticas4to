/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;
import models.ModelAbout;
import views.ViewAbout;
/**
 *
 * @author utt
 */
public class ControlAbout {
    ModelAbout modelAbout;
    ViewAbout viewAbout;
    
    public ControlAbout(ModelAbout modelAbout, ViewAbout viewAbout){
        this.modelAbout = modelAbout;
        this.viewAbout = viewAbout;
        
        inView();
    }
    
    public void inView(){
        this.viewAbout.setVisible(true);
    }
}