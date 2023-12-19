package exo5;

import java.util.Scanner;
//Écrivez un programme Java qui demande son nom à l’utilisateur et qui affiche «Bonjour» à l'écran et le nom sur une ligne distincte


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom, svp?");
        String nom = scanner.nextLine();
        System.out.println("Bonjour \n"  +nom);
        scanner.close();
    }
}
