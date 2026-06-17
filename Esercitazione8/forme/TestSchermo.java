package Esercitazione8.forme;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TestSchermo {
    public static void main(String[] args) {

        System.out.println("INIZIO PROGRAMMA");
        Scanner mioScanner = new Scanner(System.in);

        //creo lo schermo
        Schermo gestore = new Schermo();

        double raggio = 0;
        
        Circle cerchioUno = null;
        try{
            
            System.out.println("Inserire Ragggio: ");
            raggio = mioScanner.nextDouble();
            cerchioUno = new Circle("Ciotola", raggio);

        } catch (InputMismatchException erroreRaggioInvalido){

            System.out.println("hai usato caratteri che non sono numeri? e io ti chiudo il programma");
            mioScanner.close();
            return;
        } catch (IllegalArgumentException erroreRaggioNegativo){
            System.out.println("Mi insersci un raggio non valido? e io ti chiudo il programma");
            return;
        }

        //poi per il resto capi funziona solo con il cerchio implementare il resto mi siddia




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
