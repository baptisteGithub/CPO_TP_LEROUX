/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leroux_version_console;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class Partie {
    
    public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";

    private GrilleDeCellules grille;
    private int nbCoups;
    int niv ;
    
    /**
     * constructeur qui cree une nouvelle grille de cellules lumineuses
     */
    public Partie() {
        grille = new GrilleDeCellules(5, 5);
        nbCoups = 0;
    }

    /**
     * Methode initialisant la partie en melangeant la matrice aleatoiremement
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * Methode permettant de jouer au jeu
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner (System.in);

        
        initialiserPartie();
        afficherGrille();

        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Entrez un coup (ligne, colonne, diagonale) : ");
            String coup = scanner.next();
            
                if ("ligne".equals(coup)) {
                    System.out.print("Entrez le numero de la ligne : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    nbCoups++;
                }
                else if ("colonne".equals(coup)) {
                    System.out.print("Entrez le numero de la colonne : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
                    nbCoups++;
                }
                else if ("diagonale".equals(coup) ){
                    System.out.println("montante ou descendante ? ");
                    String diag = scanner2.nextLine();
                        if ("montante".equals(diag)){ grille.activerDiagonaleMontante();}
                        else if ("descendante".equals(diag)){ grille.activerDiagonaleDescendante();}
                        else {System.out.println("Commande invalide.");}
                    nbCoups++;
                    }               
                else { System.out.println("Commande invalide. Veuillez reessayer.");
            }

            
            afficherGrille();
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Felicitations, vous avez eteint toutes les cellules en " + nbCoups + " coups !");
        }

        
    }

    private void afficherGrille() {
        System.out.println(grille);
    }
    
    /**
     * methode permettant de choisir un niveau de difficulte, influant sur la taille de la matrice
     */
    public void choisirNiveau(){
        
        Scanner scanner = new Scanner(System.in);
        boolean b =false;
        while (b == false){
        System.out.println("Veuillez choisir le niveau de difficulte (ecrire 'facile', 'difficile', etc... ) : \n"
                + ANSI_GREEN + "Niveau facile : matrice 3x3\n" + ANSI_RESET 
                + ANSI_YELLOW + "Niveau intermediaire : matrice 5x5\n"
                + ANSI_RED +"Niveau difficile : matrice 7x7\n"
                + ANSI_PURPLE + "Niveau extreme : matrice 10x10" + ANSI_RESET);
        String niveau  = scanner.next();
        if ("facile".equals(niveau)){
            grille = new GrilleDeCellules(3,3);
            b = true;
        }
        else if ("intermediaire".equals(niveau)){
            grille = new GrilleDeCellules (5,5);
            b = true;
        }
        else if ("difficile".equals(niveau)){
            grille = new GrilleDeCellules(7,7);
            b= true;
        }
        else if ("extreme".equals(niveau)){
            grille = new GrilleDeCellules(10,10);
            b = true;
        }
        else {
            System.out.println("\nErreur de saisie, veuillez reessayer");
            b = false;
        }
    }
    }
    
    /**
     * Methode enoncant les regles du jeu
     */
    public void definirRegles() {
        System.out.println(ANSI_CYAN + "BIENVENU DANS LE JEU LIGHTOFF !" + ANSI_RESET);
        System.out.println("Vous allez vous retrouver face a une grille de LED. Chaque LED est representee par 'X' si elle est allumee, ou par 'O' si elle est eteinte.\n"
                + "A chaque coup, vous pouvez inverser l'etat de toutes les cellules d'une ligne/colonne/diagonale.\n"
                +"Votre but sera d'eteindre toutes les LED de la grille, avec le moins de tentatives possibles.\n"
                + ANSI_BLUE+"BON COURAGE !  "+ ANSI_RESET);
    }
}
