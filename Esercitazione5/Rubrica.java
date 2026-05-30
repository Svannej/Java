package Esercitazione5;

import java.util.ArrayList;

public class Rubrica {
    
    ArrayList <Contatto> lista;

    //costruiamo la arraylist
    public Rubrica(){
        lista = new ArrayList<>();
    }

    public void aggiungi(Contatto c){
        lista.add(c);
    }

    public void rimuovi(int id){
        //mentre scorri una lista NON SI RIMUOVONO ELEMENTI
        //quindi, in questo caso eliminiamo il contatto e facciamo un return così non da problemi
        for (Contatto c : lista) {
            if(c.id == id){
                lista.remove(c);
                return;
            }
        }
    }

    public Contatto cerca(int id){
        for (Contatto c : lista) {
            if (c.id == id) {
                return c;
            }
        }

        System.out.println("ID NON ESISTENTE");

        return null;
    }

    public void visitaCognome(String cognInserito){
        boolean almenoUno = false;
        for (Contatto contatto : lista) {

            //QUI BISOGNA CONFRONTARE due stringhe
            //SEVERAMENTE VIETATO CONFRONTARE DUE STRINGHE CON ==

            if (contatto.cognome.equals(cognInserito)) {
                    System.out.println("----CONT CON COGNOME CERCATO-----");
                    System.out.println("nome: " + contatto.nome);
                    System.out.println("cognome: " + contatto.cognome);
                    System.out.println("cellulare: " + contatto.telefono);
                    System.out.println("email: " + contatto.email);
                    System.out.println("---------");
                    almenoUno = true;
                }
        }

        if (almenoUno == false) {
            System.out.println("Non è stato trovato alcun contatto con quel cognome");
        }
    }

    public void stampa(Contatto contatto){
        if (contatto == null) {
            System.out.println("Spiacente il contatto richiesto NON ESISTE");
            return;
        }
            System.out.println("----IL CONTATTO CERCATO-----");
            System.out.println("nome: " + contatto.nome);
            System.out.println("cognome: " + contatto.cognome);
            System.out.println("cellulare: " + contatto.telefono);
            System.out.println("email: " + contatto.email);
            System.out.println("---------");

    }
}
