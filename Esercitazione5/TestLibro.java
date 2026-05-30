package Esercitazione5;

public class TestLibro {
    public static void main(String args[]){

        Libro sigmos = new Libro(300, "Il Signore Delle Mosche", "thriller");
        Libro iceman = new Libro(245, "The way of the iceman", "vino mantovano");


        sigmos.stampa();
        iceman.stampa();
    }
}
