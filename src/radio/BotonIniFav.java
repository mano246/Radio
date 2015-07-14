/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 *
 * @author Manolo
 */
public class BotonIniFav extends Radio implements ActionListener{
    
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
            estacionAM[espacioNuevo]= estacion;
            //Usar la de float estacionAM
        }
        if (frecuencia.equals("FM")){
            estacionFM[espacioNuevo]= estacion;
            //Usar la de floar estacionFM
        }
    }    
    
    public void verFavorito(String frecuencia, int boton){
        int espacioIng = boton - 1;
        float estacionFav = 0.0F;
        if (frecuencia.equals("AM")){
            estacionFav = getEstacionAM()[espacioIng];
            //Usar la de float estacionAM
        }
        if (frecuencia.equals("FM")){
             estacionFav = getEstacionFM()[espacioIng];
            //Usar la de floar estacionFM
        }
        setEstacion(estacionFav);
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
     * @return the estacionAM
     */
    public float[] getEstacionAM() {
        return estacionAM;
    }
    
    public void mousePressed(MouseEvent e){
        System.exit(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
