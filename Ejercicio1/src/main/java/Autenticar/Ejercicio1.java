/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Autenticar;

/**
 *
 * @author Gercray
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        ServicioAutenticar local = new AutenticacionLocal();
        ServicioAutenticar oauth = new AutenticacionOAuth();

        GestorAutenticacion gestorLocal = new GestorAutenticacion(local);
        gestorLocal.login("jose", "1234");

        GestorAutenticacion gestorOAuth = new GestorAutenticacion(oauth);
        gestorOAuth.login("Karen", "4321");
    }
}
