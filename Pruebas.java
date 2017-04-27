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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String expresion = "[a-z]";
        
        //Verifica si un string contiene una palabra especifica.
        String word = "SQRT";
        String formula = "5+(sqrt(5))";
        if (formula.toLowerCase().contains(word.toLowerCase())) {

            System.out.println("True");

        } else {

            System.out.println("False");

        }
        //Covierte un numero(int, double, float, long) a String
        float a = (float) 56123.26;
        System.out.println(String.valueOf(a));
        double b = 1245.6;
        System.out.println(String.valueOf(b));
        String s = "hola";
    }

}
