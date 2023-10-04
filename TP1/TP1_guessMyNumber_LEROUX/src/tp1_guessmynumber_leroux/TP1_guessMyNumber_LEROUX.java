/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
Baptiste LEROUX
TDB
TP1
Guess my number
04/10/23
 */
package tp1_guessmynumber_leroux;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_guessMyNumber_LEROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int nb = 0;
        int i = 1;
        int dif;

        System.out.println("""
                           Choisissez le niveau de difficulte :
                           1) Facile
                           2) Moyen
                           3) Difficile
                           4) Cauchemar""");
        dif = sc.nextInt();
        if (nb < 1 || nb > 4) {
                System.out.println("Erreur, vous n'avez pas choisi une difficulte valide");
                System.exit(0);
        }

        if (dif == 1) {
            int n = generateurAleat.nextInt(10);
            System.out.println("Saisissez un nombre aleatoire entre 0 et 10");
            nb = sc.nextInt();
            if (nb < 0 || nb > 10) {
                System.out.println("Erreur, vous n'avez pas choisi un nombre entre 0 et 10 ");
                System.exit(0);
            }
            while (nb != n) {
                if (nb < n) {
                    System.out.println("trop petit");
                } else if (nb > n) {
                    System.out.println("trop grand ");
                }
                System.out.println("Saisissez un nouveau nombre aleatoire entre 1 et 10");
                nb = sc.nextInt();
                i = i + 1;
            }
            System.out.println("gagne!");
            System.out.println("vous avez trouve en " + i + " tentatives");
        }
    
        else if (dif==2){
            int n = generateurAleat.nextInt(100);
            System.out.println("Saisissez un nombre aleatoire entre 0 et 100");
            nb = sc.nextInt();
            if (nb < 0 || nb > 100) {
                System.out.println("Erreur, vous n'avez pas choisi un nombre entre 0 et 100 ");
                System.exit(0);
            }
            while (nb != n) {
                if (nb < n) {
                    System.out.println("trop petit");
                } else if (nb > n) {
                    System.out.println("trop grand ");
                }
                System.out.println("Saisissez un nouveau nombre aleatoire entre 1 et 100");
                nb = sc.nextInt();
                i = i + 1;
            }
            System.out.println("gagne!");
            System.out.println("vous avez trouve en " + i + " tentatives");
        }
        
        else if (dif==3){
            int n = generateurAleat.nextInt(1000);
            System.out.println("Saisissez un nombre aleatoire entre 0 et 1000");
            nb = sc.nextInt();
            if (nb < 0 || nb > 1000) {
                System.out.println("Erreur, vous n'avez pas choisi un nombre entre 0 et 1000 ");
                System.exit(0);
            }
            while (nb != n) {
                if (nb < n) {
                    System.out.println("trop petit");
                } else if (nb > n) {
                    System.out.println("trop grand ");
                }
                System.out.println("Saisissez un nouveau nombre aleatoire entre 1 et 1000");
                nb = sc.nextInt();
                i = i + 1;
            }
            System.out.println("gagne!");
            System.out.println("vous avez trouve en " + i + " tentatives");
            
        }
    }
}

