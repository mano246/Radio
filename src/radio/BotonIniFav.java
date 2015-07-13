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
    private float estacionFM[];
    private float estacionAM[];
    
    public BotonIniFav(){
        iniciarFav = false;
    }
    
    public void defBoton(String frecuencia, float estacion, int boton){
        setIniciarFav(true);
        if(iniciarFav == true){
            nuevoFavorito(frecuencia, estacion, boton);
        }
    }
    
    public void nuevoFavorito(String frecuencia, float estacion, int boton){
        if (frecuencia.equals("AM")){
            
            //Usar la de float estacionAM
        }
        if (frecuencia.equals("FM")){
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

    /**
     * @return the estacionFM
     */
    public float[] getEstacionFM() {
        return estacionFM;
    }

    /**
     * @param estacionFM the estacionFM to set
     */
    public void setEstacionFM(float[] estacionFM) {
        this.estacionFM = estacionFM;
    }

    /**
     * @return the estacionAM
     */
    public float[] getEstacionAM() {
        return estacionAM;
    }

    /**
     * @param estacionAM the estacionAM to set
     */
    public void setEstacionAM(float[] estacionAM) {
        this.estacionAM = estacionAM;
    }
    
}
