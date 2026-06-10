package Esercitazione5.com.jimmobiliare.dati;

import java.util.ArrayList;

public final class Palazzo extends Immobile {
    
    private ArrayList<Appartamento> listaAppartamenti;

    //il palazzo è fatto da appartamenti e garage
    public Palazzo(String nome,  String indirizzo,double prezzo , double metriQuadri){

    super(nome, indirizzo, prezzo, metriQuadri);
        //creiamo una lista appartamenti vuota
        this.listaAppartamenti = new ArrayList<>();
        
    }

    public void aggiungiAppartamento(Appartamento newAppartamento){
        listaAppartamenti.add(newAppartamento);
    }

    @Override
    public String toString(){
        String info;

        info = "PALAZZO -> " + super.toString() + "Numero Appartamenti: " + listaAppartamenti.size();

        for (Appartamento appartamento : listaAppartamenti) {
            info += "\n   -  " + appartamento.toString();
        }

        return info;
    }

}
