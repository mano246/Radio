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
public class BotonIniFav extends Radio{
    
    private boolean iniciarFav;         //Para poder establecer un nuevo favorito
    private float[] estacionFM;
    private float[] estacionAM;
    
    public BotonIniFav(){
        iniciarFav = false;
        estacionFM = new float[5];
        estacionAM = new float[5];
    }
    
    public void defBoton(String frecuencia, float estacion, int boton){
        setIniciarFav(true);
        if(isIniciarFav() == true){
            nuevoFavorito(frecuencia, estacion, boton);
        }
    }
    
    public void nuevoFavorito(String frecuencia, float estacion, int boton){
        int espacioNuevo = boton - 1;            //Es menos 1, porque las casillas del arreglo inician en 0.
        if (frecuencia.equals("AM")){
            estacionAM[espacioNuevo] = estacion;
            //Usar la de float estacionAM
        }
        if (frecuencia.equals("FM")){
            estacionFM[espacioNuevo] = estacion;
            //Usar la de floar estacionFM
        }
    }    
    
    public void ingresarFavorito(String frecuencia, int boton){
        int espacioIng = boton - 1;
        if (frecuencia.equals("AM")){
            estacionAM[espacioNuevo] = estacion;
            //Usar la de float estacionAM
        }
        if (frecuencia.equals("FM")){
            estacionFM[espacioNuevo] = estacion;
            //Usar la de floar estacionFM
        }
    
    }

    /**
     * @return the iniciarFav
     */
    public boolean isIniciarFav() {
        return iniciarFav;
    }

    /**
     * @param iniciarFav the iniciarFav to set
     */
    public void setIniciarFav(boolean iniciarFav) {
        this.iniciarFav = iniciarFav;
    }
    
}
