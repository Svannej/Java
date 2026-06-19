package Esercitazione9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaCircolare {
    public static void main(String[] args) {
        
        //realizzare la logica di menù:
        //1)spostarsi avanti
        //2)spostarsi indietro
        //3)inserire un elemento alla posizione corrente
        //4)rimuovere un elemento dalla posizione corrente
        //5)leggere l'elemento alla posizione corrente

        ArrayList <String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean inCircolo = true;
        int xAttuale = 0;

        while (inCircolo) {

            System.out.println("=MENU=");
            System.out.println("1) <- ");
            System.out.println("2) -> ");
            System.out.println("3) add.element");
            System.out.println("4) remove.element ");
            System.out.println("5) print.element ");

            System.out.println("currently on [ " + xAttuale + " ]");
            int scelta = 0;
            try {
                scelta = scanner.nextInt();
                scanner.nextLine(); //serve a mangiare l'invio e pulire il buffer
                
            } catch (InputMismatchException e) {
                System.out.println("stai giocando col fuoco");
                scanner.nextLine();
            }
            
            switch (scelta) {
                
                case 1 -> {
                    //se torno indietro ma sono a 0, vado al massimo
                    if (array.isEmpty()) {
                        System.out.println("ARRAY VUOTO");
                    }

                    else if (xAttuale == 0) {
                        xAttuale = array.size() - 1;
                    }
                    else{
                        xAttuale -= 1;
                    }
                }
                
                case 2 -> {
                    
                    if (array.isEmpty()) {
                        System.out.println("ARRAY VUOTO");
                    }
                    //se vado avanti ma sono al limite trno a capo
                    else if(xAttuale == array.size() - 1){
                        System.out.println("torno a capo");
                        xAttuale = 0;
                    }
                    else{
                        xAttuale += 1;
                    }

                }
            
                case 3 -> {
                    System.out.println("String da inserire:");
                    System.out.println(">");
                    String valore = scanner.nextLine();
                    array.add(xAttuale, valore);
                }
                
                case 4 -> {
                    
                    if (array.isEmpty()) {
                        System.out.println("ARRAY VUOTO");
                    }

                    else{
                        array.remove(xAttuale);
                        System.out.println("Elemento Rimosso");
                    }

                }

                case 5-> {

                    if (array.isEmpty()) {
                        System.out.println("ARRAY VUOTO");
                    }

                    System.out.println("=====");
                    System.out.println("[" + xAttuale + "] : " + array.get(xAttuale) );
                    System.out.println("=====");


                }


                default ->{
                    System.out.println("Scelta non valida\n");
                }
            }



        }

    }
}
