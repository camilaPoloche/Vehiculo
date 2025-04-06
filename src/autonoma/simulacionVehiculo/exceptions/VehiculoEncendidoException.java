package autonoma.simulacionVehiculo.exceptions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Modelo que permite representar una excepcion
 * @author Mariana
 * @since 20250404
 * @version 1.0
 */
public class VehiculoEncendidoException extends RuntimeException {
    
    /**
    * Excepcion que se lanza al encender un vehículo que ya esta encendido
    */
    public VehiculoEncendidoException(){
        super("El vehiculo ya esta encendido, no puede encenderlo nuevamente");
    }
    
    
}
