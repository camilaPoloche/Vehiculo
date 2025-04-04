/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.exceptions;

/**
 * Modelo que permite representar una excepcion
 * @author Mariana
 * @since 20250404
 * @version 1.0
 */
public class VehiculoApagadoException extends RuntimeException  {
    
    public VehiculoApagadoException(){
        super("El vehiculo ya esta apagado,  no puede apagarlo nuevamente");
    }
    
}
