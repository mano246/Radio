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
public class BotonFrecuencia extends Radio{

    

    public BotonFrecuencia() {
        this.frecuencia = "";
    }
    
    public void efFrec(String frecuencia){
        if ("AM".equals(getFrecuencia())){
            setEstacion(530.0F);
        }
        else{
            setEstacion(89.7F);
        }
       }
}