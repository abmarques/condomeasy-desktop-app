/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import view.ViewLogin;
import view.base.ViewBase;
/**
 *
 * @author brasileiro
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //runViewLogin();
        runViewBase();
        
    }
    
    public static void runViewLogin(){
        ViewLogin telaLogin = new ViewLogin();
        telaLogin.setVisible(true);
        telaLogin.setLocationRelativeTo(null);
        telaLogin.setTitle("Condom Easy");     
    }
    
    public static void runViewBase(){
        ViewBase viewBase =  new ViewBase();
        viewBase.setVisible(true);
        viewBase.setLocationRelativeTo(null);
        viewBase.setTitle("Base Cadastro");
    }
}
