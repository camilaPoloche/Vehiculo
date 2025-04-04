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
public class VehiculoAceleradoAltamenteException extends RuntimeException {
    
    public VehiculoAceleradoAltamenteException (){
        super("El vehiculo se ha accidentado por superar la aceleracion maxima");
    }
    
}
