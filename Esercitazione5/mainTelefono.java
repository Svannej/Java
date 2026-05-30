package Esercitazione5;

public class mainTelefono {
    public static void main(String args[]){
        Contatto pietro = new Contatto(0, "Pietro", "Sermonti", "pieser@gmail.com", "40181");
        Contatto dario = new Contatto(1, "Dario", "Storti", "dasto@gmail.com", "4018123");
        
        Rubrica principale = new Rubrica();

        //aggiunzione contatti
        principale.aggiungi(pietro);
        principale.aggiungi(dario);
        
        //prova di ricercare i 2 contatti e stamparli
        Contatto contattoCercato = principale.cerca(0);
        principale.stampa(contattoCercato);
        contattoCercato = principale.cerca(1);
        principale.stampa(contattoCercato);
        
        //provo a rimuovere un contatto, cercarlo e stamparlo
        principale.rimuovi(0);
        contattoCercato = principale.cerca(0);
        //provando a stampare dice "mi dispiace ,il contatto NON ESISTE..."
        principale.stampa(contattoCercato);

        //lo riaggiungiamo
        principale.aggiungi(pietro);
        
        //cerchiamo qualcosa che non esiste
        //stampa ID NON ESISTENTE
        contattoCercato = principale.cerca(2);

        principale.visitaCognome("Storti");
        principale.visitaCognome("Storto");
        
    }
}
