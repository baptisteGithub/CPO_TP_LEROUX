/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leroux;

import Armes.Baton;
import Armes.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class TP3_Heroic_Fantasy_LEROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Epee premiereEpee = new Epee("Excalibur",7,5);
        Epee deuxiemeEpee = new Epee("Durandal", 4,7);
        Baton baton1 = new Baton("Chene",4,5);
        Baton baton2 = new Baton("Charme",5,6);
        
        
        /*System.out.println(premiereEpee);
        System.out.println(deuxiemeEpee);
        System.out.println(baton1);
        System.out.println(baton2);*/
        
        
        /*ArrayList<Object> listeArmes = new ArrayList<>();
        listeArmes.add(premiereEpee);
        listeArmes.add(deuxiemeEpee);
        listeArmes.add(baton1);
        listeArmes.add(baton2);
        
        int tailleDeTab = listeArmes.size();
        for (int i=0; i<tailleDeTab;i++){
            System.out.println(listeArmes.get(i));}
        
        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);
        Guerrier guerrier1 = new Guerrier("Conan",78,false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45,true);
        
        ArrayList<Object> listePersonnages = new ArrayList<>();
        listePersonnages.add(magicien1);
        listePersonnages.add(magicien2);
        listePersonnages.add(guerrier1);
        listePersonnages.add(guerrier2);
        
        int tailleDeTab2 = listePersonnages.size();
        for (int i=0; i<tailleDeTab2;i++){
            System.out.println(listePersonnages.get(i));}
       */
     
        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Guerrier guerrier2 = new Guerrier("Lannister", 45,true);
        Epee premiereEpee = new Epee("Excalibur",7,5);
        Epee deuxiemeEpee = new Epee("Durandal", 4,7);
        Epee troisiemeEpee = new Epee("Promethee", 8, 9);
        Baton baton1 = new Baton("Chene",4,5);
        Baton baton2 = new Baton("Charme",5,6);
        Baton baton3 = new Baton("Rosier", 4, 2);
        
        
        guerrier2.ajouterArme(deuxiemeEpee);
        guerrier2.ajouterArme(troisiemeEpee);
        guerrier2.ajouterArme(baton1);
        magicien1.ajouterArme(premiereEpee);
        magicien1.ajouterArme(baton2); 
        magicien1.ajouterArme(baton3);
        
        
        ArrayList<Object> listePersonnages = new ArrayList<>();
        listePersonnages.add(magicien1);
        listePersonnages.add(guerrier2);
       
        int tailleDeTab2 = listePersonnages.size();
        for (int i=0; i<tailleDeTab2;i++){
            System.out.println(listePersonnages.get(i));}
        
        
        
        

        /*int tailleDeTab2 = tabArmes.size();
        for (int i=0; i<tailleDeTab2;i++){
            System.out.println(tabArmes.get(i));}*/
    }
    
}
