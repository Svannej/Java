package Esercitazione7.forme;

public class TestForme {

    public static void main(String[] args) {
        
        System.out.println("--- TEST CREAZIONE FORME ---");
        Circle cerchio = new Circle("Moneta", 10.0);
        Rectangle rettangolo = new Rectangle("Tavolo", 100.0, 50.0);

        // Disegniamo i dati iniziali
        cerchio.draw();
        rettangolo.draw();

        System.out.println("\n--- TEST SCALATURA (Fattore 2.0 = Raddoppio) ---");
        cerchio.scale(2.0);
        rettangolo.scale(2.0);

        // Disegniamo di nuovo per vedere le modifiche
        cerchio.draw();
        rettangolo.draw();

        System.out.println("\n--- VERIFICA CLASSE ASTRATTA ---");
        /* * Se togli il commento alla riga sottostante, Java darà un ERRORE ROSSO 
         * dicendo "Cannot instantiate the type Shape". 
         * Questo dimostra che la classe astratta funziona perfettamente!
         */
        
        // Shape formaFantasma = new Shape("Forma Impossibile");
    }
    
}