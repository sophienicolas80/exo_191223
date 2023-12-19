package exo6;

import java.util.Scanner;
//Écrivez un programme Java qui demande deux chiffres à un utilisateur, pour afficher la somme (addition), multiplier, soustraire, diviser et le reste.v


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Veuillez saisir un chiffre A, svp? ");
        float a = scanner.nextFloat();
        System.out.println("Veuillez saisir un chiffre B, svp?");
        float b = scanner.nextFloat();
        float somme = a+b;
        System.out.println("la somme de A + B est \n " +somme  );
        float soustraction = a-b;
        System.out.println("la soustraction de A - B est \n" +soustraction);
        float multiplication = a*b;
        System.out.println("la multiplication de A * B est \n " +multiplication );
        if (b==0) {
            System.out.println("la division par 0 est impossible");
        }
        else {
            float division = a/b;
            System.out.println("la division de A / B est \n " +division );
        }
        scanner.close();
    }
}
