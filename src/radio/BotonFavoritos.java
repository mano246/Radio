/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author Manolo
 */
public class BotonFavoritos extends Radio {

    public BotonFavoritos() {
        this.frecuencia = "";
        this.estacion = 0.0F;
    }

    public BotonFavoritos(String frecuencia, double estacion) {
        this.frecuencia = frecuencia;
        this.estacion = estacion;
    }
    
    public void establecerFavorito(){
    }
    
    public void seleccionarFavorito(){
    }
    
}
