package Esercitazione7;

public class Studente {
    
    public Studente(){}

    public void usa(Scrivania scrivania){

        for (Appoggiabile oggetto : scrivania.getOggetti()) {
            
            switch (oggetto) {
                case Libro libro:
                        System.out.println("- sta leggendo " + libro.titolo() + " di " + libro.autore() + " pagine: " + libro.pagine());
                    break;

                case Computer computer:
                        System.out.println("- si usa un pc " + computer.marca() + " modello " + computer.modello() + "con ram:"  + computer.RAM() + "GB");
                    break;
            
                case Lampada lamp:
                        System.out.println("- accende la lampada da Watt: " + lamp.Watt());
                    break;


                case Penna pen:
                        System.out.println("- si usa la penna di colore: " + pen.colore());
                    break;

                case PortaPenne pp:
                        System.out.println("- si usa il portaPenne di capienza" + pp.capienza());

                default:
                    break;
            }

        }
    }


}
