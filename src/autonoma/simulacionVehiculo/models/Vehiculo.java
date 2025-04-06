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
    public String apagar () throws VehiculoApagadoException, VehiculoAccidentadoException{
        if(this.estado == false){
            throw new VehiculoApagadoException();
        }
        
        if(this.velocidadActual > 60){
            this.accidentado = true;
            throw new VehiculoAccidentadoException();
        }
        
        this.estado = false;
        this.velocidadActual = 0;
        return "Se ha apagado el vehiculo";
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
     * Acelera el vehiculo
     * @param aceleracion
     * @throws AcelerarFrenarVehiculoApagadoException
     * @throws VehiculoAceleradoAltamenteException
     * @return String
    */  
    public String acelerar (float aceleracion) throws AcelerarFrenarVehiculoApagadoException, VehiculoAceleradoAltamenteException{
        if(this.estado == false){
            throw new AcelerarFrenarVehiculoApagadoException();
        }
        
        this.velocidadActual += aceleracion;
        
        if (verificarBrusquedad(aceleracion)){
            if (this.velocidadActual > this.motor.getVelocidadMaxima()){
                this.accidentado = true;
                this.estado = false;
                this.velocidadActual = 0;
                throw new VehiculoAceleradoAltamenteException();
                
            }
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
        if (this.estado == false) {
            throw new AcelerarFrenarVehiculoApagadoException();
        }

        if (this.velocidadActual == 0) {
            throw new FrenarVehiculoDetenidoException();
        }

        boolean huboPatinaje = false;

        if (frenado > this.velocidadActual) {
            this.patinando = true;
            this.velocidadActual = 0;
            huboPatinaje = true;
        } else {
            this.velocidadActual -= frenado;

            if (verificarBrusquedad(frenado) && this.velocidadActual > this.llantas.getLimiteVelocidadPermitido()) {
                this.patinando = true;
                throw new VehiculoPatinandoFrenadoBruscamenteException();
            }
        }

        if (this.patinando && this.velocidadActual == 0) {
            throw new VehiculoRecuperarControlException();
        }

        if (huboPatinaje) {
            throw new VehiculoPatinandoFrenadoException();
        }

        return "Ha frenado el vehiculo";
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
     * Retorna el estado del vehiculo
     * @return estado
    */ 
    public boolean isEstado() {
        return estado;
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
