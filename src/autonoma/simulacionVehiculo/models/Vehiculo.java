/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;
/**
 * Modelo que permite representar un Vehiculo
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class Vehiculo {
    //Atributos
    /**
    * velocidadActual
    */
    private float velocidadActual;
    /**
    * estado del vehiculo
    */
    private boolean estado = false;
    /**
    * Motor
    */
    private Motor motor;
    /**
    * Llantas del vehiculo
    */
    private Llanta llantas;
    
    /**
     * Inicializa los atributos de la clase Boleta
     * @param velocidadActual
     * @param motor
     * @param llantas
    */
    public Vehiculo(float velocidadActual, Motor motor, Llanta llantas) {
        this.velocidadActual = velocidadActual;
        this.motor = motor;
        this.llantas = llantas;
    }
    
    /**
     * Enciende el vehiculo
     * @return String
    */  
    public String encender (){
        this.estado = true;
        return "Se ha encendido el vehiculo";
    }
    
    /**
     * Apaga el vehiculo
     * @return String
    */  
    public String apagar (){
        this.estado = false;
        return "Se ha apagado el vehiculo";
    }
    
    public boolean verificarBrusquedad (float cambioVelocidad){
        if (cambioVelocidad > 30){
            return true;
        }
        return false;
    }
    
    /**
     * Acelera el vehiculo
     * @param aceleracion
     * @return String
    */  
    public String acelerar (float aceleracion){
        if (verificarBrusquedad(aceleracion)){
            
        }
        this.velocidadActual += aceleracion;
        return "Ha acelerado el vehiculo";
    }
    
    /**
     * Frena el vehiculo
     * @param frenado
     * @return String
    */  
    public String frenar (float frenado){
        if (verificarBrusquedad(frenado)){
            
        }
        this.velocidadActual -= frenado;
        return "Ha frenado el vehiculo";
    }
    
    /**
     * Frena bruscamente el vehiculo
     * @return String
    */  
    public String frenarBruscamente (){
        return "";
    }
}
