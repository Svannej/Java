package Esercitazione2;


//così importo la libreria
import java.util.Random;

public class Dado {

    //stiamo creando un generatore usando la classe random
    //così facendo generatore potrà usare tutti i metodi che ci sono
    //nella classe random
    Random generatore;

    //costruttore
    public Dado(){
        generatore = new Random();
    }

    public int lancia(){
        return generatore.nextInt(6) + 1;
    }

    
}
