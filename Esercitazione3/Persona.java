package Esercitazione3;

public class Persona {
   
    //essendo delle variabili sensibili, a fini di sicurezza
    //vanno gestite come private
    private String nome;
    private String cognome;
    private int eta;


    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }


    @Override
    public String toString() {

        String descrizione = "Nome = " + nome + " Cognome = " + cognome + " Età = " + eta;
        return descrizione;

    }

    @Override
    public boolean equals(Object obj){

        //essendo che sto facendo un OVERRIDE di "equals" che è un metodo
        //già esistente che accetta variabili di tipo Object, quindi devo infilare
        //questa, devo controllare che la variabile in entrata sia una persona

        //se è una persona posso fare il "Casting" e gestirla come Persona

        //Checking
        if (!(obj instanceof Persona)) {
            System.out.println("ERRORE, la variabile in entrata non è una persona");
            return false;
        }

        //Casting
        Persona pInEntrata = (Persona) obj;

        if (nome == pInEntrata.nome && cognome == pInEntrata.cognome && eta == pInEntrata.eta) {
            return true;
        }
        else{
            return false;
        }
    }


}
