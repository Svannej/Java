package Esercitazione4;

import java.time.DayOfWeek;

public class TestGestioneTurni {

    public static void main(String args[]){

        System.out.println("ILGIORNOSCELTO");

        GestioneTurni turno = new GestioneTurni();

        DayOfWeek turnoAssegnato = turno.dammiGiornoDellaSettimna();

        System.out.println("é proprio: " + turnoAssegnato);

        System.out.println("ORA LE STATISTICHE");

        StatisticheTurni stat = new StatisticheTurni();

        stat.stampaStatistiche(50);

    }
}
