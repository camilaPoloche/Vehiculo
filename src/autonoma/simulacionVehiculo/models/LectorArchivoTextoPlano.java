/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
/**
 * Modelo que permite leer un archivo de texto plano
 * @author Camila
 * @since 20250405
 * @version 1.0
*/
public class LectorArchivoTextoPlano implements Lector {
    /**
     * Archivo de la configuracion
    */
    private ArrayList<String> archivo;
    /**
     * Charset en el cual se desea leer el archivo
    */
    private Charset charset = Charset.forName("UTF-8");

    /**
     * Inicializa las variables de la clase Taller
     */
    public LectorArchivoTextoPlano(){
        this.archivo = new ArrayList<>();
    }
    
    /**
     * Lee el archivo de texto dónde tenemos el programa que deseamos interpretar
     *
     * @param localizacionArchivo ruta del archivo
     * @return arreglo con el archivo de texto
     * @throws IOException: si el archivo no existe
     */
    public ArrayList<String> leer(String localizacionArchivo) throws IOException {
        archivo.clear();
        File file =  null;
        FileReader reader = null;
        BufferedReader buffer = null;
        
        file = new File(localizacionArchivo);
        reader = new FileReader(file);
        buffer = new BufferedReader(reader);
        
        String linea;
        while ((linea= buffer.readLine())!=null ) { 
            agregarLinea(linea);
        }
        
        reader.close();
        return this.archivo;
    }
    
    /**
     * Agrega lineas al Arraylist en el cual le guarda el archivo
     * @param linea
     */
    public void agregarLinea(String linea) {
        archivo.add(linea);
    }
    
    /**
     * Limpia el archivo de posiciones en blanco
     * @param texto 
    */
    public void limpiarTexto(ArrayList<String> texto){
        for (int i = 0; i < texto.size(); i++) {
            if(texto.get(i).length()==0){
                texto.remove(i);
            }
        }
    }

    /**
     * Retorna el arreglo de la configuracion
     * @return configuracionVehiculo
    */
    public ArrayList<String> getConfiguracionVehiculo() {
        return archivo;
    }
}
