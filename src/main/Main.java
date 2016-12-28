/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.*;
import controls.*;
import models.*;
import javax.swing.JPanel;
/**
 *
 * @author panda
 */
public class Main {
    
    public static JPanel views[] = new JPanel[5];
    
    public static ViewMain viewMain;
    public static ModelMain modelMain;
    public static ControlMain controlMain;
    
    public static void main(String[] PGR) {
        
        ViewAbout viewAbout = new ViewAbout();
        ModelAbout modelAbout = new ModelAbout();
        ControlAbout controlAbout = new ControlAbout(modelAbout, viewAbout);
        
        ViewArithmetic viewAr = new ViewArithmetic();
        ModelArithmetic modelAr = new ModelArithmetic();
        ControlArithmetic controlAr = new ControlArithmetic(modelAr, viewAr);
        
        ViewConverter viewC = new ViewConverter();
        ModelConverter modelC = new ModelConverter();
        ControlConverter controlC = new ControlConverter(modelC, viewC);
        
        ViewEncrypt viewE = new ViewEncrypt();
        ModelEncrypt modelE = new ModelEncrypt();
        ControlEncrypt controlE = new ControlEncrypt(modelE, viewE);
        
        ViewIMC viewI = new ViewIMC();
        ModelIMC modelI = new ModelIMC();
        ControlIMC controlI = new ControlIMC(modelI, viewI);
        
        
        views[0] = viewAbout;
        views[1] = viewAr;
        views[2] = viewC;
        views[3] = viewE;
        views[4] = viewI;
        
        viewMain = new ViewMain();
        modelMain = new ModelMain();
        controlMain = new ControlMain(viewMain, modelMain, views);
    }
}
