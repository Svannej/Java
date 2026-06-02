package Esercitazione5.com.jeometria;

public class jeometria {
    
    //questa classe deve dipendere dalla classe rettangolo
    //devo creare una variabile d'istanza della classe rettangolo

    private Rettangolo ilRettangolo;



    public double calcolaPerimetroRettangolo(double base, double altezza){

        ilRettangolo = new Rettangolo(base, altezza);

        return ilRettangolo.calcolaPerimetro();
    }

    public double calcolaAreaRettangolo(double base, double altezza){

        ilRettangolo = new Rettangolo(base, altezza);

        return ilRettangolo.calcolaArea();


    }


}
