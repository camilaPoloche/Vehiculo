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
    private Vehiculo vehiculo;

    public Taller(Lector lector) {
        this.lector = lector;
        this.vehiculo = null;
    }
    
    public Vehiculo configurarVehiculo() throws IOException {
        ArrayList<String> configuracion = this.lector.leer("configuracionVehiculo.txt");
        this.vehiculo = this.convertirDatosConfiguracion(configuracion);
        return this.vehiculo;
    }
    
    public float verificarLlantas (String llanta){
        if (llanta.equalsIgnoreCase("Bonitas")){
            return 70;
        }else if (llanta.equalsIgnoreCase("Buenas")){
            return 110;
        }else if (llanta.equalsIgnoreCase("Baratas")){
            return 50;
        }
        return 0;
    }
    
    public float verificarMotor(String motor){
        if (motor.equals("3000")){
            return 220;
        } else if (motor.equals("2000")){
            return 160;
        } else if (motor.equals("1000")){
            return 100;
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

        this.vehiculo = new Vehiculo(0, motorNuevo, llantaNueva);
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public String mostrarPosiblesConfiguraciones() {
        StringBuilder configuracionMostrar = new StringBuilder();
        configuracionMostrar.append("       CONFIGURACIONES         \n");
        
        configuracionMostrar.append("Configuracion llantas: \n");
        configuracionMostrar.append("buenas - 110 Km/h \n");
        configuracionMostrar.append("bonitas - 70 Km/h \n");
        configuracionMostrar.append("baratas - 50 Km/h \n");

        configuracionMostrar.append("configuración motor (cilindraje): \n");
        configuracionMostrar.append("1000 cc - 100 Km/h \n");
        configuracionMostrar.append("2000 cc - 160 Km/h \n");
        configuracionMostrar.append("3000 cc - 220 Km/h \n");

        return configuracionMostrar.toString();
    }
    
    public String mostrarConfiguracionActual() throws IOException {
        ArrayList<String> configuracion = this.lector.leer("configuracionVehiculo.txt");
        StringBuilder configuracionMostrar = new StringBuilder();
        String llantasTipo = "";
        String motorCilindraje = "";
        
        configuracionMostrar.append("       CONFIGURACIONES ELEGIDAS         \n");
        
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
        
        configuracionMostrar.append("Configuracion llantas: \n");
        configuracionMostrar.append("Tipo: " + llantasTipo + " Limite velocidad: " + limiteVelocidadPermitido + "\n");
        configuracionMostrar.append("Configuracion motor: \n");
        configuracionMostrar.append("Cilindraje: " + motorCilindraje + " Velocidad maxima: " + velocidadMaxima + "\n");
     
        return configuracionMostrar.toString();
    }  

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}


