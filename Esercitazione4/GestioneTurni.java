package Esercitazione4;

import java.util.Random;
import java.time.DayOfWeek;


public class GestioneTurni {
    

    public DayOfWeek dammiGiornoDellaSettimna (){

        Random generatore = new Random();

        int numeroCasuale = generatore.nextInt(7) + 1;

        return switch (numeroCasuale) {
            case 1:
                yield DayOfWeek.MONDAY;

            case 2:
                yield DayOfWeek.TUESDAY;

            case 3:
                yield DayOfWeek.WEDNESDAY;

            case 4:
                yield DayOfWeek.THURSDAY;

            case 5:
                yield DayOfWeek.FRIDAY;

            case 6:
                yield DayOfWeek.SATURDAY;

            case 7:
                yield DayOfWeek.SUNDAY;

            default:
                throw new IllegalStateException("Errore");

        };

    }


}
