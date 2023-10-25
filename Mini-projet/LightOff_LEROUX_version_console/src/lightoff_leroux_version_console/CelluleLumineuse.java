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
   
    
     boolean etat;
     String nom;
     
    /**
     *
     * @param unEtat
     */
    public CelluleLumineuse(String unNom,boolean unEtat){
        nom = unNom;
        etat= unEtat;
     }
        
    /**
     *cette méthode allume la cellule
     */
    public void allumerCellule() {
            etat= true;
        }
        
    /**
     *cette méthode eteinds la cellule
     */
    public void eteindreCellule() {
            etat = false;
        }
        
    public void afficherEtat(){
        if (etat == false){
            System.out.println(nom+" : Eteinte");
        }
        else if (etat == true){
            System.out.println(nom+" : Allumee");
        }
    }
    
}
