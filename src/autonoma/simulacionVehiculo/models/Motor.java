/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import autonoma.simulacionVehiculo.exceptions.AcelerarFrenarVehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoAceleradoAltamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoEncendidoException;

/**
 * Modelo que permite representar un motor
 * @author Mariana
 * @since 20250404
 * @version 1.0
 */
public class Motor {
    //Atributos 
    
    /**
     * cilindraje del motor
     */
    private String cilindraje;
    /**
     * velocidad maxima del motor
    */
    private float velocidadMaxima;
    /**
     * Estado del moto
    */
    private boolean estado;
    
    //Constructor
     /**
     * Inicializa los atributos de la clase motor
     *@param cilindraje
     *@param velocidadMaxima
     */
    public Motor(String cilindraje, float velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos de acceso
    
    /**
     * Retorna el cilindraje del motor
     * @return cilindraje
    */
    public String getCilindraje() {
        return cilindraje;
    }
    
    /**
     * Modifica el cilindraje del motor
     * @param cilindraje
    */ 
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Retorna la velocidad maxima del motor
     * @return velocidadMaxima
    */
    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    /**
     * Modifica la velocidad maxima del motor
     * @param velocidadMaxima
    */ 
    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    /**
     * Retorna el estado del motor
     * @return estado
    */ 
    public boolean isEstado() {
        return estado;
    }
    /**
     * Modifica el estado del motor
     * @param estado
    */ 
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos
    
    /**
     * Enciende el motor
     * @return String
    */  
    public String encender () throws VehiculoEncendidoException{
        if (this.estado == true){
            throw new VehiculoEncendidoException();
        }
        this.estado = true;
        return "Se ha encendido el vehiculo";
    }
    
    /**
     * Apaga el motor
     * @return String
    */  
    public String apagar () throws VehiculoApagadoException, AcelerarFrenarVehiculoApagadoException{
        if (this.estado == false){
            throw new VehiculoApagadoException();
        }
        this.estado = false;
        return "Se ha apagado el vehiculo";
    }
    
    /**
     * Valida si se supera la velocidadMaxima
     * @param velocidad
    */ 
    public void validarVelocidadMaxima (float velocidad) throws VehiculoAceleradoAltamenteException{
        if (velocidad>this.velocidadMaxima){
            this.setEstado(false);
            throw new VehiculoAceleradoAltamenteException();
        }
    }
    
    /**
     * Valida el estado del motor
    */ 
    public void validarEstado() throws AcelerarFrenarVehiculoApagadoException{
        if (this.estado == false){
            throw new AcelerarFrenarVehiculoApagadoException();
        }
    }
}
