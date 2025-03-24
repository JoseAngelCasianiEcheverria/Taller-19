/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento;

/**
 *
 * @author Gercray
 */
public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String archivo) {
        almacenamiento.guardarArchivo(nombre, archivo);
    }

    public void recuperar(String nombre) {
        String contenido = almacenamiento.recuperarArchivo(nombre);
        System.out.println("Contenido recuperado: " + contenido);
    }
}
