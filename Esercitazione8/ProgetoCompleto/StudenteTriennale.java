package Esercitazione8.ProgetoCompleto;

public class StudenteTriennale extends Studente {
    
    public static int cfu = 180;
    String scuolaSuperiore;

    public StudenteTriennale(String nome, String cognome, int eta, String dataIscrizione, String matricola,Corso corsoDiLaurea, double contributo, String scuolaSuperiore){
        super(nome, cognome, eta, dataIscrizione, matricola, corsoDiLaurea, contributo);
        this.scuolaSuperiore = scuolaSuperiore;
    }


}
