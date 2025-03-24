/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticar;

/**
 *
 * @author Gercray
 */
public class AutenticacionOAuth implements ServicioAutenticar {

    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Simulación de autenticación OAuth
        System.out.println("Autenticando... ");
        return "Karen".equals(usuario) && "4321".equals(contraseña);
    }
}
