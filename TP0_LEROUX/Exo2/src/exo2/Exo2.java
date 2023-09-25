/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* Baptiste LEROUX
TDB
TP0 partie 2
25/09/23
*/
package exo2;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d'entier à additionner
        int result; // resultat
        int ind; //indice
        //nb=5;
        result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
           result=result+ind;
           ind=ind+1;
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result); 
    }
}