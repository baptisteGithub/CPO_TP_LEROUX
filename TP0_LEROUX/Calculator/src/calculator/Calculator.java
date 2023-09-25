/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* Baptiste LEROUX
TDB
TD0 Exercice : Calculator
25/09/23
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        System.out.println("Please enter the operator:\n"
                + "1) add\n"
                + "2) substract\n"
                + "3) multiply\n"
                + "4) divide\n"
                + "5) modulo");
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt(); // On demande a sc de donner le prochain entier

        int operande1;
        int operande2;
        
        System.out.println("Entrer une premiere valeur");
        operande1 = sc.nextInt();
        System.out.println("Entrez une seconde valeur");
        operande2 = sc.nextInt();
        
    }

}
