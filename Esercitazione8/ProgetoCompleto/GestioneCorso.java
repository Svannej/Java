package Esercitazione8.ProgetoCompleto;

import java.util.Collection;
import java.util.ArrayList;


public class GestioneCorso {
    
    private Collection <Persona> Gestore;

    public GestioneCorso(){
        this.Gestore = new ArrayList<>();
    }


    public void aggiungi(Persona x){
        if (Gestore.size() < 100) {
            Gestore.add(x);
        }
        else{
            throw new IllegalStateException("Raggiunto massimo di persone aggiungibili");
        }
    }

    
    public void salarioTot(){
        double tot = 0;

        for (Persona persona : Gestore) {
            if (persona instanceof Professore) {

                //dobbiamo fare il casting
                Professore prof = (Professore) persona;
                tot += prof.getStipendio();
            }
        }

        System.out.println("Il Salario totale dei professori ammonta a: " + tot);
    }


    public void quote(){
        double tot = 0;

        for(Persona persona : Gestore){

            if (persona instanceof Studente) {
                //casting
                Studente stu = (Studente) persona;
                tot += stu.getContributo();
            }

        }
        System.out.println("Il contributo totale versato dagli studenti è paria a: " + tot);
    }


    public void stampatutto(){
        for (Persona persona : Gestore) {
            System.out.println("== nome: " + persona.nome + " cognome: " + persona.cognome + " == \n===================");
        }
    }


}
