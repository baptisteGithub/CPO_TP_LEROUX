/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;

/**
 *
 * @author bapti
 */
abstract class Personnage {

    String nom;
    int niveauVie;
     static int compteurPersonnages = 0;
    
    static void nbPersonnages(){
        System.out.println(compteurPersonnages);
    }

    public Personnage(String unNom, int unNiveauVie) {
        nom = unNom;
        niveauVie = unNiveauVie;
        compteurPersonnages = compteurPersonnages+1;

    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + ", niveau de vie : " + niveauVie+", arme en main : "+Arme_En_Main;
        return chaine_a_retourner;
    }

    public void lireNom() {
        System.out.println(nom);
    }

    public void lireNiveauVie() {
        System.out.println(niveauVie);
    }

    ArrayList<Object> tabArmes = new ArrayList<>();

    public void ajouterArme(Object uneArme) {
        if (tabArmes.size() < 5) {
            tabArmes.add(uneArme);
        }
    }

    String Arme_En_Main = "NULL";

    public String getArme_En_Main() {
        return Arme_En_Main;
    }

   
    public void equiperArme(String uneArme2) {
        int tailleDeTab = tabArmes.size();
        boolean r = false;
        for (int i = 0; i < tailleDeTab; i++) {
            Object variable = tabArmes.get(i);
            if (variable.equals(uneArme2)) {
                System.out.print("Arme trouvee et affectee");
                Arme_En_Main = uneArme2;
                r = true;
                break;
            }
        }
        if (r == false) {
            System.out.print("Arme non trouvee");
        }

    }

    
    
}
