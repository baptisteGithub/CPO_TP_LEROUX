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
        double tKelvin;
        tKelvin = (tCelcius + 273.15);
        return tKelvin;
    }
    
    public static double KelvinVersCelcius(double tKelvin) {
        double tCelcius;
        tCelcius = (tKelvin -273.15);
        return tCelcius;
    }
    
    public static double FarenheitVersCelcius(double tFarenheit) {
        double tCelcius;
        tCelcius = (tFarenheit-32)*5/9;
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit(double tCelsius) {
        double tFarenheit;
        tFarenheit = (tCelsius*9/5)+32;
        return tFarenheit;
    }
    
    public static double KelvinVersFarenheit(double tKelvin) {
        double tFarenheit;
        tFarenheit = KelvinVersCelcius(tKelvin);
        tFarenheit = CelciusVersFarenheit(tFarenheit);
        return tFarenheit;
    }
    
    public static double FarenheitVersKelvin(double tFarenheit){
        double tKelvin;
        tKelvin = FarenheitVersCelcius(tFarenheit);
        tKelvin = CelciusVersKelvin(tKelvin);
        return tKelvin;
        
    }
    
    public static void main(String[] args) {
        
        double temp;
        int conversion;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Saisissez une valeur : ");
        temp = sc.nextDouble();
        System.out.println("""
                           Saisissez la conversion que vous souhaitez effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) De Celcius vers Farenheit
                           4) De Farenheit vers Celcius
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin""");
        conversion = sc.nextInt();
        
        String resultat = null;
        switch (conversion) {
            case 1:
                resultat = temp+" degre Celcius est egal a "+CelciusVersKelvin(temp)+" degre Kelvin";
                break;
            case 2:
                resultat = temp+" degre Kelvin est egal a "+KelvinVersCelcius(temp)+" degre Celcius";
                break;
            case 3:
                resultat= temp+" degre Celcius est egal a "+CelciusVersFarenheit(temp)+" degre Farenheit";
                break;
            case 4:
                resultat = temp+ " degre Farenheit est egal a "+FarenheitVersCelcius(temp)+" degre Celcius";
                break;
            case 5:
                resultat = temp+" degre Kelvin est egal a "+ KelvinVersFarenheit(temp)+ " degre Farenheit";
                break;
            case 6: 
                resultat = temp+" degre Farenheit est egal a "+ FarenheitVersKelvin(temp)+" degre Kelvin";
                break;
            default:
                System.out.println("Erreur, vous n'avez pas choisi une conversion valide!");
                break;
        }
        if (conversion >= 1 && conversion <= 6) {
            System.out.println(resultat);
        }
    }}
        
        //System.out.println(CelciusVersKelvin(temp));
        //System.out.println(KelvinVersCelcius(temp));
        //System.out.println(FarenheitVersCelcius(temp));
        //System.out.println(CelciusVersFarenheit(temp));
        //System.out.println(KelvinVersFarenheit(temp));
        //System.out.println(FarenheitVersKelvin(temp));
        //System.out.println("La temperature est de "+(tCelcius+273.15)+" Kelvin.");
        
        
        
        
    
    
