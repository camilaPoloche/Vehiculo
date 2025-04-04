/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

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
    
    //constructor
     /**
     * Inicializa los atributos de la clase motor
     *@param cilindraje
     *@param velocidadMaxima
     */

    public Motor(String cilindraje, float velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

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
    
    
    
    
    
    
}
