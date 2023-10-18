/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bapti
 */
abstract class Personnage {

    String nom;
    int niveauVie;

    public Personnage(String unNom, int unNiveauVie) {
        nom = unNom;
        niveauVie = unNiveauVie;

    }
        
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + ", niveau de vie : " + niveauVie;
    return chaine_a_retourner ;
    }

    
    public void lireNom() {
        System.out.println(nom);
    }   
     
    public void lireNiveauVie(){
        System.out.println(niveauVie);
    } 
}
