package Esercitazione2;

public class Es4punto4 {
    public static void main(String args[]){
        Studente studente1 = new Studente("Pietro", "142841483982");
        Corso corso1 = new Corso("Programmazione", 9);

        System.out.println("Lo studente " + studente1.nome() + " matricola " + studente1.matricola() + " segue il corso di " + corso1.nomeCorso() + " CFU: " + corso1.cfu());
    }
}
