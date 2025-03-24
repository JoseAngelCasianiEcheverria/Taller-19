/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaReportes;

/**
 *
 * @author Gercray
 */
public class GestorReportes {

    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String datos) {
        generador.generar(datos);
    }
}
