/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class Taller {
    private Lector lector;
    Vehiculo vehiculo = null;
    
    public void configurarVehiculo() throws IOException {
        ArrayList<String> configuracion = this.lector.leer("configuracionVehiculo.txt");
        this.vehiculo = this.convertirDatosConfiguracion(configuracion);
    }
    
    public float verificarLlantas (String llanta){
        float limiteVelocidadPermitido;
        if (llanta == "Bonitas"){
            limiteVelocidadPermitido = 70;
            return limiteVelocidadPermitido;
        }
        else if (llanta == "Buenas"){
            limiteVelocidadPermitido = 110;
            return limiteVelocidadPermitido;
        }
        else if (llanta == "Baratas"){
            limiteVelocidadPermitido = 50;
            return limiteVelocidadPermitido;
        }
        return 0;
    }
    
    public float verificarMotor(String motor){
        float velocidadMaxima;
        if (motor == "3000"){
            velocidadMaxima = 220;
            return velocidadMaxima;
        }
        else if (motor == "2000"){
            velocidadMaxima = 160;
            return velocidadMaxima;
        }
        else if (motor == "1000"){
            velocidadMaxima = 100;
            return velocidadMaxima;
        }
        return 0;
    }
    
    private Vehiculo convertirDatosConfiguracion(ArrayList<String> configuracion) {
        Vehiculo vehiculoNuevo = null;
        for (String linea : configuracion) {
            String llantasTipo = linea.split(";")[1];
            String motorCilindraje = linea.split(";")[3];
            
            float velocidadMaxima = this.verificarMotor(motorCilindraje);
            float limiteVelocidadPermitido = this.verificarLlantas(llantasTipo);  
            
            Motor motorNuevo = new Motor (motorCilindraje, velocidadMaxima);
            Llanta llantaNueva = new Llanta (llantasTipo, limiteVelocidadPermitido);

            vehiculoNuevo = new Vehiculo(0, motorNuevo, llantaNueva);
        }
        return vehiculoNuevo;
    }
}
