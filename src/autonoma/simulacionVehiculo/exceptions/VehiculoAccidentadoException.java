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
public class VehiculoAccidentadoException extends RuntimeException {
    
    /**
    * Excepcion que se lanza al accidentarse un vehiculo por su velocidad
    */
    public VehiculoAccidentadoException (){
        super("El vehiculo se ha accidentado ya que se apago e iba a una velocidad mayor a 60Km/h");
    }
}
