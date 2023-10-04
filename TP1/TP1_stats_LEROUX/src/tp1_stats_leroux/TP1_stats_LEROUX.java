/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* 
Baptiste LEROUX
TDB
TP1
Statistiques
04/10/23
*/
package tp1_stats_leroux;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_stats_LEROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] tab = new int [6];
      
      System.out.println("saisissez un nombre entier");
      int m =0;
      Scanner sc = new Scanner(System.in);
      m = sc.nextInt();
      
      
      for (int i=0;i<=m;i++) {
          Random generateurAleat = new Random();
          int n = generateurAleat.nextInt(5);
          tab[n]+=1;
      }
      for (int i = 0; i < (tab.length); i++) {
        System.out.print((tab[i])/(m*0.1)*100*0.1+" %");
        if (i < tab.length - 1) {
        System.out.print(" ");
    }
}
    }
    
}
