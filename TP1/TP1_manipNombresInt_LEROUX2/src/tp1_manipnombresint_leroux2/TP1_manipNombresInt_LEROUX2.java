/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*TP1
MAnip Nombres Int
Baptiste LEROUX
TDB
26/09/23
*/
package tp1_manipnombresint_leroux2;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_manipNombresInt_LEROUX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int entier1;
        int entier2;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Saisissez un premier entier");
        entier1 = sc.nextInt();
        System.out.println("Saisissez un second entier");
        entier2 = sc.nextInt();
        
        
        System.out.println(entier1+" et "+entier2);
        System.out.println("La somme de ces deux nombres est : "+(entier1+entier2));
        System.out.println("La difference de ces deux nombres est : "+(entier1-entier2));
        System.out.println("Le produit de ces deux nombres est : "+(entier1*entier2));
        System.out.println("La division de ces deux nombres est : "+(entier1/entier2)+" et son reste est "+(entier1%entier2));
        
        
        
        
                
    }
    
}
