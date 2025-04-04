/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulacionVehiculo.models;
/**
 * Modelo que permite representar una Llanta
 * @author Camila
 * @since 20250404
 * @version 1.0
 */
public class Llanta {
    //Atributos
    /**
    * Tipo llanta
    */
    private String tipoLlanta;
    /**
    * Limite de velocidad permitido
    */
    private float limiteVelocidadPermitido;

    /**
     * Inicializa los atributos de la clase Boleta
     * @param tipoLlanta
     * @param limiteVelocidadPermitido
    */
    public Llanta(String tipoLlanta, float limiteVelocidadPermitido) {
        this.tipoLlanta = tipoLlanta;
        this.limiteVelocidadPermitido = limiteVelocidadPermitido;
    }

    /**
     * Retornar el tipo de llanta
     * @return tipoLlanta
    */
    public String getTipoLlanta() {
        return tipoLlanta;
    }

    /**
     * Modifica el tipo de llanta
     * @param tipoLlanta
    */
    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    /**
     * Retornar el limite permitido
     * @return limitePermitido
    */
    public float getLimiteVelocidadPermitido() {
        return limiteVelocidadPermitido;
    }

    /**
     * Modifica el limite permitido
     * @param limiteVelocidadPermitido
    */
    public void setLimitePermitido(float limiteVelocidadPermitido) {
        this.limiteVelocidadPermitido = limiteVelocidadPermitido;
    } 
}
