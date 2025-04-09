/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import autonoma.simulacionVehiculo.exceptions.AcelerarFrenarVehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.FrenarVehiculoDetenidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoAccidentadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoAceleradoAltamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoEncendidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoBruscamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoRecuperarControlException;

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
    * Motor
    */
    private Motor motor;
    /**
    * Llantas del vehiculo
    */
    private Llanta llantas;
    
    /**
    * vehiculo patinando
    */
    private boolean patinando =  false;
    
    /**
    * vehiculo accidentado
    */
    private boolean accidentado = false;
    
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
     * Verifica la magnitud del cambio de Velocidad
     * @param cambioVelocidad
     * @return boolean
    */ 
    public boolean verificarBrusquedad (float cambioVelocidad){
        if (cambioVelocidad > 30){
            return true;
        }
        return false;
    }
    
    /**
     * Enciende el vehiculo
     * @return string
    */ 
    public String encender() throws VehiculoEncendidoException{
        return this.motor.encender();
    }
    
    /**
     * Apaga el vehiculo
     * @return string
    */ 
    public String apagar() throws VehiculoApagadoException, AcelerarFrenarVehiculoApagadoException, VehiculoAccidentadoException{
        if (this.motor.isEstado() == false && this.velocidadActual > 60){
            throw new VehiculoAccidentadoException();
        }
        return this.motor.apagar();
    }
    
    /**
     * Acelera el vehiculo
     * @param aceleracion
     * @throws AcelerarFrenarVehiculoApagadoException
     * @throws VehiculoAceleradoAltamenteException
     * @return String
    */  
    public String acelerar (float aceleracion) throws AcelerarFrenarVehiculoApagadoException, VehiculoAceleradoAltamenteException{
        this.velocidadActual += aceleracion;
        this.motor.validarVelocidadMaxima(this.velocidadActual);
        if (verificarBrusquedad(aceleracion)){
            return "Ha acelerado bruscamente"; 
        }
        
        return "Ha acelerado el vehiculo";
    }
    
    /**
     * Frena el vehiculo
     * @param frenado
     * @throws AcelerarFrenarVehiculoApagadoException
     * @throws FrenarVehiculoDetenidoException
     * @throws VehiculoPatinandoFrenadoBruscamenteException
     * @throws VehiculoPatinandoFrenadoException
     * @throws VehiculoRecuperarControlException
     * @return String
    */  
    public String frenar(float frenado) throws AcelerarFrenarVehiculoApagadoException, FrenarVehiculoDetenidoException, VehiculoPatinandoFrenadoBruscamenteException, VehiculoPatinandoFrenadoException, VehiculoRecuperarControlException {
        this.motor.validarEstado();
        this.verificarVelocidadActual();
        this.patinar(frenado);

        this.velocidadActual -= frenado;

        if(this.patinando && this.velocidadActual == 0){
            throw new VehiculoRecuperarControlException();
        }
        
        return "Ha frenado el vehiculo";
    }
    
    /**
     * Verifica la velocidad actual
     * @throws FrenarVehiculoDetenidoException
    */  
    public void verificarVelocidadActual() throws FrenarVehiculoDetenidoException{
        if (this.velocidadActual == 0) {
            throw new FrenarVehiculoDetenidoException();
        }
    }
    
    /**
     * Patina el vehiculo
     * @param  frenado
     * @throws VehiculoPatinandoFrenadoException
    */  
    public void patinar(float frenado) throws VehiculoPatinandoFrenadoException, VehiculoPatinandoFrenadoBruscamenteException{
        this.patinando = true;
        this.motor.setEstado(false);
        
        if (this.velocidadActual < frenado){
            throw new VehiculoPatinandoFrenadoException();
        }
        
        if (this.verificarBrusquedad(frenado)){
            this.llantas.verificarLimiteVelocidad(velocidadActual);
        }
    }

    /**
     * Retorna la velocidadActual
     * @return velocidadActual
    */ 
    public float getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * Modifica la velocidadActual
     * @param velocidadActual
    */ 
    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * Retorna el estado de patinando
     * @return patinando
    */ 
    public boolean isPatinando() {
        return patinando;
    }

    /**
     * Retorna el estado de accidentado
     * @return accidentado
    */ 
    public boolean isAccidentado() {
        return accidentado;
    }
}
