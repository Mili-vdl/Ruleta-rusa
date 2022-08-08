/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletaRusa;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jugador s = new Jugador();
        RevolverDeAgua rda = new RevolverDeAgua();
        Juego juego = new Juego();

        System.out.println("¿Cuantos jugadores serán?");
        int cantidad = scan.nextInt();
        s.crearJugadores(cantidad);
        //System.out.println(s.getJugadores());
        
        rda.llenarRevolver();
        System.out.println(rda);

        juego.llenarJuego(s.getJugadores(), rda);
        juego.ronda();
    }

}
