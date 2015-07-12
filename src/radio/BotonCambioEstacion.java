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
public class BotonCambioEstacion extends Radio {

    public BotonCambioEstacion() {
        this.estacion = estacion;
        this.frecuencia = frecuencia;
    }

    public void cambiarEstacionBajar(String frecuencia, float estacion) {
        
        String estacionTemp = String.valueOf(estacion);                       //Convert a string, el valor actual de la estacion      
        
        if ("AM".equals(frecuencia)) {                                        //Si la frecuencia es AM...
            if (estacionTemp.equals("530.0")) {                               //Si la estacion es la primera, que pase a la última y para abajo... 
               setEstacion(1610.0F);
            } 
            else {                                                          //De lo contrario, que solo se le vaya restando 10 a la estacion
                float estacionTemp1 = estacion - 10F;
                setEstacion(estacion - 10.0F);
            }
        } 
        if("FM".equals(frecuencia)){                                          //Si la frecuencia es FM
            if(estacionTemp.equals("89.7")){                                  //Si la estacion actual, es la primera, que pase a la ultima y para abajo...
                setEstacion(107.9F);
            }
            else {
                float estacionTemp2 = estacion - 0.2F;                   //De lo contrario, que solo se le vaya restando 0.2 a la estacion
                setEstacion(estacion - 0.2F);
            }
        
        
        }
    }
}
