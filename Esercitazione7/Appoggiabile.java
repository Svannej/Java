package Esercitazione7;


public sealed interface Appoggiabile permits Libro, Computer, Lampada, Penna, PortaPenne {
 
    //un'interfaccia sealed serve ad "etichettare" gli oggetti
    //in modo da dichiarare subito quali classi hanno il permesso
    //di IMPLEMENTARLA

}

record Libro(String titolo, String autore, int pagine) implements Appoggiabile{}

record Computer(String marca, String modello, int RAM) implements Appoggiabile{}

record Lampada(int Watt) implements Appoggiabile{}

record Penna(String colore) implements Appoggiabile{}

record PortaPenne(int capienza) implements Appoggiabile{}