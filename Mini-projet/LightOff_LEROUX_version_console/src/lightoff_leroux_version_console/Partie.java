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
        grille = new GrilleDeCellules(8, 8);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");
        initialiserPartie();
        afficherGrille();

        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Entrez un coup (ligne, colonne, diagonale) : ");
            String coup = scanner.nextLine();
            switch (coup) {
                case "ligne" -> {
                    System.out.print("Entrez le numéro de la ligne : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                }
                case "colonne" -> {
                    System.out.print("Entrez le numéro de la colonne : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
                }
                case "diagonale" -> {
                    System.out.println("montante ou descendante ? ");
                    String diag = scanner.nextLine();
                    switch (diag) {
                        case "montante" -> grille.activerDiagonaleMontante();
                        case "descendante" -> grille.activerDiagonaleDescendante();
                        default -> System.out.println("Commande invalide.");
                    }
                }
                default -> System.out.println("Commande invalide.");
            }

            nbCoups++;
            afficherGrille();
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Félicitations, vous avez éteint toutes les cellules en " + nbCoups + " coups !");
        }

        scanner.close();
    }

    private void afficherGrille() {
        System.out.println(grille);
    }

}
