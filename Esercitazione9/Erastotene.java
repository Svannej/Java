package Esercitazione9;

import java.util.Set;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Erastotene {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire numero: ");
        
        int n = 0;
        
        try{

            n = scanner.nextInt();

            //InputMismatchException è il catch generale dello scanner se sbagli a inserire valori
        }catch(InputMismatchException e){
            System.out.println("Non sbagliare a inserire cose! devi inserire un intero. chiudo il programma pezzo di scemo.");

            scanner.close();

        }


        //creare un set di interi con tutti i numeri fino a "n"

        Set <Integer> numeriPrimi = new HashSet<>();

        for(int i = 2; i <= n ; i++){
            numeriPrimi.add(i);
        }

        //come da consegna, rimuoviamo tutti i numeri non necessari

        //parto da 2 e rimuovo tutti i suoi multipli, avanzo e rimuovo tutti i suoi multipli ecc...

        for(int i = 2; i <= n/2; i++){

            if (numeriPrimi.contains(i)) {
                for(int j = i+1; j <= n; j++){

                    if (j % i == 0) {
                        numeriPrimi.remove(j);
                    }
                
                } 
            }

        }

        System.out.println("I numeri primi fino a" + n + " sono : ");
        System.out.println(numeriPrimi);

    }


}
