package Esercitazione8.ProgetoCompleto;

public class Studente extends Persona {
    
    public enum Corso{
        L_INFORMATICA,L_ECONOMIA,L_FISICA,L_MATEMATICA,L_FILOSOFIA
    }

    private String dataIscrizione;
    private String matricola;
    private Corso corsoDiLaurea;
    private double contributo;

    public Studente(String nome, String cognome, int eta, String dataIscrizione, String matricola, Corso corsoDiLaurea, double contributo){
        super(nome, cognome, eta);
        this.dataIscrizione = dataIscrizione;
        this.matricola = matricola;
        this.corsoDiLaurea = corsoDiLaurea;
        this.contributo = contributo;
    }

    //setters

    public void setContributo(double contributo) {
        this.contributo = contributo;
    }
    public void setCorsoDiLaurea(Corso corsoDiLaurea) {
        this.corsoDiLaurea = corsoDiLaurea;
    }
    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    //getters
    public double getContributo() {
        return contributo;
    }
    public Corso getCorsoDiLaurea() {
        return corsoDiLaurea;
    }
    public String getDataIscrizione() {
        return dataIscrizione;
    }
    public String getMatricola() {
        return matricola;
    }
    

}
