package Esercitazione5.com.jimmobiliare;

// Importiamo correttamente le classi dal pacchetto dei dati
import Esercitazione5.com.jimmobiliare.dati.Appartamento;
import Esercitazione5.com.jimmobiliare.dati.Garage;
import Esercitazione5.com.jimmobiliare.dati.Palazzo;

public class Jmmobiliare {
    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println("   BENVENUTI ALL'AGENZIA JMMOBILIARE     ");
        System.out.println("=========================================\n");
        
        // -----------------------------------------------------------------
        // 1. CREAZIONE IMMOBILI SINGOLI
        // Ordine parametri: Nome, Indirizzo, Prezzo, MetriQuadri, Vani, Piano
        // -----------------------------------------------------------------
        System.out.println("--- Caricamento nuovi appartamenti... ---");
        Appartamento app1 = new Appartamento("APP-001", 250000.0, 40.5 , "Via Roma 10, Milano", 5, 4);
        Appartamento app2 = new Appartamento("APP-002", 320000.0, 55.0 , "Via Roma 12, Milano", 4, 3);
        
        // Ordine parametri: Nome, Indirizzo, Prezzo, MetriQuadri, PostiAuto
        System.out.println("--- Caricamento nuovi garage... ---");
        Garage box1 = new Garage("BOX-099", 5500.5, 15.8, "Via Milano 5, Roma", 6);
        Garage box2 = new Garage("BOX-100", 55842.4, 60.0, "Via Milano 6, Roma", 10);


        // -----------------------------------------------------------------
        // 2. CREAZIONE DEL PALAZZO (COMPOSIZIONE)
        // Ordine parametri: Nome, Indirizzo, Prezzo, MetriQuadri
        // -----------------------------------------------------------------
        System.out.println("--- Creazione complesso residenziale... ---");
        Palazzo grattacielo = new Palazzo("PAL-500", "Piazza del Duomo 1, Milano", 5000000.0, 800.0);
        
        // Inseriamo gli appartamenti dentro il palazzo
        grattacielo.aggiungiAppartamento(app1);
        grattacielo.aggiungiAppartamento(app2);


        // -----------------------------------------------------------------
        // 3. STAMPA DEL CATALOGO (OUTPUT)
        // -----------------------------------------------------------------
        System.out.println("\n=========================================");
        System.out.println("       CATALOGO SINGOLI IMMOBILI         ");
        System.out.println("=========================================");
        
        // Test di stampa degli oggetti singoli
        System.out.println(app1);
        System.out.println(app2);
        System.out.println("-----------------------------------------");
        System.out.println(box1);
        System.out.println(box2);

        System.out.println("\n=========================================");
        System.out.println("      DETTAGLIO COMPLESSI IMMOBILIARI    ");
        System.out.println("=========================================");
        
        // Test di stampa del palazzo con la lista interna di appartamenti
        System.out.println(grattacielo);
        
        System.out.println("\n=========================================");
        System.out.println("             TEST COMPLETATO             ");
        System.out.println("=========================================");
    }
}