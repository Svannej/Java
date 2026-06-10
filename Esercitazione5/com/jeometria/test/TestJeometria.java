package Esercitazione5.com.jeometria.test;

import Esercitazione5.com.jeometria.Rettangolo;
import Esercitazione5.com.jeometria.jeometria;

public class TestJeometria {
    public static void main(String[] args) {
        
        double base = 15;
        double altezza = 18;

        Rettangolo rettangolo = new Rettangolo(base, altezza);
        jeometria calcolatore = new jeometria();


        System.out.println("Misure scelte -> Base: " + rettangolo.getBase() + " | Altezza: " + rettangolo.getAltezza());

        System.out.println("Il rettangolo ha area: " + calcolatore.calcolaAreaRettangolo(base, altezza)  );
        System.out.println("Il rettangolo ha perimetro: " + calcolatore.calcolaPerimetroRettangolo(base, altezza)  );

    }
    

}
