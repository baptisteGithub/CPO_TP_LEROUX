/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author bapti
 */
public class Baton extends Arme{
    
    public Baton(String unNom, int unEntier, int unAge) {
        super(unNom, unEntier);
        int age = unAge;
        if (age > 100){
        age = 100;}
        else if (age<0){
            age =0;}}


}
    

