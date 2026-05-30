package Esercitazione4;

import java.util.ArrayList;
import java.util.Random;

public class Bussolotto {

    ArrayList <Integer> numeri = new ArrayList<>();

    //costruttore che assegna i numeri da 1 a 90
    public Bussolotto(){
    for (int i = 1; i <= 90 ; i++ ){
        numeri.add(i);
    }
    
    }

    public int dammiNumero(){

        int numero = new Random().nextInt(numeri.size()) ;
        return numeri.remove(numero);
    }

}