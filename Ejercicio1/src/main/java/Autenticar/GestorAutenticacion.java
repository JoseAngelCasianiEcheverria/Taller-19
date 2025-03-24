/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticar;

/**
 *
 * @author Gercray
 */
public class GestorAutenticacion {

    private ServicioAutenticar servicio;

    public GestorAutenticacion(ServicioAutenticar servicio) {
        this.servicio = servicio;
    }

    public void login(String usuario, String contraseña) {
        if (servicio.autenticar(usuario, contraseña)) {
            System.out.println("Ingresando al sistema");
        } else {
            System.out.println("Error de autenticacion");
        }
    }
}
