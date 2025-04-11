/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import autonoma.simulacionVehiculo.exceptions.AcelerarFrenarVehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoAceleradoAltamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoEncendidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoBruscamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoException;

/**
 * Modelo que permite representar la VentanaPrincipal
 * @author Mariana - Camila
 * @since 20250405
 * @version 1.0
*/
public class Simulador {
    // Atributos
    /**
    * Instancia de Vehiculo
    */
    private Vehiculo vehiculo;
    /**
    * Instancia de Taller
    */
    private Taller taller;

    /**
    * Inicializa los atributos de la clase Simulador
    * @param taller
    */
    public Simulador(Taller taller) {
        this.taller = taller;
        this.vehiculo = this.taller.getVehiculo();
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos
    /**
    * Encender el vehiculo
    * @return string
    */
    public String encenderVehiculo() throws VehiculoEncendidoException{
        try{
            return this.vehiculo.encender();
        } catch (VehiculoEncendidoException e){
            throw e;
        }
    }
    
    /**
    * Apagar el vehiculo
    * @return string
    */
    public String apagarVehiculo() throws VehiculoApagadoException, AcelerarFrenarVehiculoApagadoException{
        try{
            return this.vehiculo.apagar();
        } catch (VehiculoApagadoException e){
            throw e;
        } catch (AcelerarFrenarVehiculoApagadoException e){
            this.vehiculo.accidentar();
            throw e;
        }
    }
    
    /**
    * Acelerar el vehiculo
    * @param velocidad
    * @return string
    */
    public String acelerarVehiculo (float velocidad) throws AcelerarFrenarVehiculoApagadoException, VehiculoAceleradoAltamenteException{
        try{
            return this.vehiculo.acelerar(velocidad);
        } catch(AcelerarFrenarVehiculoApagadoException e){
            throw e;
        } catch(VehiculoAceleradoAltamenteException e){
            this.vehiculo.accidentar();
            throw e;
        }
    }
    
    /**
    * Frenar el vehiculo
    * @param frenado
    * @return string
    */
    public String frenarVehiculo (float frenado)throws VehiculoPatinandoFrenadoBruscamenteException, VehiculoPatinandoFrenadoException{
        try{
            return this.vehiculo.frenar(frenado);
        } catch (VehiculoPatinandoFrenadoBruscamenteException e) {
            this.vehiculo.patinar(frenado);
            throw e;
        } catch (VehiculoPatinandoFrenadoException e){
            this.vehiculo.patinar(frenado);
            throw e;
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos de acceso

    /**
    * Retornar el vehiculo
    * @return vehiculo
    */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
    * Modificar el vehiculo
    * @param vehiculo
    */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
    * Retornar el taller
    * @return taller
    */
    public Taller getTaller() {
        return taller;
    }

    /**
    * Modifica el taller
    * @param taller
    */
    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}
