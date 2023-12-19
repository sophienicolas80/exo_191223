package exo1;

import java.util.Scanner;

//Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer de sa catégorie sachant que les catégories sont les suivantes: 
//"poussin de 6 a 7 ans"
//"pupille de 8 a 9 ans "
//"minime de 10 a 11 ans "
//" cadet après 12 ans ".

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre âge, svp? \n");
        int number14 = scanner.nextInt();
        if (number14 < 6) {
            System.out.println("Votre âge " + number14 + " est hors catégorie");
        } else if (number14 >= 6 && number14 <= 7) {
            System.out.println("Votre catégorie est poussin pour votre âge " + number14);
        } else if (number14 >= 8 && number14 <= 9) {
            System.out.println("Votre catégorie est pupille pour votre âge " + number14);
        } else if (number14 >= 10 & number14 <= 11) {
            System.out.println("Votre catégorie est minime pour votre âge " + number14);
        } else {
            System.out.println("Votre catégorie est cadet pour votre âge " + number14);
        }
        scanner.close();
    }
}
