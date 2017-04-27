/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulaMethods;

import Estructuras.LinkedStack;
import Objects.LinkedExc;
import Objects.Puntos;

/**
 *
 * @author "Kevin Alfaro - B40166";
 */
public class FormulaBalance {

    /**
     * @param formula = String el cual contiene la formula ingresada por el
     * usuario.
     * @return Retorna una variable boolean true si la formula esta balanceada,
     * de lo contrario retorna false.
     */
    
    Puntos punto1 = new Puntos("{", "}");
    Puntos punto2 = new Puntos("[", "]");
    Puntos punto3 = new Puntos("(", ")");
    Puntos[] signos = {punto2, punto3, punto1};

    public boolean validarPila(String palabra) throws LinkedExc  {

        LinkedStack pila = new LinkedStack();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < signos.length; j++) {
                String signo = "" + palabra.charAt(i);
                if (signo.equals(signos[j].getPuntoInicial())) {
                    String s = "" + palabra.charAt(i);
                    pila.push(s);
                    
                } else if (signo.equals(signos[j].getPuntoFinal())) {
                    if (pila.isEmpty()) {
                        return false;
                    }
                    String top = "" + pila.top();
                    if (top.equals(signos[j].getPuntoInicial())) {

                        pila.pop();

                    } else {

                        return false;
                    }
                }
            }

        }

        if (pila.size() == 0) {

            return true;

        } else {

            return false;

        }
    }

}
