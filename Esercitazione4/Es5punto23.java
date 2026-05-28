package Esercitazione4;

import java.util.Scanner; 
import java.util.ArrayList;

public class Es5punto23 { 

    public static void main(String args[]) { 


        ArrayList<String> paroleVietate = new ArrayList<>(); 
        paroleVietate.add("palla");
        paroleVietate.add("benzina");

        Scanner scanner = new Scanner(System.in); 

        String stringa = ""; 

        System.out.println("Digita qualcosa e batti il tasto " 

        + "\"INVIO\", oppure scrivi \"fine\" per terminare " 

        + "il programma");  

        // Assegniamo a stringa l'input utente e testiamo se vale "fine" 

        while(!(stringa = scanner.next()).equals("fine")) { 

            if (!paroleVietate.contains(stringa) ) {

                System.out.println("Hai digitato " + stringa.toUpperCase() + "!"); 
            
            }

            else{
                System.out.println(" *** ");
            }
  } 

  System.out.println("Fine programma!"); 

} 
}