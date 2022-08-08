/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Milagros
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;
    Jugador s;
    ArrayList<Jugador> jugadores;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Jugador() {
        this.mojado = false;
        this.jugadores = new ArrayList();
    }

    public void crearJugadores(int cantidad) {
        if (cantidad < 7 && cantidad > 0) {
            for (Integer i = 1; i < cantidad + 1; i++) {
                s = new Jugador(i , "Jugador " + i.toString());
                jugadores.add(s);
            }
        } else {
            crearJugadores(6);
        }
    }

    public boolean disparo(RevolverDeAgua r, Jugador j) {
        if (r.mojar()) {
            j.setMojado(true);
            return true;
        } else {
            r.siguienteChorro();
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id= " + id + ", Nombre= " + nombre + '}';
    }

}
