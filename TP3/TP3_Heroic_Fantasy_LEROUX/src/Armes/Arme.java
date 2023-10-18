/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author bapti
 */
abstract class Arme {
    
    
    String nom;
    int niveauAttaque;
    
    public Arme( String unNom, int unEntier) {
    nom = unNom;
    niveauAttaque =unEntier;
    if (niveauAttaque > 100){
        niveauAttaque = 100;}
    else if (niveauAttaque<0){
        niveauAttaque =0;}
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + ", niveau d'attaque : " + niveauAttaque;
    return chaine_a_retourner ;
    }

    public void lireNom() {
        System.out.println(nom);
    }   
     
    public void lireNiveauAttaque(){
        System.out.println(niveauAttaque);
    } 
}
