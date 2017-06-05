/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe lo siguiente");
        System.out.println("A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");
        long tiempoInicio=System.currentTimeMillis();
        System.out.println("Pulsa Enter para terminar");
        long tiempoFin=System.currentTimeMillis();
        System.out.println("Has tardado "+(tiempoFin-tiempoInicio)/1000+"segundos");
        
    }
}