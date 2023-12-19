package exo2;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            
            s = s + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("la somme est " +s);
        scanner.close();
    }
}
