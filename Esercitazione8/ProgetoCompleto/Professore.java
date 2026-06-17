package Esercitazione8.ProgetoCompleto;

public class Professore extends Persona{

    public enum Dipartimento{
        DIID,DICAM,DIFC,DMI,DISTEM
    }

    public enum Ruolo{
        RICERCATORE,PROFESSORE_ASSOCIATO,PROFESSORE_ORDINARIO
    }


    private String dataAssunzione;
    public Ruolo ruolo;
    public Dipartimento dipartimento;
    private double stipendio;

    //costruttore del professore

    public Professore(String nome, String cognome,int eta, String dataAssunzione, Ruolo ruolo, Dipartimento dipartimento,double stipendio){

        super(nome, cognome, eta);
        this.dataAssunzione = dataAssunzione;
        this.ruolo = ruolo;
        this.dipartimento = dipartimento;
        this.stipendio = stipendio;
    }

    public String getDataAssunzione() {
        return dataAssunzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double newStipendio){
        if (newStipendio >= 0) {
            this.stipendio = newStipendio;
        }

        else{
            throw new IllegalArgumentException("Lo stipendio non può essere negativo / nullo");
        }
    
    }

}