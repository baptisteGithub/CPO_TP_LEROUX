/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leroux_version_console;

import java.util.Random;

/**
 *
 * @author bapti
 */
public class GrilleDeCellules {

    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * constructeur qui crée une nouvelle grille de cellules lumineuses, avec un
     * nombre spécifié de lignes et de colonnes.
     *
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public void GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;

        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * methode qui active une ligne colonne ou diagonale principale de matiere
     * aleatoire
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int activationType = random.nextInt(3);
        if (activationType == 0) {
            int ligneAleatoire = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligneAleatoire][j].activerCellule();
            }
        } else if (activationType == 1) {
            int colonneAleatoire = random.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonneAleatoire].activerCellule();
            }
        } else {
            for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }

    /**
     * methode qui melange une grille, en eteignant d"abord toutes ses cellules,
     * puis en activant de maniere aleatoire des lignes, colonne ou diagonale
     * principale (le nombre de fois que cela aura été demandé avec la valeur de
     * nbTours
     *
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random2 = new Random();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }

        for (int tour = 0; tour < nbTours; tour++) {
            int activationType = random2.nextInt(3);

            if (activationType == 0) {
                int ligneAleatoire = random2.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligneAleatoire][j].activerCellule();
                }
            } else if (activationType == 1) {
                int colonneAleatoire = random2.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonneAleatoire].activerCellule();
                }
            } else {
                for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                    matriceCellules[i][i].activerCellule();
                }
            }
        }
    }

    /**
     * methode permettant d'active toutes les cellules d'une ligne, selon le
     * numero de la ligne renseigné
     *
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }

    /**
     * methode permettant d'active toutes les cellules d'une colonne, selon le
     * numero de la colonne renseigné
     *
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }

    /**
     * active les cellules sur la diagonale descendante
     */
    public void activerDiagonaleDescendante() {
        int minDimension = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDimension; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * active les cellules sur la diagonale montante
     */
    public void activerDiagonaleMontante() {

        int minDimension = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDimension; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();

        gridString.append("   ");
        for (int j = 0; j < nbColonnes; j++) {
            gridString.append(" " + j + " ");
        }
        gridString.append("\n");

        for (int i = 0; i < nbLignes; i++) {
            gridString.append(i + " |");

            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    gridString.append(" O ");
                } else {
                    gridString.append(" X ");
                }
            }

            gridString.append("|\n");
        }

        return gridString.toString();
    }

}
