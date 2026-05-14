package Esercitazione1;

//qui definiamo la classe e il costruttore
public class Film {
    String titolo;
    String genere;
    int durata;

    //costruttore
    public Film(String titolo, String genere, int durata){
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
    }
    
    //di seguito definiamo il METODO "stampaDettagli"
    //il metodo sarebbe una simil-funzione
    
    // Nota: non ha 'static' perché ogni film stampa i PROPRI dati

    public void stampaDettagli(){
        System.out.println("TITOLO: " + titolo + " GENERE: " + genere + " DURATA: " + durata);
    
    }
}
