package Esercitazione4;

import java.time.DayOfWeek;

public class StatisticheTurni {
    

    public void stampaStatistiche(int numeroTurni){

        GestioneTurni generatore = new GestioneTurni();
        
        int numeroInizioSettimana = 0;
        int numeroCentroSettimana = 0;
        int numeroFineSettimana = 0;
        int numeroWeekend = 0;

        while (numeroTurni > 0) {
            
            DayOfWeek giornoGenerato = generatore.dammiGiornoDellaSettimna();

            switch (giornoGenerato) {
                case MONDAY :
                    numeroInizioSettimana++;
                    break;
                case TUESDAY:
                    numeroCentroSettimana++;
                    break;
                case WEDNESDAY:
                    numeroCentroSettimana++;

                case THURSDAY:
                    numeroCentroSettimana++;
                    break;
                
                case FRIDAY:
                    numeroFineSettimana++;
                    break;

                case SATURDAY:
                    numeroWeekend++;
                    break;

                case SUNDAY:
                    numeroWeekend++;
                    break;

                default:
                    break;
            }

            numeroTurni --;
        }
        
        System.out.println("---STATISTICHE---");
        System.out.println("inizio settimana (LUNEDì): " + numeroInizioSettimana);
        System.out.println("centro settimana (mar-gio):" + numeroCentroSettimana);
        System.out.println("fine settimana(ven): " + numeroFineSettimana);
        System.out.println("weekend (sab-dom)" + numeroWeekend);
        
    }


}
