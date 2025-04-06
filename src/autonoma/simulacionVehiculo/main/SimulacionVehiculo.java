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
 * @since 20250329
 * @version 1.0
 */

public class SimulacionVehiculo {
    public static void main(String[] args) {
        Lector lector = new Lector();
        Vehiculo vehiculo = null;
        try {
            Taller taller = new Taller(lector);
            vehiculo = taller.configurarVehiculo();
            taller.setVehiculo(vehiculo); 
            VentanaPrincipal ventana = new VentanaPrincipal(taller);
            ventana.setVisible(true);
        } catch (IOException ex) {
            System.out.println("No encontramos el archivo");
            JOptionPane.showConfirmDialog(null, "Error al iniciar el programa, no se puede acceder al archivo configurarVehiculo.txt", "Error", JOptionPane.ERROR);
        }
    }
}