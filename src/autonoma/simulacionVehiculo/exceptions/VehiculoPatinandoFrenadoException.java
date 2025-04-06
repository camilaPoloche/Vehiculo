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
public class VehiculoPatinandoFrenadoException extends RuntimeException {
    
    /**
    * Excepcion que se lanza cuando un vehiculo patina por la intensidad de su frenado
    */
    public VehiculoPatinandoFrenadoException(){
        super("El carro se encuentra patinando debido a la intensidad del frenado");
    }
    
}
