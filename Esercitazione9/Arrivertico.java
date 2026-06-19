package Esercitazione9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Arrivertico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque <String> pila = new LinkedList<>();

        System.out.println("Inserire parola per parola, terminare con un \".\" ");
        

        boolean punto = false;

        //creiamo 
        while(punto == false){

            String parola = scanner.next();

            if (parola.endsWith(".")) {
                punto = true;
                pila.push(parola);
            }
            else{

                pila.push(parola);

            }

        }

        //sputiamo le parole 

        System.out.println("==== OUTPUT ====");


        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        scanner.close();

    }    


}
