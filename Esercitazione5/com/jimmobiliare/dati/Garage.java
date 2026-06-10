package Esercitazione5.com.jimmobiliare.dati;

public final class Garage extends Immobile {
    
    public int postiAuto;

    public Garage(String nome, double prezzo, double metriQuadri, String indirizzo, int postiAuto){

    super(nome, indirizzo, prezzo, metriQuadri);        
    this.postiAuto = postiAuto;

    }

    @Override
    public String toString(){
        return "GARAGE -> " + super.toString() + " | Adatto per: " + postiAuto + " Auto";
    }

}
