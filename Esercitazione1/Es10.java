//Al posto di chiamarlo "TestNazioni" l'ho chiamato "Es10" cambia niente.

package Esercitazione1;

//creo il file Nazione.java per definire la classe Nazione con le variabili d'istanza
public class Es10 {
    public static void main(String args[]){
        //creo un oggetto di tipo "Nazione"
        Nazione italia = new Nazione("italia", "Roma", 60000000);
        Nazione giappone = new Nazione("giappone", "Tokyo", 167);
        Nazione caca = new Nazione("pace", "fratelli", 1);

        System.out.println("Nazione 1: " + italia.nome + " capitale: " + italia.capitale + " popo: " + italia.popolazione);
        System.out.println("Nazione 2: " + giappone.nome + " capitale: " + giappone.capitale + " popo: " + giappone.popolazione);
        System.out.println("Nazione 3: " + caca.nome + " capitale: " + caca.capitale + " popo: " + caca.popolazione);

    }
}


