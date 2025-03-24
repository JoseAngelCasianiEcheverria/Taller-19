/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaReportes;

/**
 *
 * @author Gercray
 */
public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en PDF: " + datos);
    }
}