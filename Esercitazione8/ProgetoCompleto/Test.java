package Esercitazione8.ProgetoCompleto;

import Esercitazione8.ProgetoCompleto.Professore.Dipartimento;
import Esercitazione8.ProgetoCompleto.Professore.Ruolo;
import Esercitazione8.ProgetoCompleto.Studente.Corso;

public class Test {
    public static void main(String args[]){

        GestioneCorso corso = new GestioneCorso();
        //Aggiungiamo 2 Professori, uno studente triennale e uno magistrale
        Professore Sergio = new Professore("Sergio", "Astolfi", 47, "5/04/2001", Ruolo.PROFESSORE_ASSOCIATO, Dipartimento.DICAM, 1789.59);
        Professore Gino = new Professore("Gino", "Paoli", 99, "15/08/1989", Ruolo.RICERCATORE, Dipartimento.DICAM, 1789.59);
        StudenteTriennale Manuel = new StudenteTriennale("Manuel", "Roccaforte", 21, "16/06/2008", "40181", Corso.L_FISICA, 546.16, "LiceoScientifico");
        StudenteMagistrale Ezio = new StudenteMagistrale("Ezio", "Auditore", 100, "11/02/1559", "16231" , Corso.L_FILOSOFIA, 45164.1, Corso.L_FISICA);
        
        
        
        try {
            corso.aggiungi(Ezio);
            corso.aggiungi(Gino);
            corso.aggiungi(Sergio);
            corso.aggiungi(Manuel);
        } catch (Exception e) {
            System.out.println("Errore nella registrazione");
        }

        corso.salarioTot();
        corso.quote();

        corso.stampatutto();

        System.out.println(Ezio);
        System.out.println(Gino);

    }

}
