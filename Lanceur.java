/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pj_cumul;

import java.util.Scanner;
/**
 *
 * @author Nolan
 */
public class Lanceur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float nb;
        int choix;
        int nbchoix;
        float total = 0;
        float moyenne = 0;
        int i;
        
        System.out.println("Bienvenue dans le calcul de moyenne, tapez 1 pour commencer");
        choix = sc.nextInt();
        
        if (choix == 1) {
            System.out.println("Combien de notes voulez-vous saisir ?");
            nbchoix = sc.nextInt();
            
            for (i=1; i<=nbchoix; i++) {
                System.out.println("Note numero "+i);
                nb = sc.nextInt();
                
                total = total+nb;
            }
            
                moyenne = total/nbchoix;
            
            System.out.println("La moyenne est de "+moyenne+"/20");
        }
    }
    
}
