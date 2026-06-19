package Esercitazione9;

import java.util.HashMap;

public class FrequenzaParole {
    public static void main(String[] args) {
        
        HashMap <String, Integer> statistica = new HashMap<>();

        String testo = "Scrivete un programma che , utilizzando il metodo split su una stringa contenente il testo di questo esercizio , determina il numero totale di parole presenti nel testo e la parola che compare con maggiore frequenza . Potreste anche pensare di utilizzare una HashMap < String , Integer > per memorizzare la frequenza di ciascuna parola utilizzando la parola stessa come chiave . Stampate , infine , la frequenza di ciascuna parola ( è sufficiente stampare l intera HashMap ) . Per inserire una coppia chiave , valore nella mappa potete usare il metodo put ( K key , V value ) mentre per leggere il valore corrispondente a una chiave il metodo V get ( Object key ) .";

        //dobbiamo usare "split che essenzialmente crea un array a cui assegna una parola ad ogni cella, in base agli spazi. quindi spaziamo bene il testo"

        String[] splittato = testo.split(" ");

        System.out.println("le parole totali sono : " + splittato.length + " (comprese virgole, punti. parentesi e caratteri vari)");
        

        //stampo l'array elemento per elemento per capire come è fatto
        System.out.println("Stampo array:");

        for(String parola : splittato){
            System.out.println(parola);
        }

        //alloco ogni elemento dell'array nella hashmap


        for(String parola : splittato){
            //controllare se la parola è già nella mappa
            if (statistica.containsKey(parola)) {
                //la parola è già contenuta, quindi aumento il contatore
                statistica.put(parola, statistica.get(parola)+1);
            }
            else{
                //la parola non è contenuta, quindi la putto
                statistica.put(parola, 1);
            }
        }

        //stampare tutta la mappa

        System.out.print(statistica);
    }
}
