/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticar;

/**
 *
 * @author Gercray
 */
public class AutenticacionLocal implements ServicioAutenticar {

    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return "Jose".equals(usuario) && "1234".equals(contraseña);
    }
}
