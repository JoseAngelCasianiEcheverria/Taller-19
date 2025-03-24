/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento;

/**
 *
 * @author Gercray
 */
public class AlmacenamientoLocal implements Almacenamiento {
    private String archivoNombre;
    private String archivoContenido;

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        this.archivoNombre = nombre;
        this.archivoContenido = contenido;
        System.out.println("El archivo fue guardado localmente: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        if (nombre.equals(this.archivoNombre)) {
            return this.archivoContenido;
        } else {
            return "Archivo no encontrado en local";
        }
    }
}
