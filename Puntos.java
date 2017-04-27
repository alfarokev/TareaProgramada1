/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author "Kevin Alfaro - B40166";
 */
public class Puntos {

    String puntoInicial;
    String puntoFinal;

    public Puntos(String puntoInicial, String puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;

    }

    public String getPuntoInicial() {
        return puntoInicial;
    }

    public String getPuntoFinal() {
        return puntoFinal;
    }
}
