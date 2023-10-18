/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author bapti
 */
public class Epee extends Arme {
    
    int indiceFinesse;

    public Epee(String unNom, int unEntier, int unEntierFinesse) {
       super (unNom, unEntier);
       indiceFinesse = unEntierFinesse;
       if (indiceFinesse > 100){
        indiceFinesse = 100;}
        else if (indiceFinesse<0){
            indiceFinesse =0;}}
        
}
    
    
