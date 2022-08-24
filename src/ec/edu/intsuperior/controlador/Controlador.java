package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Loggin;

public class Controlador {
    Loggin loggin= new Loggin(this);
    Administrador administrador= new Administrador(this);
    
    public void probarConexion(){
        Conexion.getConnection();
    }
      public void probarConexion2(){
        Conexion2.getConnection();
    }
    
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
    public void closeLoggin(){
        loggin.setVisible(false);
    }
    
    public void showAdministrador(){
        administrador.setVisible(true);
    }
    public void closeAdministrador(){
        administrador.setVisible(false);
    }
    
    
}
