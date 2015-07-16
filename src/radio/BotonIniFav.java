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
    private double[] estacionFM;
    private double[] estacionAM;
    
    public BotonIniFav(){
        iniciarFav = false;
        estacionFM = new double[11];
        estacionAM = new double[11];
    }
    
    public void defBoton(String frecuencia, double estacion, int boton){
        setIniciarFav(true);
        if(isIniciarFav() == true){
            nuevoFavorito(frecuencia, estacion, boton);
        }
    }
    
    public void nuevoFavorito(String frecuencia, double estacion, int boton){
        int espacioNuevo = boton - 1;            //Es menos 1, porque las casillas del arreglo inician en 0.
        if (frecuencia.equals("AM")){
            estacionAM[espacioNuevo]= estacion;
            //Usar la de double estacionAM
        }
        if (frecuencia.equals("FM")){
            estacionFM[espacioNuevo]= estacion;
            //Usar la de floar estacionFM
        }
    }    
    
    public void verFavorito(String frecuencia, int boton){
        int espacioIng = boton - 1;
        double estacionFav = 0.0F;
        if (frecuencia.equals("AM")){
            estacionFav = getEstacionAM()[espacioIng];
            //Usar la de double estacionAM
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
    public double[] getEstacionFM() {
        return estacionFM;
    }

    /**
     * @return the estacionAM
     */
    public double[] getEstacionAM() {
        return estacionAM;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
