package Esercitazione5.com.jimmobiliare.dati;

public abstract sealed class Immobile permits Appartamento, Garage, Palazzo {
    private String nome;
    private double prezzo;
    private double metriQuadri;
    private String indirizzo;

    public Immobile(String nome, String indirizzo, double prezzo, double metriQuadri) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prezzo = prezzo;
        this.metriQuadri = metriQuadri;
    }        

    //i getters

    public String getIndirizzo() {
        return indirizzo;
    }
    public double getMetriQuadri() {
        return metriQuadri;
    }
    public String getNome() {
        return nome;
    }
    public Double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Indirizzo: " + indirizzo + " | Prezzo: " + prezzo + "eur" + "| Metri Quadri: " + metriQuadri + "m^2 ";
    }
}
