package lightoff_leroux_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bapti
 */
public class CelluleLumineuse {
   
    
     private boolean etat;
     
    /**
     *constructeur qui initialise par défaut l'état à false(eteinte)
     */
    public CelluleLumineuse(){
        etat= false;
     }
    
    /**
     * cette méthode inverse l'etat de la cellule
     */
    public void activerCellule(){
         if (etat == true){
             etat = false;
         }
         else if (etat == false){
             etat = true;
         }
     }
    
    /**
     *cette méthode eteinds la cellule
     */
    public void eteindreCellule() {
            etat = false;
        }
        
    /**
     * methode verifiant si la cellule est actuellement eteinte. renvoie true si elle est eteinte et false si ell est allumée.
     * @return un boolean indiquant si la lampe est eteinte ou non
     */
    public boolean estEteint(){
        boolean etatt = false;
        if (etat == true){
            etatt = false;
        }
        else if (etat == false){
            etatt =  true;
        }
        return etatt;
    } 
    
    /**
     * retourne l'etat actuel de la cellule
     * @return l'etat de la cellule
     */
    public boolean getEtat(){
        return etat;
    }
    
    /**
     *  retourne " x " si la cellule est allumée, et " O " si la cellule est éteinte
     * @return une croix ou un rond
     */
    @Override
    public String toString() {
        String etatSt = " ";
        if (etat == true){
            etatSt = " X ";
        }
        else if (etat == false){
            etatSt = " O ";
        }
        return etatSt;
    }
    
    /**
     * methode que j'ai crée personnelement en supplement afin de tester mon code et visualiser dans quel etat est une cellule a un moment donné
     */
    public void afficherEtat(){
        System.out.println(etat);
    }
    
}
