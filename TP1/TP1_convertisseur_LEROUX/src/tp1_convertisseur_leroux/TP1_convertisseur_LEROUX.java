/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*TP1
Convertisseur
Baptiste LEROUX
TDB
26/09/23
*/
package tp1_convertisseur_leroux;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_convertisseur_LEROUX {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius) {
        tCelcius= (tCelcius + 273.15);
    }
    public static void main(String[] args) {
        
        double tCelcius;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Saisissez une valeur : ");
        tCelcius = sc.nextDouble();
        System.out.println(CelciusVersKelvin);
        //System.out.println("La temperature est de "+(tCelcius+273.15)+" Kelvin.");
        
        
        
    }
    
}

