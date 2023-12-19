package exo3;

import java.util.Scanner;
//Écrire  un programme en Java  qui  permet d'échanger le contenu de deux entiers  A et B  
//saisis par l'utilisateur. et afficher ces entiers  après l’échange.


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Veuillez saisir un entier A, svp? ");
        int a = scanner.nextInt();
        System.out.println("Veuillez saisir un entier B, svp?");
        int b = scanner.nextInt();
        int a1 = a;
        a = b ;
        System.out.println("a= " +a);
        b = a1;
        System.out.println("b= " +b);
        scanner.close();

    }
}
