/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Modelo que permite representar un Vehiculo
 * @author Camila
 * @since 20250402
 * @version 1.0
*/
public interface Escritor {
    /**
     * Escribe el archivo de memoria interna por lineas
     * 
     * @param archivo
     * @throws java.io.IOException si el archivo no existe
     */
    public abstract void escribir(ArrayList<String> archivo) throws IOException ;
}
