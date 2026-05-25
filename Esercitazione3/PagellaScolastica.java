package Esercitazione3;

public class PagellaScolastica {
    public static void main(String[] args) {

        Studente giovanni = new Studente("Giovanni", "Battista", "5A");
        String[][] voti = {
            {"Italiano", "7", "Non si impegna troppo."},
            {"Matematica", "9", "È molto portato per questa materia."},
            {"Storia", "7", "Potrebbe fare di più."},
            {"Geografia", "8", "Appassionato."},
            {"Inglese", "9", "Capace di sostenere dialoghi."},
            {"Scienze Motorie", "6", "Voto d'incoraggiamento."},
            {"Musica", "7", "Ha una certa passione per la materia."},
            {"Arte", "8", "Mostra creatività e interesse."},
            {"Informatica", "9", "Mostra grande abilità nell'uso degli strumenti digitali."},
            {"Filosofia", "7", "Ragiona bene, ma può approfondire."},
            {"Educazione Civica", "8", "Partecipe e attento alle tematiche sociali."}
        };;

        //posso fare velocemente per compilare la tabella

        //con questo metodo ogni parentesi graffa è una RIGA
        //gli elementi vanno nelle colonne separati dalle virgole

        Pagella alunnoTosto = new Pagella(giovanni, voti);
        alunnoTosto.datipagella();
        
    }
}
