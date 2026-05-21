package Esercitazione3;
import java.util.ArrayList;
import java.util.List;

public class Principale {
    public static void main(String[] args) {
        
        //crea la lista
        List<Persona> miaLista = new ArrayList<>();
        
        //aggiungi alcuni oggetti alla lista con "add"
        Persona p1 = new Persona("Pietro", "Sermonti", 54);
        miaLista.add(p1);
        Persona p2 = new Persona("Rosario", "Fiorello", 5);
        miaLista.add(p2);
        Persona p3 = new Persona("Tim", "Bergling", 1000);
        miaLista.add(p3);


        //verifica la dimensione della lista con il metodo "size"
        System.out.println("la dimensione della lista è: " + miaLista.size());


        //prende l'i-esimo elemento dalla lista con il metodo "get" e lo stampa

        //"get" Ma cosa ti restituisce esattamente? Poiché hai creato la lista dichiarando
        // esplicitamente che contiene persone (List<Persona>),
        // Java sa per certo che il risultato di miaLista.get(i)
        //è un oggetto di tipo Persona (ad esempio, il tuo Pietro Sermonti).

        //(uso il metodo toString che ho scritto in override nella class Persona)
        Persona scelto = miaLista.get(1);
        System.out.println("elemento due è: " + scelto.toString());


        //elimina l'i-esimo elemento dalla lista con "remove"
        miaLista.remove(1);

        for(int i = 0; i < miaLista.size(); i++){
            System.out.println("Elemento numero [" + i + "] è: " + miaLista.get(i).toString());
        }


        //cancella la lista con "clear" e assicurati che sia effettivamente vuota

        miaLista.clear();
        System.out.println("ora la lista ha dimensione " + miaLista.size());

    }


}