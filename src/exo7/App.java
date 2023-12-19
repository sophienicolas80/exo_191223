package exo7;

import java.util.Scanner;
//Écrivez un programme Java qui accepte trois nombres et affiche "Tous les nombres sont égaux" si les trois nombres sont égaux,
// "Tous les nombres sont différents" si les trois nombres sont différents et sinon "Ni tous ni égaux ni différents".


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Veuillez saisir un premier nombre, svp? ");
        float a = scanner.nextFloat();
        System.out.println("Veuillez saisir un deuxième nombre, svp?");
        float b = scanner.nextFloat();
        System.out.println("Veuillez saisir un troisième nombre, svp?");
        float c = scanner.nextFloat();
       
        if (a==b && b ==c) {
            System.out.println("Tous les nombres sont égaux");
        }
        else if (a !=b && b!=c){
            System.out.println("Tous les nombres sont différents \n " );
        }
        else {
            System.out.println("Ni tous ni égaux ni différents \n ");
        }
        scanner.close();
    }
}
