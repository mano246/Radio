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

    public void cambiarEstacionBajar(String frecuencia, double estacion) {
        
        String estacionTemp = String.valueOf(estacion);                       //Convert a string, el valor actual de la estacion      
        
        if ("AM".equals(frecuencia)) {                                        //Si la frecuencia es AM...
            if (estacionTemp.equals("530.0")) {                               //Si la estacion es la primera, que pase a la última y para abajo... 
               setEstacion(1610.0);
            } 
            else {                                                          //De lo contrario, que solo se le vaya restando 10 a la estacion
                double restaAM = estacion - 10.0;
                setEstacion(restaAM);
            }
        } 
        if("FM".equals(frecuencia)){                                          //Si la frecuencia es FM
            if(estacionTemp.equals("89.7")){                                  //Si la estacion actual, es la primera, que pase a la ultima y para abajo...
                setEstacion(107.9);
            }
            else {                                                               //De lo contrario, que solo se le vaya restando 0.2 a la estacion
                double restaFM = estacion - 0.2;                  
                setEstacion(restaFM);
            }
        }
    }
    
    public void cambiarEstacionArriba(String frecuencia, double estacion){
        String estacionTemp1 = String.valueOf(estacion);
        double estacionInicial = estacion;
        double sumaEstacionAM = 10.0;
        double sumaEstacionFM = 0.2;
        
        if("AM".equals(frecuencia)){
            if(estacionTemp1.equals("1610.0")){
                setEstacion(530.0);
            }
            else{
                double sumaAM = estacionInicial + sumaEstacionAM;
                setEstacion(sumaAM);
            }
        }
        if("FM".equals(frecuencia)){
            if(estacionTemp1.equals("107.6")){
                setEstacion(87.9);
            }
            else{
                double sumaFM = estacion + sumaEstacionFM;
                setEstacion(sumaFM);
            }
        }
    }
}
