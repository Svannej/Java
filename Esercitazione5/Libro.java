package Esercitazione5;

public class Libro {

    //dobbiamo creare un'array per definire i generi letterari

    //static: fa si che l'array venga creato una sola volta e sia universale per tutti
    //quindi ogni volta che creo un libro non viene creato un nuovo array da cui
    //si prende il genere ma funge da array globale

    //final: non si puo trasformare niente, l'array diventa una costante, un array non modificabile


    //utilizzo il "private" perché la consegna chiede che la classe
    //sia "incapsulata"

    private static final String[] GENERI_LETTERARI = {"romanzo" , "thriller" , "saggio", "manuale"};
    
    private int pagine; 
    private String titolo;
    private String genere;
    
    public Libro(int pagine, String titolo, String Genere_Letterario){
        this.pagine = pagine;
        this.titolo = titolo;

        //lo impostiamo con un metodo perché dobbiamo controllare
        //che il genere inserito sia valido
        setGenere(Genere_Letterario);

    } 
    

    public void setGenere(String Genere_Letterario_Inserito){

        for (String genereConsiderato : GENERI_LETTERARI) {
            if (genereConsiderato.equalsIgnoreCase(Genere_Letterario_Inserito)) {
                this.genere = Genere_Letterario_Inserito;
                return;
            }
        }
        //nel caso in cui il genere inserito non esistesse, impostiamo "undefined"

        System.out.println("Genere Specificato non trovato, impostando genere undefined momentaneamente");
        this.genere = "undefined";



    }

    public void stampa(){
        System.out.println("_____LIBRO_____");
        System.out.println("titolo: " + titolo);
        System.out.println("npagine: " + pagine);
        System.out.println("genre: " + genere);
    }

}
