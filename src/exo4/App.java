package exo4;

import java.util.Scanner;
//Une boutique propose à ses clients, une réduction de 15% pour les montants d’achat supérieurs à 200 Euros. 
//Écrire un programme en Java permettant de saisir le prix total HT et de calculer le  montant TTC en prenant en compte la réduction et la TVA=20%.


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Veuillez saisir le prix total HT, svp? ");
        double prixHT = scanner.nextDouble();
        if (prixHT >200) {
            double reduc = 0.15 *prixHT;
            double newpx = prixHT - reduc;
            System.out.println("reduc= " +reduc);
            System.out.println("newpx= " +newpx);
            double tva = 0.2*newpx;
            double prixTTC = newpx + tva;
            System.out.println("le prix TTC avec la réduction de 15% est " +prixTTC);
            }
        else {
            double tva = 0.2*prixHT;
            double prixTTC = prixHT + tva;
            System.out.println("le prix TTC sans la réduction de 15% est " +prixTTC );

        }
        scanner.close();
    }
}
