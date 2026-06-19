package Esercitazione9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Scuola {
    public static void main(String[] args) {

    // 1. ECCO IL RECORD! Una sola riga che sostituisce 50 righe di codice standard.
    // Crea automaticamente una struttura immutabile con i campi richiesti.
    record Studente(String nome, String cognome, String matricola) {}

    Scanner scanner = new Scanner(System.in);    

    Collection <Studente> lista = new HashSet<>();


    boolean esci = false;
    
    while (esci == false) {
                
        //menù
        System.out.println("=== MENù ===");
        System.out.println("a : inserire nuovo utente");
        System.out.println("b : cercare studente in base a Nome e Cognome");
        System.out.println("c : cercare uno studente in base alla Matricola");
        System.out.println("d : cancellare uno studente in base alla matricola");
        System.out.println("e : stampare lista");
        System.out.println("f : cancellare lista");
        System.out.println("g : esci");

        String scelta = "";

        scelta = scanner.nextLine();

        switch (scelta) {
            case "a":
                
                System.out.println("inserire nome: ");
                String nome = scanner.nextLine();
                System.out.println("inserire cognome:");
                String cognome = scanner.nextLine();
                System.out.println("inserire matricola:");
                String matricola = scanner.nextLine();

                Studente nuovo = new Studente(nome, cognome, matricola);

                //in una hashmap gli elementi sono unici
                //se esiste uno studente con stesso nome cognome e matricola e
                //si prova a reinserire, semplicemente non viene inserito
                // e il "lista.add(nuovo)" restituisce false

                if(lista.add(nuovo) == false){
                    System.out.println("Inserimento non riuscito, Studente già presente nella lsita");
                }

                break;
        
            case "b":

                System.out.println("(ricerca) Inserire nome:");
                String nomeCerca = scanner.nextLine();
                System.out.println("(ricerca) Inserire cognome:");
                String cognomeCerca = scanner.nextLine();

                boolean trovato = false;

                for (Studente studente : lista) {
                    if (studente.nome().equals(nomeCerca) && studente.cognome().equals(cognomeCerca)) {
                        System.out.println("Lo studente cercato è: " + studente.nome() + " " + studente.cognome() + " con matricola " + studente.matricola());
                        trovato = true;
                        break;
                    }
                }
                if (trovato == false) {
                    System.out.println("Studente non trovato! non esiste nella lista");
                }

                break;

            
            case "c":

                System.out.println("Inserire matricola: ");
                String matricolaCerca = scanner.nextLine();
                boolean trovatoB = false;
                for (Studente studente : lista) {
                    if (studente.matricola().equals(matricolaCerca)) {
                        System.out.println("Lo studente cercato è : " + studente.nome + " " + studente.cognome + " " + studente.matricola);
                        trovatoB = true;
                        break;
                    }
                }

                if (trovatoB == false) {
                    System.out.println("Studente non trovato");
                }
                break;
            
            
            case "d":


                System.out.println("Inserire matricola: ");
                String matricolaElimina = scanner.nextLine();
                boolean nonEsiste = true;

                for (Studente studente : lista) {
                    if (studente.matricola().equals(matricolaElimina)) {
                        lista.remove(studente);
                        System.out.println("Lo studente è stato eliminato dalla lista");
                        nonEsiste = false;
                        break;
                    }

                }

                if (nonEsiste == true) {
                    System.out.println("Matricola non valida: studente non trovato");
                }

                break;
            
            
            
            case "e":
                if (!lista.isEmpty()) {
                    System.out.println("=== LISTA ===");
                    for (Studente studente : lista) {
                        System.out.println("====\n" + studente.nome + " " + studente.cognome + " " + studente.matricola + "\n");
                    }
                    
                }else{System.out.println("la lista è vuota");}
                break;
            
            
            case "f":
                lista.clear();
                System.out.println("Lista cancellata");
                break;
            
            case "g":

                esci = true;

                break;
            
            
                default:
                System.out.println("Valore non valido.");
                break;
        }

        
    }
    
    scanner.close();


    }
}
