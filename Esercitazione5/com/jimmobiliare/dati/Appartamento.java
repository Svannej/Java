package Esercitazione5.com.jimmobiliare.dati;

public final class Appartamento extends Immobile {
    
    private int numeroVani;
    private int piano;

    public Appartamento(String nome, double prezzo, double metriQuadri, String indirizzo , int numeroVani, int piano){
    super(nome, indirizzo, prezzo, metriQuadri);
    this.numeroVani = numeroVani;
    this.piano = piano;
    }

    @Override
    public String toString(){
        return "APPARTAMENTO -> " + super.toString() + " | Vani: " + numeroVani + " | Piano: " + piano;
    }

}
