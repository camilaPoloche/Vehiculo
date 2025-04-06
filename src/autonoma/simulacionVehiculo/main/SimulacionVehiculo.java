/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.main;

import autonoma.simulacionVehiculo.models.Lector;
import autonoma.simulacionVehiculo.models.Taller;
import autonoma.simulacionVehiculo.models.Vehiculo;
import autonoma.simulacionVehiculo.views.VentanaPrincipal;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * main
 * @author Camila
 * @since 20250405
 * @version 1.0
 */

public class SimulacionVehiculo {
    public static void main(String[] args) {
        //Atributos
        /**
        * Instancia de Lector
        */
        Lector lector = new Lector();
        /**
        * Instancia de Vehiculo
        */
        Vehiculo vehiculo = null;
        /**
        * Capturar IOException
        */
        try {
            /**
            * Instancia de Taller
            */
            Taller taller = new Taller(lector);
            /**
            * Instancia de Vehiculo
            */
            vehiculo = taller.configurarVehiculo();
            taller.setVehiculo(vehiculo); 
            /**
            * Instancia de VentanaPrincipal
            */
            VentanaPrincipal ventana = new VentanaPrincipal(taller);
            ventana.setVisible(true);
        } catch (IOException ex) {
            System.out.println("No encontramos el archivo");
            JOptionPane.showConfirmDialog(null, "Error al iniciar el programa, no se puede acceder al archivo configurarVehiculo.txt", "Error", JOptionPane.ERROR);
        }
    }
}