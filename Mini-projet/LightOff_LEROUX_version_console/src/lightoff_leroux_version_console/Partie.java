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

    private GrilleDeCellules grille;
    private int nbCoups;

    public Partie() {
        // grille = new GrilleDeCellules(3,3);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
        nbCoups = 0;
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");
        initialiserPartie();
        boolean jeuTermine = false;

        while (!jeuTermine) {
            afficherGrille();
            //       int[] coup = demanderCoupAuJoueur(scanner);
            // manque une ligne pour le coup
            nbCoups++;
            afficherGrille();

            if (grille.cellulesToutesEteintes()) {
                jeuTermine = true;
                System.out.println("Félicitations, vous avez éteint toutes les cellules en " + nbCoups + " coups !");
            }
        }

        scanner.close();
    }

    private void afficherGrille() {
        System.out.println(grille);
    }

    /* private int[] demanderCoupAuJoueur(Scanner scanner) {
        System.out.print("Entrez un coup (ligne, colonne, ou diagonale) : ");
        return coup;
     */
}

/*private void activerLigneColonneOuDiagonale(int[] coup) {
       
    }*/

