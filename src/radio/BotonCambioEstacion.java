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

    public void cambiarEstacion(String frecuencia) {
        float estacionTemp = getEstacion();
        if ("AM".equals(frecuencia)) {
            if (estacionTemp == 530.0F) {
                setEstacion(1610.0F);
            } else {
                setEstacion(1610.0F);
            }
        } else {
            setEstacion(89.7F);
        }
    }
}
