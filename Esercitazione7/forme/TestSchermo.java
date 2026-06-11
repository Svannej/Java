package Esercitazione7.forme;

public class TestSchermo {
    public static void main(String[] args) {
        System.out.println("INIZIO PROGRAMMA");

        //creo lo schermo

        Schermo gestore = new Schermo();

        Circle cerchioUno = new Circle("Ciotola", 3.14);
        Rectangle rettangoloUno = new Rectangle("Tavolo", 48, 16);
        Square quadratoUno = new Square("Tovaglietta", 12);


        gestore.aggiungiForma(cerchioUno);
        gestore.aggiungiForma(rettangoloUno);
        gestore.aggiungiForma(quadratoUno);

        gestore.disegna();

        gestore.scalaTutto(2);

        gestore.disegna();

        gestore.rimuoviForma(quadratoUno);
        gestore.rimuoviForma(cerchioUno);

        gestore.disegna();




    }
}
