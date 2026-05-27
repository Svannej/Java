package Esercitazione3;

import java.util.HashSet;
import java.util.Set;

public class Es4punto23 {
    
    public static void main(String args[]){

        Set<String> mioSet = new HashSet<>();

        mioSet.add("Arriva");
        mioSet.add("la");
        mioSet.add("luce");
        mioSet.add("su");
        mioSet.add("Urano");
        //aggiungiamo luce una seconda volta
        mioSet.add("luce");

        //stampiamo tutto il set
        System.out.println(mioSet);

        //notiamo che la secondoa volta la parola "luce" non viene inserita e
        //tutte le parole vengono stampate in ordine casuale, non di inserimento

    }
}
