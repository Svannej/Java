package Esercitazione4;

import java.time.DayOfWeek;
import java.util.HashMap;

public class StatisticheTurniHash {
    

    public void stampaStatisticheHash(int numeroTurni){

        GestioneTurni generatore = new GestioneTurni();

        HashMap <DayOfWeek, Integer> mappaContatori = new HashMap<>();
        
        //inizializzo tutti i contatori a 0
        //DayOfWeek.values() crea un array con MONDAY,TUESDATI ecc...
        for (DayOfWeek giornoDellaSettimana : DayOfWeek.values()) {
            mappaContatori.put(giornoDellaSettimana, 0);
        }
        while (numeroTurni > 0) {
            
            DayOfWeek giornoGenerato = generatore.dammiGiornoDellaSettimna();
            int valoreAttuale;


            switch (giornoGenerato) {

                case MONDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;

                case TUESDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;   

                case WEDNESDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;   

                case THURSDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;   

                case FRIDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;  
                    
                case SATURDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;   


                case SUNDAY:
                    valoreAttuale = mappaContatori.get(giornoGenerato);
                    mappaContatori.put(giornoGenerato, valoreAttuale + 1);
                    break;   

            
                default:
                    break;
            }


            numeroTurni --;
        }
        
        System.out.println("---STATISTICHE---");
        System.out.println("LUNEDì: " + mappaContatori.get(DayOfWeek.MONDAY));
        System.out.println("Martedì: " + mappaContatori.get(DayOfWeek.TUESDAY));
        System.out.println("mecoled: " + mappaContatori.get(DayOfWeek.WEDNESDAY));
        System.out.println("iovis: " + mappaContatori.get(DayOfWeek.THURSDAY));
        System.out.println("venerdox: " + mappaContatori.get(DayOfWeek.FRIDAY));
        System.out.println("shabat: " + mappaContatori.get(DayOfWeek.SATURDAY));
        System.out.println("domingo: " + mappaContatori.get(DayOfWeek.SUNDAY));

        
    }


}
