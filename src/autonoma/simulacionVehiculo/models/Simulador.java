/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;
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
    public String encenderVehiculo(){
        return this.vehiculo.encender();
    }
    
    /**
    * Apagar el vehiculo
    * @return string
    */
    public String apagarVehiculo(){
        return this.vehiculo.apagar();
    }
    
    /**
    * Acelerar el vehiculo
    * @param velocidad
    * @return string
    */
    public String acelerarVehiculo (float velocidad){
        return this.vehiculo.acelerar(velocidad);
    }
    
    /**
    * Frenar el vehiculo
    * @param frenado
    * @return string
    */
    public String frenarVehiculo (float frenado){
        return this.vehiculo.frenar(frenado);
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
