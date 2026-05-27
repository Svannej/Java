package Esercitazione3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; // Importante! Ci serve per il metodo sort()

public class Es4punto24 {
    public static void main(String[] args) {
        
        List<String> miaLista = new ArrayList<>();
        miaLista.add("Arriva");
        miaLista.add("la");
        miaLista.add("luce");
        miaLista.add("su");
        miaLista.add("Urano");
        
        //prima dell'ordinamento
        System.out.println(miaLista);

        Collections.sort(miaLista);

        System.out.println(miaLista);


    }
}
