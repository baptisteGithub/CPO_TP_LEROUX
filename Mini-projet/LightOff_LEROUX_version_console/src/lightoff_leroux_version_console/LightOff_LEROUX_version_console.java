/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_leroux_version_console;

/**
 *
 * @author bapti
 */
public class LightOff_LEROUX_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        cellule1.getEtat();
        cellule1.afficherEtat();
        cellule1.activerCellule();
        cellule1.getEtat();
        cellule1.afficherEtat();
    }
    
    //matriceCellules m = new matriceCellules(8,8);
}
