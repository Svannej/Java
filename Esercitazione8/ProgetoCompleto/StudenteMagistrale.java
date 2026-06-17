package Esercitazione8.ProgetoCompleto;

public class StudenteMagistrale extends Studente {

    static int cfu = 120;
    Corso corsoTriennale;

    public StudenteMagistrale(String nome, String cognome, int eta, String dataIscrizione, String matricola, Corso corso, double contributo, Corso corsoTriennale){
        super(nome, cognome, eta, dataIscrizione, matricola, corso, contributo);
        this.corsoTriennale = corsoTriennale;
    }
    
}
