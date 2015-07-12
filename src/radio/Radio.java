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
public class Radio {

       
   protected float estacion;
   protected boolean estado;
   protected String frecuencia;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio();
        RadioGrafico radioGraf = new RadioGrafico();
        radioGraf.setVisible(true);
    }
    /**
     * @return the frecuencia
     */
    public String getFrecuencia() {
        return frecuencia;
    }

    /**
     * @param frecuencia the frecuencia to set
     */
    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * @return the estacion
     */
    public float getEstacion() {
        return estacion;
    }

    /**
     * @param estacion the estacion to set
     */
    public void setEstacion(float estacion) {
        this.estacion = estacion;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
       
}
