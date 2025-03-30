package autonoma.simulacionVehiculo.exceptions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class VehiculoEncendidoException extends RuntimeException {
    
    public VehiculoEncendidoException(){
        super("El vehiculo ya esta encendido, no puede encenderlo nuevamente");
    }
    
    
}
