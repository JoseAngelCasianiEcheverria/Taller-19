/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacenamiento;

/**
 *
 * @author Gercray
 */
public interface Almacenamiento {

    void guardarArchivo(String nombre, String contenido);

    String recuperarArchivo(String nombre);
}
