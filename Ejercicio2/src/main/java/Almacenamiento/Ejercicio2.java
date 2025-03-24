/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Almacenamiento;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        Almacenamiento nube = new AlmacenamientoNube();

        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.guardar("local.txt", "Archivo local");
        gestorLocal.recuperar("local.txt");

        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.guardar("nube.txt", "Archivo en la nube");
        gestorNube.recuperar("nube.txt");
    }
}
