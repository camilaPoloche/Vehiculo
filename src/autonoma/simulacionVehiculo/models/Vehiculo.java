/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import autonoma.simulacionVehiculo.exceptions.AcelerarFrenarVehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.FrenarVehiculoDetenidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoEncendidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoBruscamenteException;

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
    public String encender () throws VehiculoEncendidoException{
        if (this.estado == true){
            throw new VehiculoEncendidoException();
        }
        this.estado = true;
        return "Se ha encendido el vehiculo";
    }
    
    /**
     * Apaga el vehiculo
     * @return String
    */  
    public String apagar () throws VehiculoApagadoException{
        if(this.estado == false){
            throw new VehiculoApagadoException();
        }
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
    public String acelerar (float aceleracion) throws AcelerarFrenarVehiculoApagadoException{
        if(this.estado == false){
            throw new AcelerarFrenarVehiculoApagadoException();
        }
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
    public String frenar (float frenado)throws AcelerarFrenarVehiculoApagadoException, FrenarVehiculoDetenidoException, VehiculoPatinandoFrenadoBruscamenteException{
        if(this.estado == false){
            throw new AcelerarFrenarVehiculoApagadoException();
        }
        
        if (this.velocidadActual == 0){
            throw new FrenarVehiculoDetenidoException();
        }
        
        if (verificarBrusquedad(frenado)){
            if (this.velocidadActual > this.llantas.getLimiteVelocidadPermitido()){
                throw new VehiculoPatinandoFrenadoBruscamenteException();
            }
        }
        this.velocidadActual -= frenado;
        return "Ha frenado el vehiculo";
    }
}
