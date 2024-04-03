/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginregistro;

import loginregistro.usuariosDAL.ConexionBD;
import loginregistro.usuariosGUI.LoginUsuarios;

/**
 *
 * @author chris
 */
public class LoginRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginUsuarios loginForm = new LoginUsuarios();
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        
        
        
    }
    
}
