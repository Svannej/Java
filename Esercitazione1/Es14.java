package Esercitazione1;

public class Es14 {
    public static void main(String args[]){

        //definisco questi due film
        Film film1 = new Film("WolfWallStreet", "soldi", 50);
        Film film2 = new Film("IoSonoLeggenda", "zombi", 100);

        //richiamo il metodo
        film1.stampaDettagli();
        film2.stampaDettagli();

    }
}
