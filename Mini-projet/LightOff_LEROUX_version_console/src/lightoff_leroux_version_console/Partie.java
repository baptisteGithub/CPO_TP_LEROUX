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
        grille = new GrilleDeCellules(4, 4);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner (System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");
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

}
