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
    private Vehiculo vehiculo = null;

    public Taller(Lector lector, Vehiculo vehiculo) {
        this.lector = lector;
        this.vehiculo = vehiculo;
    }
    
    public Vehiculo configurarVehiculo() throws IOException {
        ArrayList<String> configuracion = this.lector.leer("configuracionVehiculo.txt");
        this.vehiculo = this.convertirDatosConfiguracion(configuracion);
        return this.vehiculo;
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
        String llantasTipo = "";
        String motorCilindraje = "";

        for (String linea : configuracion) {
            String[] partes = linea.split(";");

            if (partes.length < 2) {
                continue; 
            }
            
            if (partes[0].equalsIgnoreCase("llantas")) {
                llantasTipo = partes[1];
            } else if (partes[0].equalsIgnoreCase("motor")) {
                motorCilindraje = partes[1];
            }
        }

        float velocidadMaxima = this.verificarMotor(motorCilindraje);
        float limiteVelocidadPermitido = this.verificarLlantas(llantasTipo);  

        Motor motorNuevo = new Motor(motorCilindraje, velocidadMaxima);
        Llanta llantaNueva = new Llanta(llantasTipo, limiteVelocidadPermitido);

        vehiculoNuevo = new Vehiculo(0, motorNuevo, llantaNueva);
        return vehiculoNuevo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

