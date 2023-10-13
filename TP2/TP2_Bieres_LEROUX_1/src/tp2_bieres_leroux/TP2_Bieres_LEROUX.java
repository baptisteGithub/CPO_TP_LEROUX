/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* TP2 
Bieres
Baptiste LEROUX
13/10/23
TDB
*/
package tp2_bieres_leroux;

/**
 *
 * @author bapti
 */
public class TP2_Bieres_LEROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", (float) 7.0,"Dubuisson") ;
    //uneBiere.lireEtiquette ();
    
    
    BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
    //deuxiemeBiere.lireEtiquette();
    
    BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken", (float) 5, "Heineken Original");
    
    
    
    uneBiere.Decapsuler();
    deuxiemeBiere.Decapsuler();
    troisiemeBiere.Decapsuler();
    //System.out.println(uneBiere.ouverte);
    
    System.out.println(uneBiere) ; 
    System.out.println(deuxiemeBiere);
    System.out.println(troisiemeBiere);
    }
    
}
