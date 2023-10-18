/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leroux;

import Armes.Baton;
import Armes.Epee;
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
        Epee premiereEpee = new Epee("Excalibur",7,5);
        Epee deuxiemeEpee = new Epee("Durandal", 4,7);
        Baton baton1 = new Baton("Chene",4,5);
        Baton baton2 = new Baton("Charme",5,6);
        
        
        /*System.out.println(premiereEpee);
        System.out.println(deuxiemeEpee);
        System.out.println(baton1);
        System.out.println(baton2);*/
        
        
        ArrayList<Object> listeArmes = new ArrayList<>();
        listeArmes.add(premiereEpee);
        listeArmes.add(deuxiemeEpee);
        listeArmes.add(baton1);
        listeArmes.add(baton2);
        
        int tailleDeTab = listeArmes.size();
        for (int i=0; i<tailleDeTab;i++){
            System.out.println(listeArmes.get(i));
        }
        
    }
    
}
