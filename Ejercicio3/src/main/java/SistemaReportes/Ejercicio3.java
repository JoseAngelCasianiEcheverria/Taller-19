/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SistemaReportes;

/**
 *
 * @author Gercray
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();

        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.crearReporte("Datos del reporte PDF");

        GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.crearReporte("Datos del reporte Excel");
    }
}
