/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Modelo que permite leer un archivo
 * @author Camila - Mariana
 * @since 20250405
 * @version 1.0
*/
public interface Lector {
    /**
     * Lee el archivo
     * @param localizacionArchivo
     * @return
     * @throws IOException 
    */
    public abstract ArrayList<String> leer(String localizacionArchivo) throws IOException;
}
