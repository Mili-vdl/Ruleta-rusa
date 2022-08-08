/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Milagros
 */
public class RevolverDeAgua {

    private int posicionAct;
    private int posicionAgua;

    public void llenarRevolver() {
        this.posicionAct = ((int) (((Math.random() * 6)) + 1));
        this.posicionAgua = ((int) (((Math.random() * 6)) + 1));
    }

    public boolean mojar() {
        return posicionAct == posicionAgua;
    }

    public void siguienteChorro() {
        if (posicionAct < 6) {
            posicionAct += 1;
        } else {
            posicionAct = 1;
        }
    }

    public int getPosicionAct() {
        return posicionAct;
    }

    public void setPosicionAct(int posicionAct) {
        this.posicionAct = posicionAct;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Posicion Actual=" + posicionAct + ", Posicion del Agua=" + posicionAgua;
    }

}
