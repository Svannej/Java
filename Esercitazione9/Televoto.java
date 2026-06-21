package Esercitazione9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class Televoto {
    public static void main(String args[]){

        boolean esci = false;
        Scanner scanner = new Scanner(System.in);

        //creiamo una lista con tutti i numeri di telefono
        HashMap <String , Integer> listaVotanti = new HashMap<>();

        //creo una hashMap con i cantanti e il loro numero di voti

        HashMap <Integer , Integer> listaVoti = new HashMap<>();
        // voti - numero
        
        //inizializzo la lista con i numeri

        for(int i = 1 ; i<=15 ; i++){
            listaVoti.put(i, 0);
        }

        //una ulteriore hashMap per associare a ogni numero in gara un cantante.
        //questa hashMap ci servirà alla fine per stampare tutti i nomi dei cantanti con i rispettivi voti

        HashMap <Integer , String> listaCantanti = new HashMap<>();

        //inizializzo i cantanti

        listaCantanti.put(1, "Mario");
        listaCantanti.put(2, "Luigi");
        listaCantanti.put(3, "Enemy");
        listaCantanti.put(4, "Coldplay");
        listaCantanti.put(5, "Linkin Park");
        listaCantanti.put(6, "Frate Pietro");
        listaCantanti.put(7, "Sarmoiraghi");
        listaCantanti.put(8, "Viganò");
        listaCantanti.put(9, "Poltrone");
        listaCantanti.put(10, "Sofa");
        listaCantanti.put(11, "Stromae");
        listaCantanti.put(12, "Regina Elisabetta");
        listaCantanti.put(13, "Matthew Sanders");
        listaCantanti.put(14, "Atti Osceni in Luogo Pub");
        listaCantanti.put(15, "Atti Pubici in Luogo Osceno");

        while (!esci) {

            int scelta = 0;
            System.out.println("=== TELEVOTO ===");
            System.out.println("1) inserire voto");
            System.out.println("2) numero voti ricevuti");
            System.out.println("3) Classifica (termina esecuzione)");

            scelta = scanner.nextInt();
           //scanner.next(); //pulizia buffer

            switch (scelta) {
                case 1 -> {
                    //per inserire il voto si chiede il numero di telefono
                    String numeroTelefono = scanner.nextLine();

                    //se il numero c'è ma i voti sono già 5
                    if (listaVotanti.containsKey(numeroTelefono) && listaVotanti.get(numeroTelefono) == 5) {
                        
                        System.out.println("= QUESTO NUMERO DI TELEFONO HA GIà VOTATO 5 VOLTE =");
                        continue; // continue esce dallo switch
                    }
                    
                    //se il numero c'è e i voti sono minori di 5
                    else if (listaVotanti.containsKey(numeroTelefono) && listaVotanti.get(numeroTelefono) < 5) {
                        System.out.println("il numero inserito: " + numeroTelefono + " ha effettuato voti: " + listaVotanti.get(numeroTelefono));
                        listaVotanti.put(numeroTelefono, +1);
                    }
                    
                    else{
                        //se non c'è il numero, quindi è un nuovo votante, lo inserisco e il suo counter va a 1
                        System.out.println("il numero inserito: " + numeroTelefono + " vota per la prima volta");
                        listaVotanti.put(numeroTelefono, 1);
                    }

                    //stampo la lista dei cantanti
                    System.out.println("= INSERIRE PREFERENZA TRA I CANTANTI =");
                    System.out.println("= 1) Mario =");
                    System.out.println("= 2) Luigi =");
                    System.out.println("= 3) Enemy =");
                    System.out.println("= 4) Coldplay =");
                    System.out.println("= 5) Linkin Park =");
                    System.out.println("= 6) Frate Pietro =");
                    System.out.println("= 7) Sarmoiraghi =");
                    System.out.println("= 8) Viganò =");
                    System.out.println("= 9) Poltrone =");
                    System.out.println("= 10) Sofà =");
                    System.out.println("= 11) Stromae =");
                    System.out.println("= 12) Regina Elisabetta =");
                    System.out.println("= 13) Matthew Sanders =");
                    System.out.println("= 14) Atti Osceni in Luogo Pub =");
                    System.out.println("= 15) Atti Pubici in Luogo Osceno =");
                    
                    boolean valido = false;
                    do{
                        System.out.println(">");
                        int preferenza = scanner.nextInt();
                        scanner.nextLine();//pulisco il buffer

                        if (preferenza > 0 && preferenza <= 15) {
                            valido = true;

                            int votiAttuale = listaVoti.get(preferenza);
                            listaVoti.put(preferenza, votiAttuale+1);

                            System.out.println("Hai votato per : " + listaCantanti.get(preferenza));

                        }
                        else{
                            System.out.println("preferenza non valida, riprova");
                        }

                    }while(!valido);

                }

                case 2 ->{
                    
                    //stampare il numero di voti ricevuti fino a quel momento da ogni cantante
                    System.out.println("= CLASSIFICA =");
                    for(int i = 1; i <= 15; i++){
                        System.out.println("==----==");
                        System.out.println("> " + listaCantanti.get(i) + " VOTI: " + listaVoti.get(i));
                        System.out.println("==----==");
                    }
                }

                case 3 ->{

                    //ordinare per numero di voti


                }

                default -> {
                    System.out.println("Errore nell'inserimento, riprovare");
                }
            }




        }

    } 
}
