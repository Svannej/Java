package Esercitazione7;

public class TestScrivania {
    public static void main(String[] args) {
        Scrivania miaScrivania = new Scrivania();

        miaScrivania.appoggia(new Computer("MSI", "Minestrone 5z", 32));
        miaScrivania.appoggia(new Libro("The Way of the ICEMAN", "Wim Hof", 300));
        miaScrivania.appoggia(new Lampada(15));
        miaScrivania.appoggia(new Penna("Rossa"));
        miaScrivania.appoggia(new PortaPenne(6));


        //un nuovo studente utilizzatore

        Studente Piero = new Studente();

        Piero.usa(miaScrivania);



    }
}
