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
 * Modelo que permite representar un taller
 * @author Camila
 * @since 20250405
 * @version 1.0
*/
public class Taller {
    //Atributos
    /**
    * Instancia de Lector
    */
    private Lector lector;
    /**
    * Instancia de Vehiculo
    */
    private Vehiculo vehiculo;

    /**
     * Inicializa los atributos de la clase Taller
     * @param lector
    */
    public Taller(Lector lector) {
        this.lector = lector;
        this.vehiculo = null;
    }
    
    /**
     * Configurar el Vehiculo
     * @throws IOException
     * @retun vehiculo
    */
    public Vehiculo configurarVehiculo() throws IOException {
        ArrayList<String> configuracion = this.lector.leer("configuracionVehiculo.txt");
        this.vehiculo = this.convertirDatosConfiguracion(configuracion);
        return this.vehiculo;
    }
    
    /**
     * Verifica el limiteVelocidad de las llantas segun el tipo
     * @param llanta
     * @retun float
    */
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
    
    /**
     * Verifica la velocidadMaxima del motor segun cc
     * @param motor
     * @retun float
    */
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
    
    /**
     * Lee el archivo y lo convierte en un arreglo String
     * @param configuracion
     * @retun vehiculo
    */
    private Vehiculo convertirDatosConfiguracion(ArrayList<String> configuracion) {
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
        return this.vehiculo;
    }

    
    /**
     * Muestra las posibles configuraciones del vehiculo
     * @return String
    */
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
    
    /**
     * Muestra la configuracion actual del vehiculo
     * @throws IOException
     * @return String
    */
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

    /**
     * Retorna el Vehiculo
     * @return vehiculo
    */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    /**
     * Modifica el Vehiculo
     * @param vehiculo
    */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}


