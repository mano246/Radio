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
    }

    public void cambiarEstacionBajar(String frecuencia) {
        String estacionTemp = String.valueOf(getEstacion());        //Convert a string, el valor actual de la estacion
        String convertAMMin = String.valueOf(530.0F);                    //Convertir a String, el primer valor que puede ser de AM
        String convertFMMin = String.valueOf(87.9F);                //Convertir a String, el primer valor que puede ser de FM
        if ("AM".equals(frecuencia)) {                              //Si la frecuencia es AM...
            if (estacionTemp.equals("530.0")) {                    //Si la estacion es la primera, que pase a la última y para abajo... 
               setEstacion(1610.0F);
            } else {                                                    //De lo contrario, que solo se le vaya restando 10 a la estacion
                float estacionTemp1 = getEstacion() - 10F;
                setEstacion(estacionTemp1);
            }
        } 
        if("FM".equals(frecuencia)){                            //Si la frecuencia es FM
            if(estacionTemp.equals(convertFMMin)){                  //Si la estacion actual, es la primera, que pase a la ultima y para abajo...
                setEstacion(107.9F);
            }
            else {
                float estacionTemp2 = getEstacion() - 0.2F;             //De lo contrario, que solo se le vaya restando 0.2 a la estacion
                setEstacion(estacionTemp2);
            }
        
        
        }
    }
}
