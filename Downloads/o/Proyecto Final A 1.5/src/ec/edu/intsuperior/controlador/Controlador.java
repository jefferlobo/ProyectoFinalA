/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import ec.edu.intsuperior.vista.formularios.LogginAdmin;
import ec.edu.intsuperior.vista.formularios.LogginEmpleado;

import ec.edu.intsuperior.vista.formularios.PanelAdmin;
import ec.edu.intsuperior.vista.formularios.Registro;

  

public class Controlador {
    LogginAdmin loggin = new LogginAdmin(this); 
    PanelAdmin panelAdmin= new PanelAdmin (this);
    Registro registro=new Registro(this);
    LogginEmpleado cambiarE=new LogginEmpleado(this);
    LogginAdmin cambiarA=new LogginAdmin(this);
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
    public void closeLoggin(){
        loggin.setVisible(false);
     }    
     public void showPanelAdmin(){
        panelAdmin.setVisible(true);
    }
     public void closePanelAdmin(){
        panelAdmin.setVisible(false);
    }
     public void showRegistro(){
        registro.setVisible(true);
    }
    public void closeRegistro(){
        registro.setVisible(false);
    }    
    public void showLogginEmpleado(){
        cambiarE.setVisible(true);
    }
    public void closeLogginEmpleado(){
        cambiarE.setVisible(false);
    }
    public void showLogginAdmin (){
        cambiarA.setVisible(true);
    }
    public void closeLogginAdmin (){
        cambiarA.setVisible(false);
}
}