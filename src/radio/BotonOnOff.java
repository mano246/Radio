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
public class BotonOnOff extends Radio {

    public BotonOnOff() 
    {
        this.estado = false;
    }

    public void encender() 
    {
       // System.out.println("ON");
        this.estado=true;
    }
}
