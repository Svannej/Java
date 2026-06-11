package Esercitazione7;

import java.util.ArrayList;

public class Scrivania {
 
    public ArrayList <Appoggiabile> oggetti;
    

    public Scrivania(){
        this.oggetti = new ArrayList<>();
    }

    //metodo per aggiungere oggetto
    public void appoggia(Appoggiabile oggetto){
        oggetti.add(oggetto);
    }


    //metodo per vedere che oggetti ci sono appoggiati
    public ArrayList<Appoggiabile> getOggetti() {
        return oggetti;
    }
    
}
